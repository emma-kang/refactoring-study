package com.ekang.refactoring.chapter6;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod {
    private String _name;
    private double _amount;
    private Vector _orders = new Vector();

    public void printOwing() {
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    public double getOutstanding() {
        Enumeration e = _orders.elements();
        double result = 0.0;
        // caculate outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    public void printBanner() {
        // print banner
        System.out.println("*************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("*************************");
    }

    public void printDetails(double outstanding) {
        // print details
        System.out.println("name: " + _name);
        System.out.println("amount: " + outstanding);
    }
}