package com.leronarenwino.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("Hello", StringUtil.repeat("Hello", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("HelloHelloHello", StringUtil.repeat("Hello", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("Hello", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("Hello", -1);
    }

    @Test
    public void not_empty_string() {
        Assert.assertFalse(StringUtil.isEmpty("a"));
    }

    @Test
    public void empty_string() {
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_string() {
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void space_string() {
        Assert.assertTrue(StringUtil.isEmpty(" "));
    }
}