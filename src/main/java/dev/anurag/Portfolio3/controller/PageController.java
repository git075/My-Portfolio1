package dev.anurag.Portfolio3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/privacy")
    public String getPrivacyPage(Model model){
        model.addAttribute("title" , "PrivacyPage");
        return "master";
    }

    @GetMapping("/terms")
    public String getTermsPage(Model model){
        model.addAttribute("title" , "Terms & Conditions");
        return "master";
    }

    @GetMapping("/aboutMe")
    public String getAboutMePage(Model model){
        model.addAttribute("title" , "About Me");
        return "master";
    }


}
