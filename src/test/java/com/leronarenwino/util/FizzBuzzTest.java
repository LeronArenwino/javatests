package com.leronarenwino.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void return_fizz_when_number_is_divisible_by_three() {
        assertEquals(FizzBuzz.fizzBuzz(3), "Fizz");
    }

    @Test
    void return_buzz_when_number_is_divisible_by_five() {
        assertEquals(FizzBuzz.fizzBuzz(5), "Buzz");
    }

    @Test
    void return_fizz_buzz_when_number_is_divisible_by_three_and_five() {
        assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz");
    }

    @Test
    void return_number_when_number_is_not_divisible_by_three_or_five() {
        assertEquals(FizzBuzz.fizzBuzz(2), "2");
    }
}