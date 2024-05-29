package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("users")
public class HelloController {
    private List<User> users = new ArrayList<>();

    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/registerPage")
    public String showRegisterPage() {
        return "registerPage";
    }

    @PostMapping("/registerPage")
    public String register(@RequestParam String firstName,
                           @RequestParam String lastName,
                           @RequestParam String email, Model model) {
        User newUser = new User(firstName, lastName, email);
        users.add(newUser);
        model.addAttribute("users", users);
        return "redirect:/thanksPage";
    }

    @GetMapping("/thanksPage")
    public String thanksPage() {
        return "thanksPage";
    }

    @GetMapping("/registeredUsersList")
    public String registeredUsersList(Model model) {
        model.addAttribute("users", users);
        return "registeredUsersList";
    }
}