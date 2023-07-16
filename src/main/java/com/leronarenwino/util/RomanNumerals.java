package com.leronarenwino.util;

public class RomanNumerals {

    public static String arabicToRoman(int number) {

        StringBuilder result = new StringBuilder();

        while (number >= 10){
            result.append("X");
            number -= 10;
        }

        if (number >= 9) {
            result.append("IX");
            number -= 9;
        }

        if (number >= 5) {
            result.append("V");
            number -= 5;
        }

        if (number >= 4) {
            result.append("IV");
            number -= 4;
        }

        while (number >= 1){
            result.append("I");
            number--;
        }

        return result.toString();

    }

}