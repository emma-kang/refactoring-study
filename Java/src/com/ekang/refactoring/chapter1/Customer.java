package com.ekang.refactoring.chapter1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer (String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            frequentRenterPoints += each.getFrequentRenterPoints();

            // show figures for this rentals
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";

        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";

        return result;

    }

    public String htmlStatement() {
        Enumeration rentals = _rentals.elements();
        String result = "<h1>Rentals for <em>" + getName() + "</em></h1><p>\n";

        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();

            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<br>\n";
        }
        result += "<p>You owe <em>" + String.valueOf(getTotalCharge()) + "</em><p>\n";
        result += "On this rental you earned <em>" + String.valueOf(getTotalFrequentRenterPoints()) +
                "</em> frequent renter points<p>";

        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while(rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

}
