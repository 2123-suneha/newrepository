package com.example.service;

import java.util.List;

import com.example.entity.Payment;

public interface PaymentService {
	List<Payment> showPayment();
	String addPayment(int policyId, String modeOfPayment, int paymentId);

}
