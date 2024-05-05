package com.amigocodes.customer;

import com.amigocodes.clients.fraud.FraudCheckResponse;
import com.amigocodes.clients.fraud.FraudClient;
import com.amigocodes.clients.notification.NotificationClient;
import com.amigocodes.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CustomerRepository customerRepository;

    private FraudClient fraudClient;

    private NotificationClient notificationClient;
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer=Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.saveAndFlush(customer);
//
//        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
//                "http://FRAUD/api/v1/fraud-check{cutomerId}",
//                FraudCheckResponse.class,
//                customer.getId()
//        );

        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

        if (fraudCheckResponse.isFraudster()){
            throw new IllegalStateException("fraudster");
        }

        notificationClient.sendNotification(
                new NotificationRequest(
                        customer.getId(),
                        customer.getEmail(),
                        String.format("Hi %s , welcome ...",customer.getFirstName())
                )
        );



    }


}
