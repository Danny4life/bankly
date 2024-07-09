package com.osiki.World.Banking.Application.service;

import com.osiki.World.Banking.Application.payload.response.BankResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface GeneralUserService {
    ResponseEntity<BankResponse<String>> uploadProfilePics(Long id, MultipartFile multipartFile);
}
