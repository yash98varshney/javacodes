package com.springpractice.springpractice.PaymentPractice.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpractice.springpractice.PaymentPractice.Dao.paymentDao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Service
public class paymentServiceImpl implements paymentService{

    @Autowired
    private paymentDao dao;
}
