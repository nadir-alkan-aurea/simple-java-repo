package com.devfactory;

public class CopyOfSimpleClass {

    private String name = "Donald Duck";

    public static void main(String[] args) {
        System.out.println("Even though I'm simple, it doesn't mean I should be ignored");

        CopyOfSimpleClass me = new CopyOfSimpleClass();
        me.printName();
    }

    private void printName() {
        System.out.printf("My name is: %s:", name);
    }
}
