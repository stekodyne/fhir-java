/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:25:51 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UuidTest {

    @Test
    public void test0() throws Throwable {
        Uuid uuid0 = new Uuid();
        uuid0.value = "E`69y[)+aLC:@f1CCa";
        java.lang.String string0 = uuid0.getValue();
        assertEquals("E`69y[)+aLC:@f1CCa", string0);
    }

    @Test
    public void test1() throws Throwable {
        Uuid uuid0 = new Uuid();
        uuid0.value = "";
        java.lang.String string0 = uuid0.getValue();
        assertEquals("", string0);
    }

    @Test
    public void test2() throws Throwable {
        Uuid uuid0 = new Uuid();
        uuid0.setValue("=q*J9v");
        assertNull(uuid0.getId());
    }

    @Test
    public void test3() throws Throwable {
        Uuid uuid0 = new Uuid();
        java.lang.String string0 = uuid0.getValue();
        assertNull(string0);
    }
}
