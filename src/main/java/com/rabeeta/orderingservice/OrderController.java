package com.rabeeta.orderingservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/")
    public String home(){
        return "hello rabeeta";
    }
}
