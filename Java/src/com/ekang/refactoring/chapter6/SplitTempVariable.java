package com.ekang.refactoring.chapter6;

public class SplitTempVariable {
    private double _height;
    private double _width;
    private double _primaryForce;
    private double _secondaryForce;
    private double _mass;
    private int _delay;

    public SplitTempVariable() {}
    public SplitTempVariable(double pForce, double sForce, double mass, int delay) {
        this._primaryForce = pForce;
        this._secondaryForce = sForce;
        this._mass = mass;
        this._delay = delay;
    }

    public void example() {
        // make a separate temporary variable for each assignment
        final double perimeter = 2 * (_height + _width);
        System.out.println(perimeter);
        final double area = _height * _width;
        System.out.println(area);
    }

    /*
     * You have a temporary variable assigned to more than once,
     * but is not a loop variable nor a collecting temporary variable
     */

    /*
     * Temporary variables are made for various uses.
     * Some of these uses naturally lead to the temp's being assigned to several times.
     *
     * Loop variables change for each run around a loop
     * collecting temporary variables collect together some value that is built up during the method.
     *
     * Change the name of a temp at its declaration and its first assignment
     * Declare the new temp as final
     * Change all references of the temp up to its second assignment
     * Declare the temp at its second assignment
     * Compile and test
     */

    public double getDistanceTravelled (int time) {
        double result;
        final double primaryAcc = _primaryForce / _mass;
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;

        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * _delay;
            final double secondaryAcc = (_primaryForce + _secondaryForce) / _mass; // <--
            result += primaryVel + secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
        }

        return result;
    }
}
