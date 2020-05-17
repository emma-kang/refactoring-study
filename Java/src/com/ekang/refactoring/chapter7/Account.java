package com.ekang.refactoring.chapter7;

/**
 * 2020-05-17
 * Chapter 7. Moving Features Between Objects
 * Move Method Example
 * Imagine that there are going to be several new account types
 * Each of which has its own rule for calculating the overdraft charge
 */

public class Account {
    private AccountType _type;

    // this field should remain because it will vary with individual accounts
    private int _daysOverdrawn;

    // Move method target 
    double overdraftCharge() {
        if (_type.isPremium()) {
            double result = 10;
            if (_daysOverdrawn > 7) result += (_daysOverdrawn - 7) * 0.85;

            return result;
        } else {
            return _daysOverdrawn * 1.75;
        }
    }

    double bankCharge() {
        double result = 4.5;
        if (_daysOverdrawn > 0) result += overdraftCharge();
        return result;
    }
}
