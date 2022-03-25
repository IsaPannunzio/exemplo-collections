package com.company.collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> Livros = new ArrayDeque<>();

        Livros.add("O Pequeno Príncipe");
        Livros.push("Don Quixote"); // Lança uma exceção caso a pilha esteja cheia
        Livros.push("O Hobbit");

        System.out.println(Livros.peek());
        System.out.println(Livros.element());

    }
}
