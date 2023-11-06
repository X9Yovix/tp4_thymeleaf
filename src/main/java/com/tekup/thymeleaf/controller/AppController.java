package com.tekup.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class AppController {

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("app", "Thymeleaf");
        return "index";
    }

    @GetMapping("/*")
    public String notFound(Model model) {
        return "error_404";
    }

    @GetMapping("/elements")
    public String elements(Model model) {
        List<String> list = Arrays.asList("Element 1", "Element 2", "Element 3");
        model.addAttribute("elements",list);
        return "list";
    }
}
