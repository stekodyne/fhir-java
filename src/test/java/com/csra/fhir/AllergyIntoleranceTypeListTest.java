/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:03:31 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AllergyIntoleranceTypeListTest {

    @Test
    public void test0() throws Throwable {
        AllergyIntoleranceTypeList[] allergyIntoleranceTypeListArray0 = AllergyIntoleranceTypeList.values();
        assertNotNull(allergyIntoleranceTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AllergyIntoleranceTypeList allergyIntoleranceTypeList0 = AllergyIntoleranceTypeList.valueOf("ALLERGY");
        assertEquals(AllergyIntoleranceTypeList.ALLERGY, allergyIntoleranceTypeList0);
    }

    @Test
    public void test2() throws Throwable {
        AllergyIntoleranceTypeList allergyIntoleranceTypeList0 = AllergyIntoleranceTypeList.valueOf("INTOLERANCE");
        assertEquals("intolerance", allergyIntoleranceTypeList0.value());
    }

    @Test
    public void test3() throws Throwable {
        AllergyIntoleranceTypeList allergyIntoleranceTypeList0 = AllergyIntoleranceTypeList.fromValue("intolerance");
        assertEquals(1, allergyIntoleranceTypeList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AllergyIntoleranceTypeList.valueOf((java.lang.String) null);
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
            AllergyIntoleranceTypeList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AllergyIntoleranceTypeList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        AllergyIntoleranceTypeList allergyIntoleranceTypeList0 = AllergyIntoleranceTypeList.fromValue("allergy");
        assertEquals(0, allergyIntoleranceTypeList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            AllergyIntoleranceTypeList.fromValue("INTOLERANCE");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // INTOLERANCE
            //
            assertThrownBy("com.csra.fhir.AllergyIntoleranceTypeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        AllergyIntoleranceTypeList allergyIntoleranceTypeList0 = AllergyIntoleranceTypeList.INTOLERANCE;
        java.lang.String string0 = allergyIntoleranceTypeList0.value();
        assertEquals("intolerance", string0);
    }
}
