package com.TealTile.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/")
    public String greeting() {
        System.out.println("getting index");
        return "index.html";
    }

}