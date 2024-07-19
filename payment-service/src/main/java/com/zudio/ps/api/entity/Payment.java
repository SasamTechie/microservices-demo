package com.zudio.ps.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oneplus_payments")
public class Payment {
	@Id
	@GeneratedValue
	private int paymentId;

	private String paymentStatus;

	private String transactionId;

	private int orderId;

	private double amount;

}
