package com.projects.MiniBank.dto;

import lombok.Data;

@Data
public class SignUpDto {
    private String email;
    private String password;
    private String role;
}
