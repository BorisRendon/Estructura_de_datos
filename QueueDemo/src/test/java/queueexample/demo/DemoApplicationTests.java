package queueexample.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        Queue test1 = new Queue(5);
        assertEquals(true,test1.isEmpty());
        assertEquals(false,test1.isFull());



    }

}
