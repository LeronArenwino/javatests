package com.leronarenwino.discounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PriceCalculatorTest {

    @Test
    void total_zero_when_there_are_prices() {
        PriceCalculator calculator = new PriceCalculator();
        assertEquals(calculator.getTotal(), 0.0);
    }

    @Test
    void total_is_the_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.2);
        calculator.addPrice(15.5);

        assertEquals(calculator.getTotal(), 25.7);
    }
}