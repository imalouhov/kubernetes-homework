package demo.kubernetes.homework.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HealthController {

    @GetMapping("/")
    public ResponseEntity<String> test() {
        log.info("Method test called.");
        return ResponseEntity.ok("Test");
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        log.info("Method health called.");
        return ResponseEntity.ok("Health");
    }
}
