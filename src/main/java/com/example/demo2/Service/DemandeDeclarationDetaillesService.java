package com.example.demo2.Service;

import com.example.demo2.bean.DeclarationFacture;
import com.example.demo2.bean.DemandeDeclarationDetailles;
import com.example.demo2.dao.DemandeDeclarationDetaillesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DemandeDeclarationDetaillesService {
    @Autowired
    private DemandeDeclarationDetaillesDao demandeJuridiqueDetaillesDao;

    public int save(DemandeDeclarationDetailles demandeDeclarationDetailles){
        if (findByDemandeDeclarationCode(demandeDeclarationDetailles.getDemandeDeclaration().getDateDeclaration()) != null) {
            return -1;
        }else{
            demandeJuridiqueDetaillesDao.save(demandeDeclarationDetailles);
            return 1;
        }
    }
    public DemandeDeclarationDetailles findByDemandeDeclarationCode(Date date) {
        return demandeJuridiqueDetaillesDao.findByDemandeDeclarationDateDeclaration(date);
    }

    public int deleteByDemandeDeclarationCode(Date date) {
        return demandeJuridiqueDetaillesDao.deleteByDemandeDeclarationDateDeclaration(date);
    }

    public List<DemandeDeclarationDetailles> findAll() {
        return demandeJuridiqueDetaillesDao.findAll();
    }
}
