/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:57:38 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CodeTest {

    @Test
    public void test0() throws Throwable {
        Code code0 = new Code();
        code0.setValue("oh[esi}%xe");
        java.lang.String string0 = code0.getValue();
        assertEquals("oh[esi}%xe", string0);
    }

    @Test
    public void test1() throws Throwable {
        Code code0 = new Code();
        code0.value = "fPs%snx2ak1";
        code0.value = "";
        java.lang.String string0 = code0.getValue();
        assertEquals("", string0);
    }

    @Test
    public void test2() throws Throwable {
        Code code0 = new Code();
        java.lang.String string0 = code0.getValue();
        assertNull(string0);
    }
}
