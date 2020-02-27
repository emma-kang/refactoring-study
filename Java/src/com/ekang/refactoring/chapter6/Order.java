package com.ekang.refactoring.chapter6;

// have a long method that uses local variables in such a way that you cannot apply Extract Method
public abstract class Order {
    abstract double getAmount();
    abstract double basePrice();

    double price() {
        // 1. Using Replace Temp with Query (help to reduce this burden)
        // 2. Apply Replace Method with Method Object turns all local var into fields on the method obj
        // 3. Use Extract Method
        double primaryBasePrice = 1.2;
        double secondaryBasePrice = 2.3;
        double tertiaryBasePrice;

        // long computation
        // ...
        return primaryBasePrice + secondaryBasePrice;
    }

}



