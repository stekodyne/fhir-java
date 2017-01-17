/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:09:43 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AdministrativeGenderListTest {

    @Test
    public void test0() throws Throwable {
        AdministrativeGenderList[] administrativeGenderListArray0 = AdministrativeGenderList.values();
        assertNotNull(administrativeGenderListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AdministrativeGenderList administrativeGenderList0 = AdministrativeGenderList.valueOf("MALE");
        assertEquals(AdministrativeGenderList.MALE, administrativeGenderList0);
    }

    @Test
    public void test2() throws Throwable {
        AdministrativeGenderList administrativeGenderList0 = AdministrativeGenderList.valueOf("FEMALE");
        assertEquals(1, administrativeGenderList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        AdministrativeGenderList administrativeGenderList0 = AdministrativeGenderList.fromValue("male");
        assertEquals("MALE", administrativeGenderList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AdministrativeGenderList.valueOf((java.lang.String) null);
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
            AdministrativeGenderList.valueOf("[7~P");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AdministrativeGenderList.[7~P
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        AdministrativeGenderList administrativeGenderList0 = AdministrativeGenderList.fromValue("other");
        assertEquals("OTHER", administrativeGenderList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            AdministrativeGenderList.fromValue("com.csra.fhir.AdministrativeGenderList");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // com.csra.fhir.AdministrativeGenderList
            //
            assertThrownBy("com.csra.fhir.AdministrativeGenderList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        AdministrativeGenderList administrativeGenderList0 = AdministrativeGenderList.MALE;
        java.lang.String string0 = administrativeGenderList0.value();
        assertEquals("male", string0);
    }
}
