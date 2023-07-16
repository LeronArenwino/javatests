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

    @Test
    void return_roman_XVI_when_number_is_sixteen() {
        assertEquals(RomanNumerals.arabicToRoman(16), "XVI");
    }

    @Test
    void return_roman_XIX_when_number_is_nineteen() {
        assertEquals(RomanNumerals.arabicToRoman(19), "XIX");
    }

    @Test
    void return_roman_XXIV_when_number_is_twenty_four() {
        assertEquals(RomanNumerals.arabicToRoman(24), "XXIV");
    }

    @Test
    void return_roman_XL_when_number_is_forty() {
        assertEquals(RomanNumerals.arabicToRoman(40), "XL");
    }

    @Test
    void return_roman_IL_when_number_is_forty_nine() {
        assertEquals(RomanNumerals.arabicToRoman(49), "XLIX");
    }

    @Test
    void return_roman_L_when_number_is_fifty() {
        assertEquals(RomanNumerals.arabicToRoman(50), "L");
    }

    @Test
    void return_roman_LI_when_number_is_fifty_one() {
        assertEquals(RomanNumerals.arabicToRoman(51), "LI");
    }

    @Test
    void return_roman_LV_when_number_is_fifty_five() {
        assertEquals(RomanNumerals.arabicToRoman(55), "LV");
    }

    @Test
    void return_roman_LVI_when_number_is_fifty_six() {
        assertEquals(RomanNumerals.arabicToRoman(56), "LVI");
    }

    @Test
    void return_roman_LX_when_number_is_sixty() {
        assertEquals(RomanNumerals.arabicToRoman(60), "LX");
    }

    @Test
    void return_roman_LXX_when_number_is_seventy() {
        assertEquals(RomanNumerals.arabicToRoman(70), "LXX");
    }

    @Test
    void return_roman_LXXX_when_number_is_eighty() {
        assertEquals(RomanNumerals.arabicToRoman(80), "LXXX");
    }

    @Test
    void return_roman_LXXXI_when_number_is_eighty_one() {
        assertEquals(RomanNumerals.arabicToRoman(81), "LXXXI");
    }

    @Test
    void return_roman_LXXXV_when_number_is_eighty_five() {
        assertEquals(RomanNumerals.arabicToRoman(85), "LXXXV");
    }

    @Test
    void return_roman_LXXXVI_when_number_is_eighty_six() {
        assertEquals(RomanNumerals.arabicToRoman(86), "LXXXVI");
    }

    @Test
    void return_roman_XC_when_number_is_ninety() {
        assertEquals(RomanNumerals.arabicToRoman(90), "XC");
    }

    @Test
    void return_roman_XCIX_when_number_is_ninety_nine() {
        assertEquals(RomanNumerals.arabicToRoman(99), "XCIX");
    }

    @Test
    void return_roman_CXXVI_when_number_is_one_hundred_twenty_six() {
        assertEquals(RomanNumerals.arabicToRoman(126), "CXXVI");
    }

    @Test
    void return_roman_CD_when_number_is_four_hundred() {
        assertEquals(RomanNumerals.arabicToRoman(400), "CD");
    }

    @Test
    void return_roman_CM_when_number_is_nine_hundred() {
        assertEquals(RomanNumerals.arabicToRoman(900), "CM");
    }

    @Test
    void return_roman_MMDVII_when_number_is_two_thousand_five_hundred_seven() {
        assertEquals(RomanNumerals.arabicToRoman(2507), "MMDVII");
    }

}
