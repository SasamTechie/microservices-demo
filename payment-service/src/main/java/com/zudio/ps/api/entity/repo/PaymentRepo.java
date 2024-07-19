package com.zudio.ps.api.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zudio.ps.api.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}
