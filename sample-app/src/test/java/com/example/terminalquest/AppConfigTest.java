package com.example.terminalquest;

import com.example.terminalquest.config.AppConfig;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppConfigTest {
    @Test
    void usesDefaults() {
        assertEquals(new AppConfig("Terminal Quest", 8080, "INFO"), AppConfig.fromEnvironment(Map.of()));
    }

    @Test
    void readsOverrides() {
        assertEquals(new AppConfig("My App", 9090, "DEBUG"),
                AppConfig.fromEnvironment(Map.of("APP_NAME", " My App ", "SERVER_PORT", "9090", "LOG_LEVEL", "debug")));
    }

    @Test
    void rejectsInvalidValues() {
        assertThrows(IllegalArgumentException.class, () -> AppConfig.fromEnvironment(Map.of("SERVER_PORT", "0")));
        assertThrows(IllegalArgumentException.class, () -> AppConfig.fromEnvironment(Map.of("SERVER_PORT", "abc")));
        assertThrows(IllegalArgumentException.class, () -> AppConfig.fromEnvironment(Map.of("APP_NAME", " ")));
        assertThrows(IllegalArgumentException.class, () -> AppConfig.fromEnvironment(Map.of("LOG_LEVEL", "TRACE")));
    }
}
