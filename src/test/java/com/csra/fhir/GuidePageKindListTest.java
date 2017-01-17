/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:04:51 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GuidePageKindListTest {

    @Test
    public void test0() throws Throwable {
        GuidePageKindList[] guidePageKindListArray0 = GuidePageKindList.values();
        assertNotNull(guidePageKindListArray0);
    }

    @Test
    public void test1() throws Throwable {
        GuidePageKindList guidePageKindList0 = GuidePageKindList.valueOf("PAGE");
        assertEquals("page", guidePageKindList0.value());
    }

    @Test
    public void test2() throws Throwable {
        GuidePageKindList guidePageKindList0 = GuidePageKindList.valueOf("DIRECTORY");
        assertEquals("DIRECTORY", guidePageKindList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        GuidePageKindList guidePageKindList0 = GuidePageKindList.fromValue("toc");
        assertEquals(6, guidePageKindList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            GuidePageKindList.valueOf((java.lang.String) null);
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
            GuidePageKindList.valueOf("page");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.GuidePageKindList.page
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        GuidePageKindList guidePageKindList0 = GuidePageKindList.fromValue("page");
        assertEquals(0, guidePageKindList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            GuidePageKindList.fromValue("DIRECTORY");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // DIRECTORY
            //
            assertThrownBy("com.csra.fhir.GuidePageKindList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        GuidePageKindList guidePageKindList0 = GuidePageKindList.RESOURCE;
        java.lang.String string0 = guidePageKindList0.value();
        assertEquals("resource", string0);
    }
}
