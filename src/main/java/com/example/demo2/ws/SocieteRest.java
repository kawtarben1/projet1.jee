package com.example.demo2.ws;

import com.example.demo2.Service.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/societe")
public class SocieteRest {
    @Autowired
    private SocieteService societeService;
}
