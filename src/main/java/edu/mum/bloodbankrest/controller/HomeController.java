package edu.mum.bloodbankrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping({"/","/welcome"})
    public String welcome(Model model) {

        model.addAttribute("greeting", "Welcome to our Blood Bank Management System!!");
        model.addAttribute("tagline", "Donate blood and save a life!!");

        return "welcome";
    }

}
