package com.example.demo2.Service;

import com.example.demo2.bean.CategorieDeclaration;
import com.example.demo2.bean.DemandeDeclaration;
import com.example.demo2.dao.DemandeDeclarationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandeDeclarationService {
    @Autowired
    private DemandeDeclarationDao demandeDeclarationDao;

    public int save(DemandeDeclaration demandeDeclaration){
        if (findByCategorieDeclarationCode(demandeDeclaration.getCategorieDeclaration().getCode()) != null) {
            return -1;
        }else{
            demandeDeclarationDao.save(demandeDeclaration);
            return 1;
        }
    }

    public DemandeDeclaration findByCategorieDeclarationCode(String code) {
        return demandeDeclarationDao.findByCategorieDeclarationCode(code);
    }

    public int deleteByCategorieDeclarationCode(String code) {
        return demandeDeclarationDao.deleteByCategorieDeclarationCode(code);
    }

    public List<DemandeDeclaration> findAll() {
        return demandeDeclarationDao.findAll();
    }
}
