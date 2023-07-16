package com.leronarenwino.util;

public class RomanNumerals {

    public static String arabicToRoman(int number) {

        StringBuilder result = new StringBuilder();

        while (number >= 1000){
            result.append("M");
            number -= 1000;
        }

        if (number >= 900) {
            result.append("CM");
            number -= 900;
        }

        if (number >= 500) {
            result.append("D");
            number -= 500;
        }

        if (number >= 400) {
            result.append("CD");
            number -= 400;
        }

        while (number >= 100){
            result.append("C");
            number -= 100;
        }

        if (number >= 90) {
            result.append("XC");
            number -= 90;
        }

        if (number >= 50) {
            result.append("L");
            number -= 50;
        }

        if (number >= 40) {
            result.append("XL");
            number -= 40;
        }

        while (number >= 10){
            result.append("X");
            number -= 10;
        }

        if (number == 9) {
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
