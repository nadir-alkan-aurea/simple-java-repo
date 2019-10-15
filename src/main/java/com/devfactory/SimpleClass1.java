package com.devfactory;

public class SimpleClass1 {

    private String name = "Donald Duck";

    public static void main(String[] args) {
        System.out.println("Even though I'm simple, it doesn't mean I should be ignored");

        SimpleClass1 me = new SimpleClass1();
        me.printName();
    }

    private void printName() {
        System.out.printf("My name is: %s:", name);
    }
}
