package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PetRestController {
    @GetMapping("/hello")
    String print(){
        return "Hello World";
    }

    @GetMapping("/entrypoint")
    String entrypoint(){
        return "Hello Welcome to the entrypoint";
    }

    @GetMapping("/dummy")
    String dummy(){
        return "Hello Welcome to the dummy page";
    }
}
