package com.example.demo2.dao;

import com.example.demo2.bean.DeclarationFacture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DeclarationFactureDao extends JpaRepository<DeclarationFacture,Long> {
    DeclarationFacture findByTypeFactureCode(String code);
    int deleteByTypeFactureCode(String code);
}
