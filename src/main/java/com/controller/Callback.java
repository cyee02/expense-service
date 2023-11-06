package com.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
/* Callback handles the return response from external application */
public class Callback {
    @PostMapping("/callback")
    public ResponseEntity<String> main(@RequestBody String args) {
        log.info("Received callback: {}", args);
        return ResponseEntity.ok("Message successfully received");
    }
}
