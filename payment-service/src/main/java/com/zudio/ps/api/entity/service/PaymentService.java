package com.zudio.ps.api.entity.service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zudio.ps.api.entity.Payment;
import com.zudio.ps.api.entity.repo.PaymentRepo;

@Service
public class PaymentService {

	@Autowired

	private PaymentRepo paymentRepo;

	public Payment doPayment(Payment payment) {

		payment.setTransactionId(UUID.randomUUID().toString());
		payment.setTransactionId(paymentProcessing());
		return paymentRepo.save(payment);

	}

	public List<Payment> getAllPayments() {

		return paymentRepo.findAll();
	}

	public String paymentProcessing() {

		return new Random().nextBoolean() ? "suceess" : "failure";
	}

}
