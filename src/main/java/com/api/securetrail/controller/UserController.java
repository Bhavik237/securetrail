package com.api.securetrail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get/{id}")
    public String getUser(@PathVariable Long id){
        return  "User id is :"+id;
    }
}
