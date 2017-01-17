/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:03:02 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ConformanceResourceStatusListTest {

    @Test
    public void test0() throws Throwable {
        ConformanceResourceStatusList[] conformanceResourceStatusListArray0 = ConformanceResourceStatusList.values();
        assertNotNull(conformanceResourceStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ConformanceResourceStatusList conformanceResourceStatusList0 = ConformanceResourceStatusList.valueOf("DRAFT");
        assertEquals(0, conformanceResourceStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        ConformanceResourceStatusList conformanceResourceStatusList0 = ConformanceResourceStatusList.valueOf("ACTIVE");
        assertEquals("ACTIVE", conformanceResourceStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        ConformanceResourceStatusList conformanceResourceStatusList0 = ConformanceResourceStatusList.fromValue("retired");
        assertEquals(2, conformanceResourceStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ConformanceResourceStatusList.valueOf((java.lang.String) null);
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
            ConformanceResourceStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ConformanceResourceStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ConformanceResourceStatusList conformanceResourceStatusList0 = ConformanceResourceStatusList.fromValue("draft");
        assertEquals("DRAFT", conformanceResourceStatusList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ConformanceResourceStatusList.fromValue("ll3pyHO]rojI");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ll3pyHO]rojI
            //
            assertThrownBy("com.csra.fhir.ConformanceResourceStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ConformanceResourceStatusList conformanceResourceStatusList0 = ConformanceResourceStatusList.DRAFT;
        java.lang.String string0 = conformanceResourceStatusList0.value();
        assertEquals("draft", string0);
    }
}
