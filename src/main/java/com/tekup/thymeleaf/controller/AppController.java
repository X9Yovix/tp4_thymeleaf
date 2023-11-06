package com.tekup.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("app","Thymeleaf");
        return "index";
    }

    @GetMapping("/*")
    public String notFound(Model model){
        return "error_404";
    }
}
