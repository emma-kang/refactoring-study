package com.ekang.refactoring.chapter6;

// have a long method that uses local variables in such a way that you cannot apply Extract Method
public abstract class Order {
    abstract double getAmount();
    abstract double basePrice();

    double price() {
        double primaryBasePrice;
        double secondaryBasePrice;
        double tertiaryBasePrice;
        double result = 0;

        // long computation
        // ...
        return result;
    }

}



