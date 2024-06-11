package com.mycompany.listadeenteros;
import java.util.LinkedList;
import java.util.Queue;

public class ColaDeEnteros {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        cola.add(10);
        cola.add(20);
        cola.add(30);

        System.out.println("Elementos de la cola: " + cola);
        System.out.println("Elemento frontal: " + cola.peek());
        System.out.println("Elemento removido: " + cola.poll());
        System.out.println("Elementos de la cola después del poll: " + cola);
    }
}
