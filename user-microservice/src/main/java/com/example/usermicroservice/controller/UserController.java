package com.example.usermicroservice.controller;

import com.example.usermicroservice.ValueObjects.ResponseTemplate;
import com.example.usermicroservice.entity.Users;
import com.example.usermicroservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public Users saveUser(@RequestBody Users user)
    {
        log.info("Inside the controller layer save user function");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplate findUserByIdWithDepartment(@PathVariable("id") Long id) {
        log.info("Inside the controller layer find user function");
        return userService.findUserByIdWithDepartment(id);

    }
}
