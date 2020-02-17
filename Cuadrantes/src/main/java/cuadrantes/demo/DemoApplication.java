package cuadrantes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {


    punto prueba;
    @RequestMapping("/check")
    public String chequeo(int x,int y){
        prueba = new punto(x,y);
        return verificar.check(prueba.mostrarx(),prueba.mostrary());
    }




    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);



    }

}
