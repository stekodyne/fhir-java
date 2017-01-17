/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:49:57 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringTest {

    @Test
    public void test0() throws Throwable {
        String string0 = new String();
        string0.value = "";
        java.lang.String string1 = string0.getValue();
        assertEquals("", string1);
    }

    @Test
    public void test1() throws Throwable {
        String string0 = new String();
        java.lang.String string1 = string0.getValue();
        assertNull(string1);
    }

    @Test
    public void test2() throws Throwable {
        String string0 = new String();
        string0.setValue("&r5efWw_y6tDh`");
        java.lang.String string1 = string0.getValue();
        assertEquals("&r5efWw_y6tDh`", string1);
    }
}
