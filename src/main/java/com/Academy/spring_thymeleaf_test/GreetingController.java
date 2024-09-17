package com.Academy.spring_thymeleaf_test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="n", required = false, defaultValue = "Welt") String someName,
            @RequestParam(name="m", required = false, defaultValue = "nichtCSS") String cssName,
            Model model)
    {

        model.addAttribute("inputName", someName);
        model.addAttribute("cssFileName", cssName);

        return "greeting";
    }

    @GetMapping("/person")
    @ResponseBody
    public Person personJson(@RequestParam(name="n", required = false, defaultValue = "idiot") String derName, Model model) {

        Person person = Person.builder().build();
        person.setId(1);
        person.setName(derName);
        model.addAttribute("testName", derName);

        return person;
    }

}
