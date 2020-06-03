package com.ekang.refactoring.chapter8;

class Range {
    private int low, high;
    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    // Self Encapsulate field - create getter and setter for the fields
    int getLow() {
        return low;
    }
    int getHigh() {
        return high;
    }
}