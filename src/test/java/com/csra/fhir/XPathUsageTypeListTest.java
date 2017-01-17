/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:03:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class XPathUsageTypeListTest {

    @Test
    public void test0() throws Throwable {
        XPathUsageTypeList[] xPathUsageTypeListArray0 = XPathUsageTypeList.values();
        assertNotNull(xPathUsageTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        XPathUsageTypeList xPathUsageTypeList0 = XPathUsageTypeList.valueOf("NORMAL");
        assertEquals("NORMAL", xPathUsageTypeList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        XPathUsageTypeList xPathUsageTypeList0 = XPathUsageTypeList.valueOf("NEARBY");
        assertEquals("NEARBY", xPathUsageTypeList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        XPathUsageTypeList xPathUsageTypeList0 = XPathUsageTypeList.fromValue("other");
        assertEquals("OTHER", xPathUsageTypeList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            XPathUsageTypeList.valueOf((java.lang.String) null);
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
            XPathUsageTypeList.valueOf("$VALUES");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.XPathUsageTypeList.$VALUES
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        XPathUsageTypeList xPathUsageTypeList0 = XPathUsageTypeList.fromValue("normal");
        assertEquals("normal", xPathUsageTypeList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            XPathUsageTypeList.fromValue("H");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // H
            //
            assertThrownBy("com.csra.fhir.XPathUsageTypeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        XPathUsageTypeList xPathUsageTypeList0 = XPathUsageTypeList.NORMAL;
        java.lang.String string0 = xPathUsageTypeList0.value();
        assertEquals("normal", string0);
    }
}
