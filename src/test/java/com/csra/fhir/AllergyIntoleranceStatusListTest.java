/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:13:46 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AllergyIntoleranceStatusListTest {

    @Test
    public void test0() throws Throwable {
        AllergyIntoleranceStatusList[] allergyIntoleranceStatusListArray0 = AllergyIntoleranceStatusList.values();
        assertNotNull(allergyIntoleranceStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AllergyIntoleranceStatusList allergyIntoleranceStatusList0 = AllergyIntoleranceStatusList.valueOf("ACTIVE");
        assertEquals(0, allergyIntoleranceStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        AllergyIntoleranceStatusList allergyIntoleranceStatusList0 = AllergyIntoleranceStatusList.valueOf("UNCONFIRMED");
        assertEquals("unconfirmed", allergyIntoleranceStatusList0.value());
    }

    @Test
    public void test3() throws Throwable {
        AllergyIntoleranceStatusList allergyIntoleranceStatusList0 = AllergyIntoleranceStatusList.fromValue("confirmed");
        assertEquals("CONFIRMED", allergyIntoleranceStatusList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AllergyIntoleranceStatusList.valueOf((java.lang.String) null);
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
            AllergyIntoleranceStatusList.valueOf("9Oi4V=6QQuw%Fa$L/|K");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AllergyIntoleranceStatusList.9Oi4V=6QQuw%Fa$L/|K
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        AllergyIntoleranceStatusList allergyIntoleranceStatusList0 = AllergyIntoleranceStatusList.fromValue("active");
        assertEquals("active", allergyIntoleranceStatusList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            AllergyIntoleranceStatusList.fromValue("CONFIRMED");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // CONFIRMED
            //
            assertThrownBy("com.csra.fhir.AllergyIntoleranceStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        AllergyIntoleranceStatusList allergyIntoleranceStatusList0 = AllergyIntoleranceStatusList.ACTIVE;
        java.lang.String string0 = allergyIntoleranceStatusList0.value();
        assertEquals("active", string0);
    }
}
