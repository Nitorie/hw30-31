package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/registerPage")
    public String registerPage() {
        return "registerPage";
    }
}