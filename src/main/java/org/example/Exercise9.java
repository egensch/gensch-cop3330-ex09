/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;
import java.lang.Math;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner roomDim = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        double length = roomDim.nextInt();

        System.out.print("What is the width of the room in feet? ");
        double width = roomDim.nextInt();

        double areaFt = length * width;
        double gallons = areaFt / 350;
        double result = Math.ceil(gallons);

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.\n", result, areaFt);


    }
}
