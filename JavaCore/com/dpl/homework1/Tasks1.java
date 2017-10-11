package com.dpl.homework1;

import java.util.Scanner;

public class Tasks1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// task 1: very simple calc
        int a, b;
        System.out.println("Enter the first operand, and then press Enter");
        a = input.nextInt();
        System.out.println("Enter the first operand, and then press Enter");
        b = input.nextInt();
        System.out.printf("a + b = %d%n", a + b);
        System.out.printf("a - b = %d%n", a - b);
        System.out.printf("a * b = %d%n", a * b);
        System.out.printf("a / b = %.2f%n",  (double) a / b );
// task 2: reads input from user and prints it to the console 
        input.nextLine();
        System.out.println("How are you?");
        String answer = input.nextLine();
        System.out.println("You are " + answer);
// task 3: conditionaly sets n's value 
    // if
        int m = 0, n = 0;
        if (m > 0) 
            n = 1;
        else if (m < 0) 
            n = -1;
        else
            n = 0;
    // ternary
        n = m > 0 ? 1 : m < 0 ? -1 : 0; 
// task 4: sum of the first 10 natural numbers
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}