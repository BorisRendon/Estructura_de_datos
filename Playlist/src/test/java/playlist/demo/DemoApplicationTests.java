package playlist.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        Song test = new Song("Imagine" , "John Lennon");
        assertEquals("Imagine" ,test.getSongTitle());

        assertEquals("John Lennon" ,test.getSongArtist());

    }


}
