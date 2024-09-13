package com.Academy.spring_thymeleaf_test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="n", required = false, defaultValue = "Welt") String someName, Model model) {

        model.addAttribute("inputName", someName);
        return "greeting";
    }

}
