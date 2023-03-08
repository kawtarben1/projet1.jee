package com.example.demo2.Service;

import com.example.demo2.bean.CategorieComptable;
import com.example.demo2.bean.DeclarationFacture;
import com.example.demo2.dao.DeclarationFactureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclarationFactureService {
    @Autowired
    private DeclarationFactureDao declarationFactureDao;

    public int save(DeclarationFacture declarationFacture){
        if (findByTypeFactureCode(declarationFacture.getTypeFacture().getCode()) != null) {
            return -1;
        }else{
            declarationFactureDao.save(declarationFacture);
            return 1;
        }
    }

    public DeclarationFacture findByTypeFactureCode(String code) {
        return declarationFactureDao.findByTypeFactureCode(code);
    }

    public int deleteByTypeFactureCode(String code) {
        return declarationFactureDao.deleteByTypeFactureCode(code);
    }

    public List<DeclarationFacture> findAll() {
        return declarationFactureDao.findAll();
    }
}
