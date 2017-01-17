/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:19:05 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ClinicalImpressionStatusListTest {

    @Test
    public void test0() throws Throwable {
        ClinicalImpressionStatusList[] clinicalImpressionStatusListArray0 = ClinicalImpressionStatusList.values();
        assertNotNull(clinicalImpressionStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ClinicalImpressionStatusList clinicalImpressionStatusList0 = ClinicalImpressionStatusList.valueOf("IN_PROGRESS");
        assertEquals(0, clinicalImpressionStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        ClinicalImpressionStatusList clinicalImpressionStatusList0 = ClinicalImpressionStatusList.valueOf("COMPLETED");
        assertEquals("completed", clinicalImpressionStatusList0.value());
    }

    @Test
    public void test3() throws Throwable {
        ClinicalImpressionStatusList clinicalImpressionStatusList0 = ClinicalImpressionStatusList.fromValue("in-progress");
        assertEquals(0, clinicalImpressionStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ClinicalImpressionStatusList.valueOf((java.lang.String) null);
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
            ClinicalImpressionStatusList.valueOf("8ME}'");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ClinicalImpressionStatusList.8ME}'
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ClinicalImpressionStatusList clinicalImpressionStatusList0 = ClinicalImpressionStatusList.fromValue("entered-in-error");
        assertEquals("ENTERED_IN_ERROR", clinicalImpressionStatusList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ClinicalImpressionStatusList.fromValue("entered-in-esrWs");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // entered-in-esrWs
            //
            assertThrownBy("com.csra.fhir.ClinicalImpressionStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ClinicalImpressionStatusList clinicalImpressionStatusList0 = ClinicalImpressionStatusList.IN_PROGRESS;
        java.lang.String string0 = clinicalImpressionStatusList0.value();
        assertEquals("in-progress", string0);
    }
}
