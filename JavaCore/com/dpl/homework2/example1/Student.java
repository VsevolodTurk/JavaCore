package com.dpl.homework2.example1;

public class Student {
    public static final String DEFAULT_NAME = "UNKNOWN";
    public static final double DEFAULT_RATING = .0d;
    public static double avgRating;
    public static double tmpRating;
    private static int tmpCount;
    
    private String name;
    private double rating;
    public Student() {
        this(DEFAULT_NAME, DEFAULT_RATING);
    }
    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        tmpCount++;
        tmpRating += rating;
        avgRating = tmpRating / tmpCount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public static String getHigherScore(Student stud0, Student stud1) {
        String result = "";
        if (stud0.rating == stud1.rating) {
            result = "Both students have equal scores";
        } else {
            result = stud0.rating > stud1.rating ? String.format("Student '%s' has higher score", stud0.name) : String.format("Student '%s' has higher score", stud1.name);
        }
        return result;
    }
}