package com.zudio.os.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zudio.os.api.common.Payment;
import com.zudio.os.api.common.TransactionRequest;
import com.zudio.os.api.common.TransactionResponse;
import com.zudio.os.api.entity.Orders;
import com.zudio.os.api.repo.OrdersRepo;

@Service
public class OrdersService {

	@Autowired

	private OrdersRepo ordersRepo;

	@Autowired

	private RestTemplate template;

	public TransactionResponse saveOrders(TransactionRequest request) {
		String message = "";
		Orders orders = request.getOrders();
		Payment payment = request.getPayment();
		payment.setOrderId(orders.getId());
		payment.setAmount(orders.getPrice());
		Payment paymentResponse = template.postForObject("http://localhost:2001/payment/savePayment", payment,
				Payment.class);
		message = paymentResponse.getPaymentStatus().equals("success") ? "api added succesfully"
				: "api failure prduct added to cart";
		ordersRepo.save(orders);
		return new TransactionResponse(orders, paymentResponse.getAmount(), paymentResponse.getTransactionId(),
				message);

	}

	public List<Orders> getAllOrders() {

		return ordersRepo.findAll();
	}

}
