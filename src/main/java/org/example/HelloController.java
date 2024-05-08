package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("myPage")
    public String myPage()  {
        return "myPage";
    }

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "<a href='/'>go to main page</a><br><button>ok</button>";
    }
}