package com.amigocodes.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {


}
