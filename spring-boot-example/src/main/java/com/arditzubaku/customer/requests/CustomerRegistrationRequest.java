package com.arditzubaku.customer.requests;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
