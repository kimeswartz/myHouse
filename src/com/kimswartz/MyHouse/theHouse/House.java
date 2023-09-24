package com.kimswartz.MyHouse.theHouse;

import java.util.ArrayList;
import java.util.List;

public class House {
    private static List<House> Houseinstances = new ArrayList<>();
    private String color;
    private int size;

    public House(String color, int size) {

        this.color = color;
        this.size = size;
        Houseinstances.add(this);

    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

        public static void printAllHouseInstances () {
            for (House Instance : Houseinstances) {
                System.out.println(Instance.getColor());
                System.out.println(Instance.getSize());
            }
        }


    }
