package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("persons", personRepository.findAll());
        return "index";
    }

}