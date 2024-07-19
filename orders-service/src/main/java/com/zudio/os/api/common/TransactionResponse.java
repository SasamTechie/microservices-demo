package com.zudio.os.api.common;

import com.zudio.os.api.entity.Orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {

	private Orders orders;

	private double amount;

	private String transactionId;

	private String message;

}
