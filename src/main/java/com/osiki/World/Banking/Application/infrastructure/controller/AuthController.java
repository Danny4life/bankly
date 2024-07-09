package com.osiki.World.Banking.Application.infrastructure.controller;

import com.osiki.World.Banking.Application.payload.request.LoginRequest;
import com.osiki.World.Banking.Application.payload.request.UserRequest;
import com.osiki.World.Banking.Application.payload.response.ApiResponse;
import com.osiki.World.Banking.Application.payload.response.BankResponse;
import com.osiki.World.Banking.Application.payload.response.JwtAuthResponse;
import com.osiki.World.Banking.Application.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register-user")
    public BankResponse createUserAccount(@Valid @RequestBody UserRequest
                                                      userRequest){

        return authService.registerUser(userRequest);
    }

    @PostMapping("/login-user")
    public ResponseEntity<ApiResponse<JwtAuthResponse>> loginUser(@Valid
                                                                  @RequestBody LoginRequest loginRequest){

        return authService.loginUser(loginRequest);

    }
}
