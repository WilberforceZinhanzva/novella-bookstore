package com.example.novelaa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontStoreController {

    @RequestMapping("/")
public String frontStore(){
        return "index";
    }
}
