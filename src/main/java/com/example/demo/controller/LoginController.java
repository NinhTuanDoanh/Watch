package com.example.demo.controller;

import com.example.demo.Model.dto.UserLoginDto;
import com.example.demo.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping(path = "/login")
    public boolean loginUser(@RequestBody UserLoginDto userLoginDto){
        return loginService.loginService(userLoginDto);
    }

}
