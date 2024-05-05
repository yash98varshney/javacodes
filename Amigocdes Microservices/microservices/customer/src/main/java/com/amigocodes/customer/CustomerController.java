package com.amigocodes.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public record CustomerController(CustomerService customerService) {

    private static final Logger LOGGER= LoggerFactory.getLogger(CustomerController.class);

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){

        LOGGER.info("new Customer Registration {}",customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }
}
