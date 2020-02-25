package com.ekang.refactoring.chapter6;

public class ReplaceTempWithQuery {
    private int _quantity;
    private int _itemPrice;

    public double getPrice() {
        final int basePrice = _quantity * _itemPrice;
        final double discountFactor;

        if(basePrice > 1000)
            discountFactor = 0.95;
        else
            discountFactor = 0.98;

        return basePrice * discountFactor;
    }
}
