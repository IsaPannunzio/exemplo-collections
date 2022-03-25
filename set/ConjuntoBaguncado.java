package com.company.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //double -> Double
        conjunto.add(true); //boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1); //int -> Integer
        conjunto.add("x"); //char -> Character

        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        conjunto.add("teste");
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        conjunto.add("Teste"); //Uma collection não aceita repetição, então o tamanho do conjunto não irá mudar
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        System.out.println(conjunto.remove('x'));
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        System.out.println(conjunto.contains("teste"));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("\n" + nums);
        System.out.println("\n" + conjunto);

        conjunto.addAll(nums); //União entre 2 conjuntos
        System.out.println("\n" + conjunto);

        Set nums2 = new HashSet();
        nums2.add(1);
        nums2.add(7);
        nums2.add(13);

        nums2.retainAll(nums); //Retém apenas o valor em comum entre os 2
        System.out.println("\n" + nums2);



    }
}
