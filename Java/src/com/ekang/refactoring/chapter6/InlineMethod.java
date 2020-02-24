package com.ekang.refactoring.chapter6;

public class InlineMethod {
    private int _numberOfLateDeliveries;

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
