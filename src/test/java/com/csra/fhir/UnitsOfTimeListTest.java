/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:13:53 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class UnitsOfTimeListTest {

    @Test
    public void test0() throws Throwable {
        UnitsOfTimeList[] unitsOfTimeListArray0 = UnitsOfTimeList.values();
        assertNotNull(unitsOfTimeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        UnitsOfTimeList unitsOfTimeList0 = UnitsOfTimeList.valueOf("S");
        assertEquals(0, unitsOfTimeList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        UnitsOfTimeList unitsOfTimeList0 = UnitsOfTimeList.valueOf("H");
        assertEquals("h", unitsOfTimeList0.value());
    }

    @Test
    public void test3() throws Throwable {
        UnitsOfTimeList unitsOfTimeList0 = UnitsOfTimeList.fromValue("d");
        assertEquals(3, unitsOfTimeList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            UnitsOfTimeList.valueOf((java.lang.String) null);
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
            UnitsOfTimeList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.UnitsOfTimeList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        UnitsOfTimeList unitsOfTimeList0 = UnitsOfTimeList.fromValue("s");
        assertEquals("S", unitsOfTimeList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            UnitsOfTimeList.fromValue("Rt|x;Z)4G");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Rt|x;Z)4G
            //
            assertThrownBy("com.csra.fhir.UnitsOfTimeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        UnitsOfTimeList unitsOfTimeList0 = UnitsOfTimeList.MO;
        java.lang.String string0 = unitsOfTimeList0.value();
        assertEquals("mo", string0);
    }
}
