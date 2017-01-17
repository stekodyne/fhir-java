/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:57:59 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ConformanceEventModeListTest {

    @Test
    public void test0() throws Throwable {
        ConformanceEventModeList[] conformanceEventModeListArray0 = ConformanceEventModeList.values();
        assertNotNull(conformanceEventModeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ConformanceEventModeList conformanceEventModeList0 = ConformanceEventModeList.valueOf("SENDER");
        assertEquals(ConformanceEventModeList.SENDER, conformanceEventModeList0);
    }

    @Test
    public void test2() throws Throwable {
        ConformanceEventModeList conformanceEventModeList0 = ConformanceEventModeList.fromValue("receiver");
        assertEquals("RECEIVER", conformanceEventModeList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            ConformanceEventModeList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ConformanceEventModeList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ConformanceEventModeList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        ConformanceEventModeList conformanceEventModeList0 = ConformanceEventModeList.fromValue("sender");
        assertEquals(0, conformanceEventModeList0.ordinal());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ConformanceEventModeList.fromValue("zYeder");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // zYeder
            //
            assertThrownBy("com.csra.fhir.ConformanceEventModeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ConformanceEventModeList conformanceEventModeList0 = ConformanceEventModeList.valueOf("RECEIVER");
        java.lang.String string0 = conformanceEventModeList0.value();
        assertEquals("receiver", string0);
    }
}
