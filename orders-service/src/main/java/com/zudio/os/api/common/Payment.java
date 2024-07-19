package com.zudio.os.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Payment {

	private int paymentId;

	private String paymentStatus;

	private String transactionId;

	private int orderId;

	private double amount;

}
