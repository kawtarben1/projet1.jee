package com.example.demo2.ws;

import com.example.demo2.Service.TypeFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/typeFacture")
public class TypeFactureRest {
    @Autowired
    private TypeFactureService typeFactureService;
}
