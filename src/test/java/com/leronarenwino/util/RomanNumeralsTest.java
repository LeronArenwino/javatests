package com.leronarenwino.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    void return_roman_I_when_number_is_one() {
        assertEquals(RomanNumerals.arabicToRoman(1), "I");
    }

    @Test
    void return_roman_I_when_number_is_two() {
        assertEquals(RomanNumerals.arabicToRoman(2), "II");
    }

    @Test
    void return_roman_IV_when_number_is_four() {
        assertEquals(RomanNumerals.arabicToRoman(4), "IV");
    }

    @Test
    void return_roman_V_when_number_is_five() {
        assertEquals(RomanNumerals.arabicToRoman(5), "V");
    }

}