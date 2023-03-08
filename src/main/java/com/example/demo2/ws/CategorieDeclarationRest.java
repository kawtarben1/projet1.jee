package com.example.demo2.ws;

import com.example.demo2.Service.CategorieDeclarationService;
import com.example.demo2.bean.CategorieDeclaration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categorieDeclaration")
public class CategorieDeclarationRest {
    @Autowired
    private CategorieDeclarationService categorieDeclarationService;
}
