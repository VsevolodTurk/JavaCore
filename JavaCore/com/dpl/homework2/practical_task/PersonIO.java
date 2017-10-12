package com.dpl.homework2.practical_task;

import java.util.Scanner;

public class PersonIO {
    private static Scanner read = new Scanner(System.in);
    Person psn = new Person();
    public PersonIO() {
        getOutput();
    }
    public void getInput() {
        System.out.println("Type in your first and last name, and then press Enter key");
        psn.setName(read.nextLine());
        System.out.println("Type in your birthyear, and then press Enter key");
        psn.setBirthYear(read.nextInt());
    }
    public void getOutput() {
        getInput();
        System.out.println(psn);    
    }
}