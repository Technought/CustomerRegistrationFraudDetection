package com.technought.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
