package com.khaledmicroservices.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ProductController {
    @GetMapping("product")
    public String sayHello() {
        return "hello";
    }
}
