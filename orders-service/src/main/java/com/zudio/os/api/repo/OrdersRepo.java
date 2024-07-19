package com.zudio.os.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zudio.os.api.entity.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer> {

}
