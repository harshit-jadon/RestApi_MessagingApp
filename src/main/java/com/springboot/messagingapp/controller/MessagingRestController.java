package com.springboot.messagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MessagingRestController {
    @RequestMapping(value={"","/","/home"})
    public String sayHello(){
        return "Hello From BridgeLabz!!!";
    }
}
