package com.dpl.homework2.practical_task;

import java.time.Year;

public class Person {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public Person() {
        this("UNKNOWN", Integer.MIN_VALUE);
    }
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public int getAge() {
        return Year.now().getValue() - birthYear;
    }
    public String toString() {
        return String.format("Person [name='%s', age=%s]", name, getAge());
    }
}

