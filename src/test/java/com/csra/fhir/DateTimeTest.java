/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:56:14 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DateTimeTest {

    @Test
    public void test0() throws Throwable {
        DateTime dateTime0 = new DateTime();
        dateTime0.setValue("");
        assertEquals("", dateTime0.getValue());
    }

    @Test
    public void test1() throws Throwable {
        DateTime dateTime0 = new DateTime();
        dateTime0.value = "9H9}&9T8`KQ.\b$:B";
        java.lang.String string0 = dateTime0.getValue();
        assertEquals("9H9}&9T8`KQ.\b$:B", string0);
    }

    @Test
    public void test2() throws Throwable {
        DateTime dateTime0 = new DateTime();
        dateTime0.value = "9H9}&9T8`KQ.\b$:B";
        dateTime0.value = "";
        java.lang.String string0 = dateTime0.getValue();
        assertEquals("", string0);
    }

    @Test
    public void test3() throws Throwable {
        DateTime dateTime0 = new DateTime();
        java.lang.String string0 = dateTime0.getValue();
        assertNull(string0);
    }
}
