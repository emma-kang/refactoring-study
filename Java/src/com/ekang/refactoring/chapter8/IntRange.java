package com.ekang.refactoring.chapter8;

public class IntRange {
    private int low, high;

    IntRange (int low, int high) {
        this.low = low;
        this.high = high;
    }
    
    boolean includes (int arg) {
        return arg >= low && arg <= high;
    }

    void grow(int factor) {
        high = high * factor;
    }
}