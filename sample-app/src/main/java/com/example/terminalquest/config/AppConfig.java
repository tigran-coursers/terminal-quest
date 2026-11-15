package com.example.terminalquest.config;

import java.util.Locale;
import java.util.Map;

public record AppConfig(String appName, int serverPort, String logLevel) {
    public static AppConfig fromEnvironment(Map<String, String> environment) {
        String name = environment.getOrDefault("APP_NAME", "Terminal Quest").trim();
        if (name.isEmpty() || name.length() > 80 || name.chars().anyMatch(Character::isISOControl)) {
            throw new IllegalArgumentException("APP_NAME must contain 1-80 printable characters");
        }

        String portText = environment.getOrDefault("SERVER_PORT", "8080").trim();
        int port;
        try {
            port = Integer.parseInt(portText);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("SERVER_PORT must be a number from 1 to 65535");
        }
        if (port < 1 || port > 65535) {
            throw new IllegalArgumentException("SERVER_PORT must be a number from 1 to 65535");
        }

        String level = environment.getOrDefault("LOG_LEVEL", "INFO").trim().toUpperCase(Locale.ROOT);
        if (!level.equals("DEBUG") && !level.equals("INFO") && !level.equals("WARN") && !level.equals("ERROR")) {
            throw new IllegalArgumentException("LOG_LEVEL must be DEBUG, INFO, WARN, or ERROR");
        }
        return new AppConfig(name, port, level);
    }
}
