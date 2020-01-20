package com.example.advent_code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class AdventCodeApplicationTest {
    @Test
    public void test(){

        AdventCodeApplication test= new AdventCodeApplication();
        int result = test.FuelNeeded(14);
        assertEquals(2,result);
    }

}