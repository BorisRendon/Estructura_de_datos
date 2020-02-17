package cuadrantes.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        verificar test = new verificar();
        assertEquals("cuadrante 1",test.check(10,10));
        assertEquals("cuadrante 2",test.check(-10,10));
        assertEquals("cuadrante 3",test.check(-10,-10));
        assertEquals("cuadrante 4",test.check(10,-10));
    }

}
