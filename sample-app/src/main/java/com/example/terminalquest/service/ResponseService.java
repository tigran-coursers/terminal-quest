package com.example.terminalquest.service;

import com.example.terminalquest.config.AppConfig;

public final class ResponseService {
    private final AppConfig config;

    public ResponseService(AppConfig config) {
        this.config = config;
    }

    public String health() {
        return "{\"status\":\"UP\"}";
    }

    public String hello() {
        return "{\"message\":\"Hello from " + escape(config.appName()) + "!\"}";
    }

    public String info() {
        return "{\"application\":\"" + escape(config.appName())
                + "\",\"version\":\"1.0.0\",\"runtime\":\"Java\"}";
    }

    private static String escape(String value) {
        StringBuilder result = new StringBuilder();
        for (char character : value.toCharArray()) {
            switch (character) {
                case '"' -> result.append("\\\"");
                case '\\' -> result.append("\\\\");
                default -> result.append(character);
            }
        }
        return result.toString();
    }
}
