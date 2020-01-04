package ru.itdvn.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class MainArray {
    public static void main(String[] args) {
        ArrayList<Animal> al = new ArrayList<>();
        al.add(new Animal("Sphynx", 5000));
        al.add(new Animal("Malamute", 4000));

        Iterator<Animal> animalIterator = al.iterator();

        while (animalIterator.hasNext()){
            Animal tmp = animalIterator.next();
            tmp.price += 1000;
        }
        System.out.println(al);

    }
}
