/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:30:31 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class MeasmntPrincipleListTest {

    @Test
    public void test0() throws Throwable {
        MeasmntPrincipleList[] measmntPrincipleListArray0 = MeasmntPrincipleList.values();
        assertNotNull(measmntPrincipleListArray0);
    }

    @Test
    public void test1() throws Throwable {
        MeasmntPrincipleList measmntPrincipleList0 = MeasmntPrincipleList.valueOf("OTHER");
        assertEquals("OTHER", measmntPrincipleList0.name());
    }

    @Test
    public void test2() throws Throwable {
        MeasmntPrincipleList measmntPrincipleList0 = MeasmntPrincipleList.valueOf("IMPEDANCE");
        assertEquals("impedance", measmntPrincipleList0.value());
    }

    @Test
    public void test3() throws Throwable {
        MeasmntPrincipleList measmntPrincipleList0 = MeasmntPrincipleList.fromValue("other");
        assertEquals("OTHER", measmntPrincipleList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            MeasmntPrincipleList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            MeasmntPrincipleList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.MeasmntPrincipleList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        MeasmntPrincipleList measmntPrincipleList0 = MeasmntPrincipleList.fromValue("manual");
        assertEquals(10, measmntPrincipleList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            MeasmntPrincipleList.fromValue("u^$x$F!]OSv");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // u^$x$F!]OSv
            //
            assertThrownBy("com.csra.fhir.MeasmntPrincipleList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        MeasmntPrincipleList measmntPrincipleList0 = MeasmntPrincipleList.MANUAL;
        java.lang.String string0 = measmntPrincipleList0.value();
        assertEquals("manual", string0);
    }
}
