package com.ekang.refactoring.chapter6;

public class ExtractMethod {
    private String _name;
    private double _amount;

    public void printOwing(double amount) {
        printBanner();

        // print details
        System.out.println("name: " + _name);
        System.out.println("amount: " + _amount);
    }
}