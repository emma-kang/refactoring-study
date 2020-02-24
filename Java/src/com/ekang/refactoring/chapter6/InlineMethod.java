package com.ekang.refactoring.chapter6;

public class InlineMethod {
    private int _numberOfLateDeliveries;
    private Order anOrder;
    private int _quantity;
    private double _itemPrice;

    public double inlineTemp() {
        if(basePrice() > 1000)
            return basePrice() * 0.95;
        else
            return basePrice() * 0.98;
    }

    public double basePrice() {
        return _quantity * _itemPrice;
    }

    public int getRating() {
        return (_numberOfLateDeliveries > 5) ? 2 : 1;
    }



    /*
     * [Inline Method]
     * Check the method is not polymorphic.
     * Find all calls to the method
     * Replace each call with the method body
     * Complie and test
     * Remove the method definition
     */
}
