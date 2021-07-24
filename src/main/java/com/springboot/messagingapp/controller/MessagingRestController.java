package com.springboot.messagingapp.controller;

import com.springboot.messagingapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MessagingRestController {

    @RequestMapping(value={"","/","/home"})
    public String sayHello(){
        return "Hello From BridgeLabz!!!";
    }

    @RequestMapping(value={"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value="name")String name){
        return "Hello " + name +" from Bridgelabz....";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+ name +" from BridgeLabz";
    }

    @PostMapping("/post")
    public String sayHell0(@RequestBody User user){
        return "Hello" + user.getFirstName()+ " "+user.getLastName()+" "+" from BridgeLabz";
    }

    @PutMapping("/put{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value="lastName")String lastName){
        return "Hello" + firstName +" "+ lastName+ "from bridgeLabs using PUT..";
    }
}
