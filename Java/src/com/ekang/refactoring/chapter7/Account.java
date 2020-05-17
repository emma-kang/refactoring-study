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
    // If a lot of methods use the interest rate field, use Self-Encapsulate Field
    double interestForAmount_days (double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    // Self-Encapsulation allows to take a smaller step 
    private void setInterestRate (double arg) {
        _interestRate = arg;
        // second way
        // _type.setInterestRate(arg);
    }

    private double getInterestRate() {
        return _interestRate;
        // second way
        // _type.getInterestRate();
    }
}
