package playlist.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
    LinkedList playlist = new LinkedList();
    @RequestMapping("/add")
    public String add(String title, String artist){
        Song newsong = new Song(title,artist);
        playlist.insert(newsong);
        return "Succesfully added!";
    }
    @RequestMapping("/listar")
    public String listsongs(){
        return playlist.PrintList();
    }

    @RequestMapping("/next")
    public String playnext(){
        return playlist.NextSong();
    }

    @RequestMapping("/prev")
    public String playprev(){
        return playlist.PreviusSong();
    }

    @RequestMapping("/play")
    public String play(){
        return playlist.play();
    }

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

    }

}
