/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:16:02 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DetectedIssueSeverityListTest {

    @Test
    public void test0() throws Throwable {
        DetectedIssueSeverityList[] detectedIssueSeverityListArray0 = DetectedIssueSeverityList.values();
        assertNotNull(detectedIssueSeverityListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DetectedIssueSeverityList detectedIssueSeverityList0 = DetectedIssueSeverityList.valueOf("HIGH");
        assertEquals("HIGH", detectedIssueSeverityList0.name());
    }

    @Test
    public void test2() throws Throwable {
        DetectedIssueSeverityList detectedIssueSeverityList0 = DetectedIssueSeverityList.valueOf("MODERATE");
        assertEquals("MODERATE", detectedIssueSeverityList0.name());
    }

    @Test
    public void test3() throws Throwable {
        DetectedIssueSeverityList detectedIssueSeverityList0 = DetectedIssueSeverityList.fromValue("moderate");
        assertEquals("MODERATE", detectedIssueSeverityList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DetectedIssueSeverityList.valueOf((java.lang.String) null);
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
            DetectedIssueSeverityList.valueOf("low");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DetectedIssueSeverityList.low
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DetectedIssueSeverityList detectedIssueSeverityList0 = DetectedIssueSeverityList.fromValue("high");
        assertEquals("HIGH", detectedIssueSeverityList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DetectedIssueSeverityList.fromValue("HIGH");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // HIGH
            //
            assertThrownBy("com.csra.fhir.DetectedIssueSeverityList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DetectedIssueSeverityList detectedIssueSeverityList0 = DetectedIssueSeverityList.MODERATE;
        java.lang.String string0 = detectedIssueSeverityList0.value();
        assertEquals("moderate", string0);
    }
}
