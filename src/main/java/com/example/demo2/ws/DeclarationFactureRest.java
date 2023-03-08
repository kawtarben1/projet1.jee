package com.example.demo2.ws;

import com.example.demo2.Service.DeclarationFactureService;
import com.example.demo2.bean.DeclarationFacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/declarationFacture")
public class DeclarationFactureRest {
    @Autowired
    private DeclarationFactureService declarationFactureService;
}
