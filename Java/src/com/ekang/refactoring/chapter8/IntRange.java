package com.ekang.refactoring.chapter8;

/**
 * Be careful to use setting method in constructor 
 * Often it is assumed that use the setting method for changes 
 * after the object is created 
 */

public class IntRange {
    private int low, high;

    IntRange (int low, int high) {
        initialize(low, high);
    }

    private void initialize (int low, int high) {
        this.low = low;
        this.high = high;
    }
    
    boolean includes (int arg) {
        return arg >= low && arg <= high;
    }

    void grow(int factor) {
        setHigh(getHigh() * factor);
    }

    int getLow() {
        return low;
    }

    int getHigh() {
        return high;
    }

    void setLow(int arg) {
        low = arg;
    }

    void setHigh(int arg) {
        high = arg;
    }
}