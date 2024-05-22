package com.example.Adminka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AdminkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminkaApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "ЖИИИЗНЬ!";
    }

}
