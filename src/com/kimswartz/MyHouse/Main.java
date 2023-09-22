package com.kimswartz.MyHouse;

// We import the scanner from util for user input.
import java.util.Scanner;

import com.kimswartz.MyHouse.thePeople.People;

public class Main {
    public static void main(String[] args) {
        // We set the stream to the main method for user input
        Scanner scanner = new Scanner(System.in);

        // name (instance) will save the user input data with scanner.nextLine
        System.out.print("Enter the person's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your persons hair color: ");
        String hair = scanner.nextLine();

        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();

        // Create a dynamic Person object using user input.
        People person = new People(name, hair, age);

        // Display the dynamic object's details
        System.out.println("Sweet! Your person's details are:");
        System.out.println("Name: " + person.getName());
        System.out.println("Hair Color: " + person.getHair());
        System.out.println("Age: " + person.getAge());

        scanner.close();
    }
}
