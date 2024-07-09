package com.osiki.World.Banking.Application.service;

import com.osiki.World.Banking.Application.payload.request.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
