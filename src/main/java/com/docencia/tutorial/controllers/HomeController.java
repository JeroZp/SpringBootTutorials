package com.docencia.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Welcome to Spring Boot");
        model.addAttribute("subtitle", "An Spring Boot Eafit App");
        return "home/index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us - Online Store");
        model.addAttribute("subtitle", "About Us");
        model.addAttribute("description", "This is an about page ...");
        model.addAttribute("author", "Developed by: Jerónimo Pérez Baquero");
        return "home/about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Us - Online Store");
        model.addAttribute("description", "Here you can see our contact information");
        model.addAttribute("email", "sringboot-eafit@eafit.edu.co");
        model.addAttribute("phone", "+1 (555) 555 555 555");
        model.addAttribute("address", "KR pi #pi-pi Medellín, Antioquia");
        return "home/contact";
    }
}
