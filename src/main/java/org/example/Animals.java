package org.example;

public class Animals {
    void voice () {
        System.out.println("rrrr");
    }

    void color () {
        System.out.println("white");
    }

    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.voice();
        animals.color();

        animals.voice();
        animals.color();

    }
}
