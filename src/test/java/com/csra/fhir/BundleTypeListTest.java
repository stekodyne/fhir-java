/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:41:07 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class BundleTypeListTest {

    @Test
    public void test0() throws Throwable {
        BundleTypeList[] bundleTypeListArray0 = BundleTypeList.values();
        assertNotNull(bundleTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        BundleTypeList bundleTypeList0 = BundleTypeList.valueOf("DOCUMENT");
        assertEquals("document", bundleTypeList0.value());
    }

    @Test
    public void test2() throws Throwable {
        BundleTypeList bundleTypeList0 = BundleTypeList.valueOf("HISTORY");
        assertEquals(6, bundleTypeList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        BundleTypeList bundleTypeList0 = BundleTypeList.fromValue("message");
        assertEquals("MESSAGE", bundleTypeList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            BundleTypeList.valueOf((java.lang.String) null);
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
            BundleTypeList.valueOf("*");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.BundleTypeList.*
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        BundleTypeList bundleTypeList0 = BundleTypeList.fromValue("document");
        assertEquals(0, bundleTypeList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            BundleTypeList.fromValue("zqnmro+lkwT+z[gSm");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // zqnmro+lkwT+z[gSm
            //
            assertThrownBy("com.csra.fhir.BundleTypeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        BundleTypeList bundleTypeList0 = BundleTypeList.DOCUMENT;
        java.lang.String string0 = bundleTypeList0.value();
        assertEquals("document", string0);
    }
}
