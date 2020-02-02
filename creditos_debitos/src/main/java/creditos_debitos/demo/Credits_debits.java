package creditos_debitos.demo;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Credits_debits {
    private int capacidad = 5;
    int queuearray[];
    int front;
    int rear;
    int currentsize = 0;

    public Credits_debits(int size) {
        this.capacidad = size;
        front = 0;
        rear = 1;
        queuearray = new int[this.capacidad];
    }

    public boolean isFull() {
        if (currentsize == capacidad) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (currentsize == 0) {
            return true;
        }
        return false;
    }




    public void y(int datos,int indice) {
        if (isFull()) {
            System.out.println("La cola esta llena");
        } else {
            queuearray[indice] = datos;
            System.out.println(datos + "se ha agregado a la fila");
        }

    }

    public void quitar(int indice){

        if(isEmpty()){
            queuearray[indice]=0;
        }else {
            System.out.println("nose");
        }


    }
    public int suma(){
        int sum = IntStream.of(queuearray).sum();
        System.out.println("La suma es de: " + sum);
        return sum;

    }

    public int saldo(int x, int y){
        int res = x-y;

        System.out.println("Su saldo es de: Q" + res);
        return res;
    }
    public int prom(int total,int cantidad){
        return total/cantidad;
    }
    public int max(){


        int max = queuearray[0];
        for(int i=0;i<5;i++){
            if(max <queuearray[i]){
                max = queuearray[i];
            }
        }
        return max;

    }




    }







//falta







