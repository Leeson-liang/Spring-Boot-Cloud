package com.lxl.study.controller;

import com.lxl.study.entity.User;
import com.lxl.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("test")
    public String testController(){
        return "success";
    }

    @RequestMapping("findAll")
    public List fineAll(){
        return userRepository.findAll();
    }

    @RequestMapping("id/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.getOne(id);
    }
}
