package com.ekang.refactoring.chapter8;

class Range {
    private int low, high;
    boolean includes(int arg) {
        return arg >= low && arg <= high;
    }
}