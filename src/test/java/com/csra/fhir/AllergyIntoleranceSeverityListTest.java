/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:27:03 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AllergyIntoleranceSeverityListTest {

    @Test
    public void test0() throws Throwable {
        AllergyIntoleranceSeverityList[] allergyIntoleranceSeverityListArray0 = AllergyIntoleranceSeverityList.values();
        assertNotNull(allergyIntoleranceSeverityListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AllergyIntoleranceSeverityList allergyIntoleranceSeverityList0 = AllergyIntoleranceSeverityList.valueOf("MILD");
        assertEquals(0, allergyIntoleranceSeverityList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        AllergyIntoleranceSeverityList allergyIntoleranceSeverityList0 = AllergyIntoleranceSeverityList.valueOf("MODERATE");
        assertEquals(AllergyIntoleranceSeverityList.MODERATE, allergyIntoleranceSeverityList0);
    }

    @Test
    public void test3() throws Throwable {
        AllergyIntoleranceSeverityList allergyIntoleranceSeverityList0 = AllergyIntoleranceSeverityList.fromValue("mild");
        assertEquals("MILD", allergyIntoleranceSeverityList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AllergyIntoleranceSeverityList.valueOf((java.lang.String) null);
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
            AllergyIntoleranceSeverityList.valueOf("}:]lxmH");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AllergyIntoleranceSeverityList.}:]lxmH
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            AllergyIntoleranceSeverityList.fromValue((java.lang.String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("com.csra.fhir.AllergyIntoleranceSeverityList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        AllergyIntoleranceSeverityList allergyIntoleranceSeverityList0 = AllergyIntoleranceSeverityList.fromValue("moderate");
        java.lang.String string0 = allergyIntoleranceSeverityList0.value();
        assertEquals("moderate", string0);
    }
}
