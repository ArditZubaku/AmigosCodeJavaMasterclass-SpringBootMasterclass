package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@RequestMapping("/")
public class TemplateController {

    @GetMapping("login")
    public String getLogin(){
        return "login"; // the name of the html file
    }

    @GetMapping("courses")
    public String getCourses(){
        return "courses"; // the name of the html file
    }


}
