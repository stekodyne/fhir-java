/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:57:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SpecimenStatusListTest {

    @Test
    public void test0() throws Throwable {
        SpecimenStatusList[] specimenStatusListArray0 = SpecimenStatusList.values();
        assertNotNull(specimenStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        SpecimenStatusList specimenStatusList0 = SpecimenStatusList.valueOf("AVAILABLE");
        assertEquals("AVAILABLE", specimenStatusList0.name());
    }

    @Test
    public void test2() throws Throwable {
        SpecimenStatusList specimenStatusList0 = SpecimenStatusList.valueOf("UNSATISFACTORY");
        assertEquals("UNSATISFACTORY", specimenStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        SpecimenStatusList specimenStatusList0 = SpecimenStatusList.fromValue("unsatisfactory");
        assertEquals("UNSATISFACTORY", specimenStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            SpecimenStatusList.valueOf((java.lang.String) null);
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
            SpecimenStatusList.valueOf("com.csra.fhir.SpecimenStatusList");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.SpecimenStatusList.com.csra.fhir.SpecimenStatusList
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            SpecimenStatusList.fromValue("rAFL4XC}PR'8[-7/1");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // rAFL4XC}PR'8[-7/1
            //
            assertThrownBy("com.csra.fhir.SpecimenStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        SpecimenStatusList specimenStatusList0 = SpecimenStatusList.fromValue("available");
        java.lang.String string0 = specimenStatusList0.value();
        assertEquals("available", string0);
    }
}
