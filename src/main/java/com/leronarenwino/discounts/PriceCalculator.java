package com.leronarenwino.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private final List<Double> prices = new ArrayList<>();

    public double getTotal() {

        double result = 0;

        for (Double price : prices) {
            result += price;
        }

        return result;
    }

    public void addPrice(double price) {
        prices.add(price);
    }
}
