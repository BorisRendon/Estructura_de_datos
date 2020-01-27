package queueexample.demo;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {
     public Queue test = new Queue(5);
    @RequestMapping("/enqueue")
     public String testenq(String x){
        test.enqueue(x);
        String t = "Succesfully added to the queue";

         return t;
     }
     @RequestMapping("/dequeue")
     public String testdeq() {
        test.dequeue();
        String dequeued = "Succesfully dequeued from the queue";
        return dequeued;
     }
     @RequestMapping("/show")
     public String testshow(){
        test.toString();
        String show = test.queuearray.toString();
        String  prueba = Arrays.toString(test.queuearray);
        return prueba;
     }




    public static void main(String[] args) {
        Queue test = new Queue(5);
        test.enqueue("Juan deposito 100 a maria");


        SpringApplication.run(DemoApplication.class, args);





    }


}