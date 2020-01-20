package com.example.advent_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AdventCodeApplication {
    @RequestMapping("/fuel")
    static int FuelNeeded(int n){
        return (n/3)-2;
    }

    public static void main(String[] args) {
        SpringApplication.run(AdventCodeApplication.class, args);
    }

}
