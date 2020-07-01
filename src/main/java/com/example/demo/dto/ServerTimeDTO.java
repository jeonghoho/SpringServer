package com.example.demo.dto;

import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class ServerTimeDTO {
    private LocalDateTime serverTime;

    public ServerTimeDTO() {
        this.serverTime = LocalDateTime.now();
    }
}