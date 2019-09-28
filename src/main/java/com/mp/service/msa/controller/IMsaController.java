package com.mp.service.msa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/msa")
public interface IMsaController {
    @GetMapping(value = "/status")
    public ResponseEntity<String> getAppStatus();
}
