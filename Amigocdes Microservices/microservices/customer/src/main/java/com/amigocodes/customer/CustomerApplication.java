package com.amigocodes.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient  //making Eureka client using this
@EnableFeignClients(
        basePackages = "com.amigocodes.clients"
)
public class CustomerApplication {
    public static void main(String[] args){
        SpringApplication.run(CustomerApplication.class,args);
    }
}
