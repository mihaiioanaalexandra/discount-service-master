package com.awbd.discountservice.controllers;

import com.awbd.discountservice.config.PropertiesConfig;
import com.awbd.discountservice.model.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private PropertiesConfig configuration;

    @Autowired
    Environment environment;

    @GetMapping("/discount")
    public Discount getDiscount(){

        Discount discount = new Discount();
        discount.setDiscount(configuration.getDiscount());
        discount.setInstanceId(Integer.parseInt(environment.getProperty("server.port")));
        return discount;
    }
}