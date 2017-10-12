package com.dpl.homework2.hw2;

public class UseEmployee {
    public static void main(String[] args) {
        Employee homer = new Employee("Home Simpson", 20.5, 40);
        Employee marge = new Employee("Marge Simpson", 12.0, 35);
        Employee bart = new Employee("Bart Simpson", 0, 0);
        System.out.println(Employee.totalHours);
    }
}