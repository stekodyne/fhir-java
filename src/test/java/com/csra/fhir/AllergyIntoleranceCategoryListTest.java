/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:47:42 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AllergyIntoleranceCategoryListTest {

    @Test
    public void test0() throws Throwable {
        AllergyIntoleranceCategoryList[] allergyIntoleranceCategoryListArray0 = AllergyIntoleranceCategoryList.values();
        assertNotNull(allergyIntoleranceCategoryListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AllergyIntoleranceCategoryList allergyIntoleranceCategoryList0 = AllergyIntoleranceCategoryList.valueOf("FOOD");
        assertEquals("FOOD", allergyIntoleranceCategoryList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        AllergyIntoleranceCategoryList allergyIntoleranceCategoryList0 = AllergyIntoleranceCategoryList.valueOf("OTHER");
        assertEquals("OTHER", allergyIntoleranceCategoryList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        AllergyIntoleranceCategoryList allergyIntoleranceCategoryList0 = AllergyIntoleranceCategoryList.fromValue("environment");
        assertEquals("ENVIRONMENT", allergyIntoleranceCategoryList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AllergyIntoleranceCategoryList.valueOf((java.lang.String) null);
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
            AllergyIntoleranceCategoryList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AllergyIntoleranceCategoryList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        AllergyIntoleranceCategoryList allergyIntoleranceCategoryList0 = AllergyIntoleranceCategoryList.fromValue("food");
        assertEquals("FOOD", allergyIntoleranceCategoryList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            AllergyIntoleranceCategoryList.fromValue("|Ko:k;xm'ne%i");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // |Ko:k;xm'ne%i
            //
            assertThrownBy("com.csra.fhir.AllergyIntoleranceCategoryList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        AllergyIntoleranceCategoryList allergyIntoleranceCategoryList0 = AllergyIntoleranceCategoryList.FOOD;
        java.lang.String string0 = allergyIntoleranceCategoryList0.value();
        assertEquals("food", string0);
    }
}
