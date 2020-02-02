package creditos_debitos.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController

@SpringBootApplication
public class DemoApplication {

    public Credits_debits creditos = new Credits_debits(10);
    public Credits_debits debitos = new Credits_debits(5);



    @RequestMapping("/agregar1")
    public int add(int x, int indice){
        creditos.y(x,indice);
        return 1;
    }
    @RequestMapping("/agregar2")
    public int adddebs(int x, int indice){
        debitos.y(x,indice);
        int debitos =0;
        debitos++;
        return 1;
    }


    //////////
    @RequestMapping("/mostrar")
    public String  show(){
        creditos.toString();
        String mostrar = creditos.queuearray.toString();
        String prueba = Arrays.toString(creditos.queuearray);
        return prueba;
    }
    @RequestMapping("/mostrar2")
    public String  showdebs(){
        creditos.toString();
        String mostrar = debitos.queuearray.toString();
        String prueba = Arrays.toString(debitos.queuearray);
        return prueba;
    }
    //////////////
    @RequestMapping("/borrar")
    public int borrar(int indice){
        creditos.quitar(indice);
        return 1;
    }

    @RequestMapping("/borrar2")
    public int borrardebs(int indice){
        debitos.quitar(indice);
        return 1;
    }
    /////////
    @RequestMapping("/suma")
    public int suma(){
        int x =creditos.suma();



        return x;
    }
    @RequestMapping("/suma2")
    public int suma2(){
       int x = debitos.suma();


        return x;
    }
    @RequestMapping("/saldo")
    public  int resultado(){
        int prueba = suma();
        int prueba2= suma2();
        int res = prueba-prueba2;

        return res;

    }
    @RequestMapping("/promedio")
    public float promedio (){
        float  total =suma2();

        return total/5;
    }
    @RequestMapping("/max")
    public int max(){

        return debitos.max();
    }







    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Credits_debits creditos = new Credits_debits(10);







    }
}
//https://examples.javacodegeeks.com/dynamic-aray-java-example/