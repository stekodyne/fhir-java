/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:34:04 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class LocationStatusListTest {

    @Test
    public void test0() throws Throwable {
        LocationStatusList[] locationStatusListArray0 = LocationStatusList.values();
        assertNotNull(locationStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        LocationStatusList locationStatusList0 = LocationStatusList.valueOf("ACTIVE");
        assertEquals(0, locationStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        LocationStatusList locationStatusList0 = LocationStatusList.valueOf("SUSPENDED");
        assertEquals(LocationStatusList.SUSPENDED, locationStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        LocationStatusList locationStatusList0 = LocationStatusList.fromValue("active");
        assertEquals(0, locationStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            LocationStatusList.valueOf((java.lang.String) null);
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
            LocationStatusList.valueOf("P&");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.LocationStatusList.P&
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        LocationStatusList locationStatusList0 = LocationStatusList.fromValue("inactive");
        assertEquals("INACTIVE", locationStatusList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            LocationStatusList.fromValue("ACTIVE");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ACTIVE
            //
            assertThrownBy("com.csra.fhir.LocationStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        LocationStatusList locationStatusList0 = LocationStatusList.ACTIVE;
        java.lang.String string0 = locationStatusList0.value();
        assertEquals("active", string0);
    }
}
