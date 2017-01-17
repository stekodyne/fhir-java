/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:22:17 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GuideDependencyTypeListTest {

    @Test
    public void test0() throws Throwable {
        GuideDependencyTypeList[] guideDependencyTypeListArray0 = GuideDependencyTypeList.values();
        assertNotNull(guideDependencyTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        GuideDependencyTypeList guideDependencyTypeList0 = GuideDependencyTypeList.valueOf("REFERENCE");
        assertEquals(0, guideDependencyTypeList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        GuideDependencyTypeList guideDependencyTypeList0 = GuideDependencyTypeList.valueOf("INCLUSION");
        assertEquals(GuideDependencyTypeList.INCLUSION, guideDependencyTypeList0);
    }

    @Test
    public void test3() throws Throwable {
        GuideDependencyTypeList guideDependencyTypeList0 = GuideDependencyTypeList.fromValue("inclusion");
        assertEquals("INCLUSION", guideDependencyTypeList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            GuideDependencyTypeList.valueOf((java.lang.String) null);
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
            GuideDependencyTypeList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.GuideDependencyTypeList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            GuideDependencyTypeList.fromValue("BllA3*iE");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // BllA3*iE
            //
            assertThrownBy("com.csra.fhir.GuideDependencyTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        GuideDependencyTypeList guideDependencyTypeList0 = GuideDependencyTypeList.fromValue("reference");
        assertEquals(0, guideDependencyTypeList0.ordinal());
    }

    @Test
    public void test8() throws Throwable {
        GuideDependencyTypeList guideDependencyTypeList0 = GuideDependencyTypeList.INCLUSION;
        java.lang.String string0 = guideDependencyTypeList0.value();
        assertEquals("inclusion", string0);
    }
}
