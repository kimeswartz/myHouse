package com.kimswartz.MyHouse;

/* We import the scanner from util for user input. */

import java.util.Scanner;

import com.kimswartz.MyHouse.thePeople.People;
import com.kimswartz.MyHouse.theHouse.House;

public class Main {

    public static void main(String[] args) {

        /* We set the stream to the main method for user input */
        Scanner scanner = new Scanner(System.in);

        /* name (instance) will save the user input data with scanner.nextLine */
        System.out.print("Enter the person's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your persons hair color: ");
        String hair = scanner.nextLine();

        System.out.println("How would you describe your persons clothing style: ");
        String garment = scanner.nextLine();

        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();


        /* Create a dynamic Person object using user input. */
        People person = new People(name, hair, garment, age);

        /* We set the stream to the main method for user input */
        Scanner scannerTwo = new Scanner(System.in);

        /* When person is made, make the house */
        System.out.println("Great! " + person.getName() + " is created! Now let's create " + person.getName() +"´s house!");

        System.out.println("What color should the house be?");
        String color = scannerTwo.nextLine();

        System.out.println("Enter how many square meters the house should be: ");
        int size = scannerTwo.nextInt();

        /* Display the People dynamic object's details */
        System.out.println("Sweet! You have created " + person.getName() + ", check details below: ");
        System.out.println("Name: " + person.getName());
        System.out.println("Hair Color: " + person.getHair());
        System.out.println("Clothing style: " + person.getGarment());
        System.out.println("Age: " + person.getAge());

        /* Create a dynamic user input House object */
        House home = new House(color,size);
        System.out.println("The color of " + person.getName() + "´s house is " + home.getColor() + ", and the size of the house is " + home.getSize() + " Square meters!");



        // We call the printAllInstances() method to print the values in our instances.

        /*
         System.out.println("All instances:");
        People.printAllInstances();
        House.printAllHouseInstances();
         */

        /* Stop the app from running */
        scanner.close();

    }
}

