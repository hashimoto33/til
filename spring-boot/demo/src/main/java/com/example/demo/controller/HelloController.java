package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("hello/*")
@Controller
public class HelloController {

    @GetMapping("world")
    public String open(Model model) {

        String message = "初めてのSpirng Boot!";
        model.addAttribute("value",message);
        return "hello";
    }
}
