package com.example.terminalquest;

import com.example.terminalquest.config.AppConfig;
import com.example.terminalquest.service.ResponseService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResponseServiceTest {
    private final ResponseService service = new ResponseService(new AppConfig("Quest \"Demo\"", 8080, "INFO"));

    @Test
    void createsMachineReadableResponses() {
        assertEquals("{\"status\":\"UP\"}", service.health());
        assertEquals("{\"message\":\"Hello from Quest \\\"Demo\\\"!\"}", service.hello());
        assertEquals("{\"application\":\"Quest \\\"Demo\\\"\",\"version\":\"1.0.0\",\"runtime\":\"Java\"}", service.info());
    }
}
