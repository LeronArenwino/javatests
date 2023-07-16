package com.leronarenwino.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    void return_roman_I_when_number_is_one() {
        assertEquals(RomanNumerals.arabicToRoman(1), "I");
    }

    @Test
    void return_roman_II_when_number_is_two() {
        assertEquals(RomanNumerals.arabicToRoman(2), "II");
    }

    @Test
    void return_roman_III_when_number_is_three() {
        assertEquals(RomanNumerals.arabicToRoman(3), "III");
    }

    @Test
    void return_roman_IV_when_number_is_four() {
        assertEquals(RomanNumerals.arabicToRoman(4), "IV");
    }

    @Test
    void return_roman_V_when_number_is_five() {
        assertEquals(RomanNumerals.arabicToRoman(5), "V");
    }

    @Test
    void return_roman_VI_when_number_is_six() {
        assertEquals(RomanNumerals.arabicToRoman(6), "VI");
    }

    @Test
    void return_roman_VII_when_number_is_seven() {
        assertEquals(RomanNumerals.arabicToRoman(7), "VII");
    }

    @Test
    void return_roman_IX_when_number_is_nine() {
        assertEquals(RomanNumerals.arabicToRoman(9), "IX");
    }

    @Test
    void return_roman_X_when_number_is_ten() {
        assertEquals(RomanNumerals.arabicToRoman(10), "X");
    }

    @Test
    void return_roman_XI_when_number_is_eleven() {
        assertEquals(RomanNumerals.arabicToRoman(11), "XI");
    }

    @Test
    void return_roman_XIV_when_number_is_fourteen() {
        assertEquals(RomanNumerals.arabicToRoman(14), "XIV");
    }

    @Test
    void return_roman_XV_when_number_is_fifteen() {
        assertEquals(RomanNumerals.arabicToRoman(15), "XV");
    }

}