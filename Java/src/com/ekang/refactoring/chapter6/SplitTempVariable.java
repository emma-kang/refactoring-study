package com.ekang.refactoring.chapter6;

public class SplitTempVariable {
    private double _height;
    private double _width;

    public void example() {
        // make a separate temporary variable for each assignment
        double temp = 2 * (_height + _width);
        System.out.println(temp);
        temp = _height * _width;
        System.out.println(temp);
    }
}
