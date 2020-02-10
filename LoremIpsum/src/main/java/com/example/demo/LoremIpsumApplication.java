package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class LoremIpsumApplication {
    StringReader test1 = new StringReader();

    @RequestMapping("/home")
    public String prueba(String x){
        String test = "Succesful";
        test1.StringReader(x);


        return test;
    }





    public static void main(String[] args) {

        /*String parrafo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        StringReader ejemplo = new StringReader();

        ejemplo.StringReader(parrafo);*/




        SpringApplication.run(LoremIpsumApplication.class, args);
    }

}
