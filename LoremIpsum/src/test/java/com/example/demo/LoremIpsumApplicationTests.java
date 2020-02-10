package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class LoremIpsumApplicationTests {

    @Test
    void contextLoads() {

        LoremIpsumApplication test = new LoremIpsumApplication();
        StringReader test1 = new StringReader();

        String a = "a:3";
        assertEquals(a,test1.StringReader("aaa"));



    }

}
