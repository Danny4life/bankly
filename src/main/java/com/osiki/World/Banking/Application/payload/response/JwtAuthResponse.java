package com.osiki.World.Banking.Application.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtAuthResponse {
    private Long id;

    private String firstName;

    private String lastName;

    private String profilePicture;

    private String email;

    private String gender;

   private String accessToken;

    private String tokenType = "Bearer";
}
