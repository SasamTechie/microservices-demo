package com.zudio.os.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zudio.os.api.common.TransactionRequest;
import com.zudio.os.api.common.TransactionResponse;
import com.zudio.os.api.entity.Orders;
import com.zudio.os.api.service.OrdersService;

@RestController
@RequestMapping("/order")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	@PostMapping("/createOrder")

	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {

		return ordersService.saveOrders(request);
	}

	@GetMapping("/getAllOrders")
	public List<Orders> getAllOrders() {

		return ordersService.getAllOrders();
	}

}
