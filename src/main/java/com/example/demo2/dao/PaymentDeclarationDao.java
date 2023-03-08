package com.example.demo2.dao;

import com.example.demo2.bean.PaymentDeclaration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentDeclarationDao extends JpaRepository<PaymentDeclaration,Long> {
    PaymentDeclaration findByType(String type);
    int deleteByType(String type);

}
