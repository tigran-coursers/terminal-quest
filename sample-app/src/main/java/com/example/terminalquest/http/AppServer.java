package com.example.terminalquest.http;

import com.example.terminalquest.config.AppConfig;
import com.example.terminalquest.service.ResponseService;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public final class AppServer {
    private static final Logger LOGGER = Logger.getLogger(AppServer.class.getName());
    private final HttpServer server;

    public AppServer(AppConfig config) throws IOException {
        this.server = HttpServer.create(new InetSocketAddress("127.0.0.1", config.serverPort()), 0);
        ResponseService responses = new ResponseService(config);
        server.createContext("/health", exchange -> respond(exchange, "/health", responses.health()));
        server.createContext("/hello", exchange -> respond(exchange, "/hello", responses.hello()));
        server.createContext("/info", exchange -> respond(exchange, "/info", responses.info()));
        server.createContext("/", exchange -> send(exchange, 404, "{\"error\":\"Not found\"}"));
        server.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
    }

    public void start() {
        server.start();
        LOGGER.info("Application started at http://127.0.0.1:" + server.getAddress().getPort());
    }

    public void stop() {
        LOGGER.info("Stopping application");
        server.stop(2);
    }

    private static void respond(HttpExchange exchange, String expectedPath, String body) throws IOException {
        if (!exchange.getRequestURI().getPath().equals(expectedPath)) {
            send(exchange, 404, "{\"error\":\"Not found\"}");
            return;
        }
        if (!exchange.getRequestMethod().equals("GET")) {
            exchange.getResponseHeaders().set("Allow", "GET");
            send(exchange, 405, "{\"error\":\"Method not allowed\"}");
            return;
        }
        send(exchange, 200, body);
    }

    private static void send(HttpExchange exchange, int status, String body) throws IOException {
        try (exchange) {
            LOGGER.info(exchange.getRequestMethod() + " " + exchange.getRequestURI().getPath() + " -> " + status);
            byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "application/json; charset=utf-8");
            exchange.sendResponseHeaders(status, bytes.length);
            exchange.getResponseBody().write(bytes);
        }
    }
}
