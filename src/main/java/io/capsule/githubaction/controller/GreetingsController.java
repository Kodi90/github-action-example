package io.capsule.githubaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingsController {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}

