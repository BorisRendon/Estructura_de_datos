package queueexample.demo;

import java.util.Scanner;

public class Queue {
    private int capacidad = 5;
    String queuearray[];
    int front;
    int rear;
    int currentsize = 0;

    public Queue(int size) {
        this.capacidad = size;
        front = 0;
        rear = 1;
        queuearray = new String[this.capacidad];
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


    public void enqueue(String datos) {
        if (isFull()) {
            System.out.println("La cola esta llena");
        } else {
            rear++;
            if (rear == capacidad - 1) {
                rear = 0;
            }
            queuearray[rear] = datos;
            currentsize++;
            System.out.println(datos + " se agrego a la fila");
        }

    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!! Can not dequeue element");
        } else {
            front++;
            if (front == capacidad - 1) {
                System.out.println(queuearray[front - 1] + " removed from the queue");
                front = 0;
            } else {
                System.out.println(queuearray[front - 1] + " removed from the queue");
            }
            currentsize--;
        }
    }


    public static void main(String[] args) {

        Queue queue = new Queue(5);

        Scanner scn = new Scanner(System.in);
        Scanner ints = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            System.out.println("(1)Enqueue\n(2)Dequeue\n(3)Status\n(4)Exit");
            int opcion = ints.nextInt();
            if (opcion == 1) {
                System.out.println("Add a transaction");
                String transaccion = scn.nextLine();
                queue.enqueue(transaccion);
            } else if (opcion == 2) {
                queue.dequeue();
            } else if (opcion == 3) {
                String x =queue.queuearray.toString();
                System.out.println(x);

            } else if (opcion == 4) {
                menu = false;
            }
        }
    }
}






