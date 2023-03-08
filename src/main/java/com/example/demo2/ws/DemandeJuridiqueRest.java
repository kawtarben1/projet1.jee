package com.example.demo2.ws;

import com.example.demo2.Service.DemandeDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demandeJuridique")
public class DemandeJuridiqueRest {
    @Autowired
    private DemandeDeclarationService demandeJuridiqueService;
}
