package org.example;

public class Vehicles {

    public void car () {
        System.out.println("HONDA");
    }

    public void car (String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        vehicles.car();
        vehicles.car("KIA");
        vehicles.car("Mercedes");
        vehicles.car("BMW");
    }
}
