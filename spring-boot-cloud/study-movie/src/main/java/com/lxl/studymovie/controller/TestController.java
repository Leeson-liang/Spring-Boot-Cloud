package com.lxl.studymovie.controller;

import com.lxl.study.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("hello")
    public String hello(){
        User user = new User();
        user.setName("asdf");
        return user.getName();
    }

    @RequestMapping("all")
    public List findUserAll(){
        return restTemplate.getForObject("http://localhost:8862/user/findAll", List.class);
    }

}
