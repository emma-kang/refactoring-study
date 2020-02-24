package com.ekang.refactoring.chapter6;

public class InlineMethod {
    private int _numberOfLateDeliveries;

    public int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    public boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }
}
