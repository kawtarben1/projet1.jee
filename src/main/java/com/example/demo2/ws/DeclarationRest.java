package com.example.demo2.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/declaration")
public class DeclarationRest {
    @Autowired
    private DeclarationService declarationService;
}
