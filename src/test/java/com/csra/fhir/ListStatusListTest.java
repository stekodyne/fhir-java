/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:47:43 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ListStatusListTest {

    @Test
    public void test0() throws Throwable {
        ListStatusList[] listStatusListArray0 = ListStatusList.values();
        assertNotNull(listStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ListStatusList listStatusList0 = ListStatusList.valueOf("CURRENT");
        assertEquals(0, listStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        ListStatusList listStatusList0 = ListStatusList.valueOf("RETIRED");
        assertEquals(ListStatusList.RETIRED, listStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        ListStatusList listStatusList0 = ListStatusList.fromValue("entered-in-error");
        assertEquals("ENTERED_IN_ERROR", listStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ListStatusList.valueOf((java.lang.String) null);
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
            ListStatusList.valueOf("current");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ListStatusList.current
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ListStatusList listStatusList0 = ListStatusList.fromValue("current");
        assertEquals("CURRENT", listStatusList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ListStatusList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.ListStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ListStatusList listStatusList0 = ListStatusList.CURRENT;
        java.lang.String string0 = listStatusList0.value();
        assertEquals("current", string0);
    }
}
