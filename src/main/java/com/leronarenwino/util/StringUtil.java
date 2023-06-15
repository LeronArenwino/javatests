package com.leronarenwino.util;

public class StringUtil {

    public static String repeat(String str, int times) {

        return String.valueOf(str).repeat(Math.max(0, times));

    }

}
