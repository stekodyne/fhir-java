/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:16:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DaysOfWeekListTest {

    @Test
    public void test0() throws Throwable {
        DaysOfWeekList[] daysOfWeekListArray0 = DaysOfWeekList.values();
        assertNotNull(daysOfWeekListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DaysOfWeekList daysOfWeekList0 = DaysOfWeekList.valueOf("MON");
        assertEquals(0, daysOfWeekList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        DaysOfWeekList daysOfWeekList0 = DaysOfWeekList.valueOf("SAT");
        assertEquals("sat", daysOfWeekList0.value());
    }

    @Test
    public void test3() throws Throwable {
        DaysOfWeekList daysOfWeekList0 = DaysOfWeekList.fromValue("mon");
        assertEquals("mon", daysOfWeekList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DaysOfWeekList.valueOf((java.lang.String) null);
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
            DaysOfWeekList.valueOf("sat");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DaysOfWeekList.sat
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DaysOfWeekList daysOfWeekList0 = DaysOfWeekList.fromValue("sat");
        assertEquals("sat", daysOfWeekList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DaysOfWeekList.fromValue("?eGI3&h\"[D%@lU");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ?eGI3&h\"[D%@lU
            //
            assertThrownBy("com.csra.fhir.DaysOfWeekList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DaysOfWeekList daysOfWeekList0 = DaysOfWeekList.SAT;
        java.lang.String string0 = daysOfWeekList0.value();
        assertEquals("sat", string0);
    }
}
