package com.ekang.refactoring.chapter7;

public class AccountType {
    // Move Field Example
    private double _interestRate;

    void setInterestRate (double arg) {
        _interestRate = arg;
    }

    double getInterestRate() {
        return _interestRate;
    }

    double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) result += (daysOverdrawn - 7) * 0.85;
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }

    boolean isPremium() {
        return true;
    }
}
