package com.example.mapingjpa.controller;

import com.example.mapingjpa.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {
    @GetMapping("/")
    public String getPeople(Model model){
        model.addAttribute("some","form controller");
        model.addAttribute("people", Arrays.asList(
                new Person("Vadim",23),
                new Person("Ivan",32),
                new Person("Alex",21),
                new Person("Oleg",22),
                new Person("Marina",25),
                new Person("Olya",13)

        ));
        return "people";
    }
}
