package com.autentia.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autentia.demo.service.SampleService;

@RestController
public class SampleController {

    private SampleService sampleService;
    
    private String nodo;

    @Autowired
    public SampleController(@Value("${nodo.numero}") String nodo,SampleService sampleService) {
    	this.nodo = nodo;
        this.sampleService = sampleService;
    }

    @GetMapping("/")
    public String welcome() 
    {
        return sampleService.welcome(this.nodo);
    }
    
}