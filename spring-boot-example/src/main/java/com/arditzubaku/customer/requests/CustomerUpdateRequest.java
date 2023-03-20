package com.arditzubaku.customer.requests;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
