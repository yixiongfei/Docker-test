package org.example.docker_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String hello() {
        return "redirect:/helloworld.html";
    }
}

