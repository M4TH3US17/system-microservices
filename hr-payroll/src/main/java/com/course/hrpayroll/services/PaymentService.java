package com.course.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.course.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Matheus Dalvino", 200.00, days);
	}
}
