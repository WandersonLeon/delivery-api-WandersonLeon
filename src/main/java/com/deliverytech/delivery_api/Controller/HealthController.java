package com.deliverytech.delivery_api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.Map;

@RestController 
public class HealthController {
    
    @GetMapping("/health")
    public Map<String, String> checkHealth() {
        return Map.of(
            "status", "Tudo em cima",
            "timestamp", LocalDateTime.now().toString(),
            "Service", "Delivery API"
        );

    }
}
