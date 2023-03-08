package com.example.demo2.ws;

import com.example.demo2.Service.ComptableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comptable")
public class ComptableRest {
    @Autowired
    private ComptableService comptableService;
}
