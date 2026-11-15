package com.example.terminalquest;

import com.example.terminalquest.config.AppConfig;
import com.example.terminalquest.http.AppServer;
import com.example.terminalquest.logging.AppLogger;

public final class Application {
    private Application() { }

    public static void main(String[] args) {
        try {
            AppConfig config = AppConfig.fromEnvironment(System.getenv());
            AppLogger.configure(config.logLevel());
            AppServer server = new AppServer(config);
            Runtime.getRuntime().addShutdownHook(new Thread(server::stop, "shutdown-hook"));
            server.start();
        } catch (IllegalArgumentException exception) {
            System.err.println("Configuration error: " + exception.getMessage());
            System.exit(2);
        } catch (Exception exception) {
            System.err.println("Startup error: " + exception.getMessage());
            System.exit(1);
        }
    }
}
