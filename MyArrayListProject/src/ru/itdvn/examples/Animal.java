package ru.itdvn.examples;

public class Animal {
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }
        public String toString() {
        return breed + " = " + price;
        }

}
