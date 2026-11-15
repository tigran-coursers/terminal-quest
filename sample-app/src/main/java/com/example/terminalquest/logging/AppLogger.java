package com.example.terminalquest.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class AppLogger {
    private AppLogger() { }

    public static void configure(String requestedLevel) {
        Level level = switch (requestedLevel) {
            case "DEBUG" -> Level.FINE;
            case "WARN" -> Level.WARNING;
            case "ERROR" -> Level.SEVERE;
            default -> Level.INFO;
        };
        Logger root = Logger.getLogger("");
        root.setLevel(level);
        for (var handler : root.getHandlers()) {
            handler.setLevel(level);
        }
        if (root.getHandlers().length == 0) {
            ConsoleHandler handler = new ConsoleHandler();
            handler.setLevel(level);
            root.addHandler(handler);
        }
    }
}
