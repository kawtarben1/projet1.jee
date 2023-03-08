package com.example.demo2.Service;

import com.example.demo2.bean.DemandeDeclaration;
import com.example.demo2.bean.PaymentDeclaration;
import com.example.demo2.dao.PaymentDeclarationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentDeclarationService {
    @Autowired
    private PaymentDeclarationDao paymentDeclarationDao;

    public int save(PaymentDeclaration paymentDeclaration){
        if (findByType(paymentDeclaration.getType()) != null) {
            return -1;
        }else{
            paymentDeclarationDao.save(paymentDeclaration);
            return 1;
        }
    }

    public PaymentDeclaration findByType(String type) {
        return paymentDeclarationDao.findByType(type);
    }

    public int deleteByType(String type) {
        return paymentDeclarationDao.deleteByType(type);
    }

    public List<PaymentDeclaration> findAll() {
        return paymentDeclarationDao.findAll();
    }
}
