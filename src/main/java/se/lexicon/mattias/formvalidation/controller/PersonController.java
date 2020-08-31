package se.lexicon.mattias.formvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import se.lexicon.mattias.formvalidation.model.Person;


import javax.validation.Valid;

@Controller
public class PersonController {

    @GetMapping("/")
    public String showForm(Person person) {
        return "register";
    }

    @PostMapping("/")
    public String register(@Valid Person person, Errors errors, Model model) {
        if(errors.hasErrors()) {
            return "register";
        } else {
            model.addAttribute("message", "Registeration success");
            return "register";
        }
    }

}
