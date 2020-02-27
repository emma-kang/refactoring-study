package com.ekang.refactoring.chapter6;
/*
 * If you pass in an object named foo, in the parameter, assigning to the parameter
 * means to change foo to refer to a different object.
 *
 * The lack of clarity and to confusion between
 * pass by value and pass by reference
 * foo.modifyInSomeWay(); // OK
 * foo = anotherObject; // trouble
 *
 * Create a temporary variable for the parameter
 * Replace all references to the parameter, made after the assignment, to the temporary variable.
 * Change the assignment to assign to the temporary variable
 * Compile and test
 */

public class RemoveAssignToParam {

    public int discount(int inputVal, int quantity, int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10000) result -= 4;

        return result;
    }
}
