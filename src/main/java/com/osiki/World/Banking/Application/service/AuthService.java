package com.osiki.World.Banking.Application.service;

import com.osiki.World.Banking.Application.payload.request.LoginRequest;
import com.osiki.World.Banking.Application.payload.request.UserRequest;
import com.osiki.World.Banking.Application.payload.response.ApiResponse;
import com.osiki.World.Banking.Application.payload.response.BankResponse;
import com.osiki.World.Banking.Application.payload.response.JwtAuthResponse;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    BankResponse registerUser(UserRequest userRequest);

    ResponseEntity<ApiResponse<JwtAuthResponse>>
    loginUser(LoginRequest loginRequest);
}
