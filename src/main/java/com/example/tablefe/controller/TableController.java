package com.example.tablefe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {

    @RequestMapping("/index")
    public String tableShow() {
        return "index";
    }
}
