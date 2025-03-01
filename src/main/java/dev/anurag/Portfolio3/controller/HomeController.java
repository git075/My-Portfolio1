package dev.anurag.Portfolio3.controller;


import dev.anurag.Portfolio3.config.SocialMediaCongif;
import dev.anurag.Portfolio3.entity.ContactMe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private SocialMediaCongif socialMediaCongif;

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping({"/", "" , "/home"})
    public String getHome(Model model){
        model.addAttribute("title" , "HomePage");
        model.addAttribute("linkedinUrl" , socialMediaCongif.getLinkedinUrl() );
        model.addAttribute("twitterUrl" , socialMediaCongif.getTwitterUrl());
        model.addAttribute("githubUrl" , socialMediaCongif.getGithubUrl());
        return "master";
    }

    @GetMapping("/resume")
    public String getResume(Model model){
        model.addAttribute("title" , "Resume");
        return "master";
    }

    @GetMapping("/projects")
    public String getProjects(Model model){
        model.addAttribute("title" , "Projects");
        model.addAttribute("FileUploadSystem" , "https://github.com/git075/FileUploadSystem");
        model.addAttribute("CRM" , "https://github.com/git075/CustomerRelationshipManagement");
        model.addAttribute("UserManagementSystem" , "https://github.com/git075/jdbc-user-management-system");
        model.addAttribute("MultiThreadedWebServer" , "https://github.com/git075/Multithreaded-Web-Server");
        return "master";
    }

    @GetMapping("/contact")
    public String getContact(Model model){
        model.addAttribute("title" , "ContactPage");
        model.addAttribute("contactMe" , new ContactMe());
        return "master";
    }


    @PostMapping("/contact/send")
    public String sendEmail(@ModelAttribute("contactMe") ContactMe contactForm, Model model) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo("jatanurag000@gmail.com"); // Your email
            mailMessage.setSubject("New Contact Form Submission from " + contactForm.getName());
            mailMessage.setText(
                    "Name: " + contactForm.getName() +
                            "\nEmail: " + contactForm.getMail() +
                            "\nPhone: " + contactForm.getPhone() +
                            "\n\nMessage: " + contactForm.getMessage()
            );
            mailSender.send(mailMessage);

            model.addAttribute("successMessage", "Your message has been sent successfully!");
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Error sending message: " + e.getMessage());
        }
        model.addAttribute("title" , "ContactPage");
        model.addAttribute("contactMe" , new ContactMe());
        return "master"; // Return to the same page
    }

}
