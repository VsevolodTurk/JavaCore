package com.dpl.homework2.example1;

public class UseStudent {
    public static void main(String[] args) {
        Student rust = new Student("Rustin Cohle", 9.0);
        Student marty = new Student("Martin Hart", 8.6);
        System.out.println(Student.getHigherScore(rust, marty));
        System.out.println(Student.avgRating);
    }
}