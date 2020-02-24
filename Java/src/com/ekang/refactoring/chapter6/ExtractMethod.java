package com.ekang.refactoring.chapter6;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod {
    private String _name;
    private double _amount;
    private Vector _orders = new Vector();

    public void printOwing() {
        Enumeration e = _orders.elements();
        double outstanding = 0.0;

        printBanner();

        // caculate outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }
        // print details
        System.out.println("name: " + _name);
        System.out.println("amount: " + outstanding);
    }

    public void printBanner() {
        // print banner
        System.out.println("*************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("*************************");
    }
}