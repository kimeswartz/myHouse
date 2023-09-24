package com.kimswartz.MyHouse.thePeople;

// We import an ArrayList, so we can add and remove elements from our List.
import java.util.ArrayList;
// We import the util List, so we can use its framework for our List.
import java.util.List;

public class People {
    private static List<People> instances = new ArrayList<>();
    private String name;
    private String hair;
    private String garment;
    private int age;

    public People(String name, String hair, String garment, int age) {
        this.name = name;
        this.hair = hair;
        this.garment = garment;
        this.age = age;
        instances.add(this); // Add the current instances to the list

    }


    public String getName() {
        return name;
    }

    public String getHair() {
        return hair;
    }

    public String getGarment() {
        return garment;
    }

    public int getAge() {
        return age;
    }

    // A method to print out the value from instances. We call its properties in Main with printAllInstances()
    public static void printAllInstances() {
        for (People instance : instances) {
            System.out.println(instance.getName());
            System.out.println(instance.getHair());
            System.out.println(instance.getGarment());
            System.out.println(instance.getAge());
        }
    }

}


