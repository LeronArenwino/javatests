package com.leronarenwino.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilTest {

    @Test
    void return_true_when_year_is_divisible_by_400() {
        assertTrue(DateUtil.isLeapYear(1600));
    }

    @Test
    void return_false_when_year_is_divisible_by_100_but_not_by_400() {
        assertFalse(DateUtil.isLeapYear(1700));
    }

    @Test
    void return_true_when_year_is_divisible_by_4_but_not_by_400() {
        assertTrue(DateUtil.isLeapYear(1996));
    }

    @Test
    void return_false_when_year_is_not_divisible_by_4() {
        assertFalse(DateUtil.isLeapYear(2017));
    }
}