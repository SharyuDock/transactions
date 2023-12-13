package com.s7g.transactions.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIToExpose {

    @GetMapping("/data")
    public String getData() {

        System.out.println("This is new deployed version");
        return "deployednewdata";
    }
}
