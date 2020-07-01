package com.example.demo.controller;

import com.example.demo.dto.ServerTimeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerTimeController {
    @GetMapping("/time")
    public ServerTimeDTO time() {
        return new ServerTimeDTO();
    }
}