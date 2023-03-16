package com.arditzubaku.mot;

import com.arditzubaku.email.EmailService;

public class MOTService {
private EmailService emailService;

    public MOTService(EmailService emailService) {
        this.emailService = emailService;
    }
}
