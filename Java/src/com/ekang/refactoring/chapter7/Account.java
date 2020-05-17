package com.ekang.refactoring.chapter7;

/**
 * 2020-05-17
 * Chapter 7. Moving Features Between Objects
 */

public class Account {
    private AccountType _type;
    private int _daysOverdrawn;
    private double _interestRate;

    double overdraftCharge() {
        return _type.overdraftCharge(_daysOverdrawn);
    }

    double bankCharge() {
        double result = 4.5;
        if (_daysOverdrawn > 0) result += overdraftCharge();
        return result;
    }

    // Move field Example
    double interestForAmount_days (double amount, int days) {
        return _type.getInterestRate() * amount * days / 365;
    }
}
