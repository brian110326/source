package com.example.couplediary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/couple")
public class HomeController {
    
    @GetMapping("/home")
    public void getMethodName() {
        
    }
    
}
