/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:01:50 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GuideResourcePurposeListTest {

    @Test
    public void test0() throws Throwable {
        GuideResourcePurposeList[] guideResourcePurposeListArray0 = GuideResourcePurposeList.values();
        assertNotNull(guideResourcePurposeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        GuideResourcePurposeList guideResourcePurposeList0 = GuideResourcePurposeList.valueOf("EXAMPLE");
        assertEquals(0, guideResourcePurposeList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        GuideResourcePurposeList guideResourcePurposeList0 = GuideResourcePurposeList.valueOf("TERMINOLOGY");
        assertEquals("TERMINOLOGY", guideResourcePurposeList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        GuideResourcePurposeList guideResourcePurposeList0 = GuideResourcePurposeList.fromValue("example");
        assertEquals(0, guideResourcePurposeList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            GuideResourcePurposeList.valueOf((java.lang.String) null);
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
            GuideResourcePurposeList.valueOf("QN%lJT=B9");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.GuideResourcePurposeList.QN%lJT=B9
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            GuideResourcePurposeList.fromValue(":(^%ha,2oJIQ");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // :(^%ha,2oJIQ
            //
            assertThrownBy("com.csra.fhir.GuideResourcePurposeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        GuideResourcePurposeList guideResourcePurposeList0 = GuideResourcePurposeList.fromValue("logical");
        java.lang.String string0 = guideResourcePurposeList0.value();
        assertEquals("logical", string0);
    }
}
