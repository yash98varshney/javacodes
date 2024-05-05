package com.amigocodes.fraud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository){
        this.fraudCheckHistoryRepository=fraudCheckHistoryRepository;
    }
    public boolean isFraudulentCustomer(Integer cutomerId){
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(cutomerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
