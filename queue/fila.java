package com.company.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); // Lança uma exceção caso a fila esteja cheia
        fila.offer("Bia"); // Retorna "false" caso a fila esteja cheia
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); // Retorna "null" caso a fila esteja vazia
        System.out.println(fila.element()); // Lança uma exceção caso a fila esteja vazia

        // fila.size();
        // fila.isEmpty();
        // fila.clear();

        System.out.println(fila.poll()); // Retorna "null" caso a fila esteja vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        // System.out.println(fila.remove()); // Lança uma exceção caso a fila esteja vazia
    }
}
