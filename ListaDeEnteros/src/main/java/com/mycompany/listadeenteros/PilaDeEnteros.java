package com.mycompany.listadeenteros;
import java.util.Stack;

public class PilaDeEnteros {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Elementos de la pila: " + pila);
        System.out.println("Elemento superior: " + pila.peek());
        System.out.println("Elemento removido: " + pila.pop());
        System.out.println("Elementos de la pila después del pop: " + pila);
    }
}
