package com.zudio.os.api.common;

import com.zudio.os.api.entity.Orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {

	private Orders orders;

	private Payment payment;

}
