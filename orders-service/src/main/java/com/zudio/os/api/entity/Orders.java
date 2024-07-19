package com.zudio.os.api.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "oneplus_orders")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	@Id

	private int id;

	private String name;

	private int quantity;

	private double price;

}
