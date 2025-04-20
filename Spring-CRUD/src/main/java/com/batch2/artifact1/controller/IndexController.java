package com.batch2.artifact1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/car")
    public String showwelcomepage() {
        return "car"; // Renders car.html from src/main/resources/templates/
    }
}
