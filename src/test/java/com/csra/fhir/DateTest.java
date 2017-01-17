/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:23:21 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

public class DateTest {

    @Test
    public void test0() throws Throwable {
        Date date0 = new Date();
        date0.setValue("a{M&^)");
        date0.getValue();
    }

    @Test
    public void test1() throws Throwable {
        Date date0 = new Date();
        date0.value = "";
        date0.getValue();
    }

    @Test
    public void test2() throws Throwable {
        Date date0 = new Date();
        date0.getValue();
    }
}
