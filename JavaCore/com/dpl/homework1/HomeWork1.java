package com.dpl.homework1;

import static java.lang.Math.*;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
// task 1: calculates then prints out the area&perimeter of the circle 
        System.out.println("Enter radius of the circle, and then press Enter");
        double radius = input.nextDouble();
        System.out.printf("Area ≈ %.5g%n", PI * 2 * radius);
        System.out.printf("Circumference ≈ %.5g%n", PI * pow(radius, 2));   
// task 2: takes some input then prints it to the console
        System.out.println("What is your name");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.printf("Name: %s%nAge: %d%n", name, age);
// task 3: determines whether a year is a leap year
         int year = 2016;
        boolean isLeapYear = false;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            isLeapYear = true;
        }
        System.out.println(isLeapYear);
// task 4: prints pyramid pattern
        int i, space, rows = 15, tmp = 0;
        for (i = 1; i <= rows; ++i, tmp = 0) {
            for (space = 1; space <= rows - i; ++space) 
                System.out.print("  ");
            while(tmp != 2 * i - 1) {
                System.out.print("* ");
                ++tmp;
            }
            System.out.println();
        }
    }
}
