/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:52:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ListModeListTest {

    @Test
    public void test0() throws Throwable {
        ListModeList[] listModeListArray0 = ListModeList.values();
        assertNotNull(listModeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ListModeList listModeList0 = ListModeList.valueOf("WORKING");
        assertEquals("working", listModeList0.value());
    }

    @Test
    public void test2() throws Throwable {
        ListModeList listModeList0 = ListModeList.valueOf("CHANGES");
        assertEquals(2, listModeList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        ListModeList listModeList0 = ListModeList.fromValue("snapshot");
        assertEquals("SNAPSHOT", listModeList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ListModeList.valueOf((java.lang.String) null);
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
            ListModeList.valueOf("l\"L");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ListModeList.l\"L
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ListModeList listModeList0 = ListModeList.fromValue("working");
        assertEquals(0, listModeList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ListModeList.fromValue("P(8");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // P(8
            //
            assertThrownBy("com.csra.fhir.ListModeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ListModeList listModeList0 = ListModeList.SNAPSHOT;
        java.lang.String string0 = listModeList0.value();
        assertEquals("snapshot", string0);
    }
}
