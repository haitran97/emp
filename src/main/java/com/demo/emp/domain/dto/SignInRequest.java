package com.demo.emp.domain.dto;

import lombok.Data;

@Data
public class SignInRequest {
    private String loginId;
    private String password;
}

