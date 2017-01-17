/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:32:12 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IdTest {

    @Test
    public void test0() throws Throwable {
        Id id0 = new Id();
        id0.setValue("0*j=WoK\"_");
        assertEquals("0*j=WoK\"_", id0.getValue());
    }

    @Test
    public void test1() throws Throwable {
        Id id0 = new Id();
        id0.value = "h*TC>{%CRFgK)a_2-.#";
        java.lang.String string0 = id0.getValue();
        assertEquals("h*TC>{%CRFgK)a_2-.#", string0);
    }

    @Test
    public void test2() throws Throwable {
        Id id0 = new Id();
        id0.value = "";
        java.lang.String string0 = id0.getValue();
        assertEquals("", string0);
    }

    @Test
    public void test3() throws Throwable {
        Id id0 = new Id();
        java.lang.String string0 = id0.getValue();
        assertNull(string0);
    }
}
