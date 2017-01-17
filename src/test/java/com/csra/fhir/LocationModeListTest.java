/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:16:36 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class LocationModeListTest {

    @Test
    public void test0() throws Throwable {
        LocationModeList[] locationModeListArray0 = LocationModeList.values();
        assertNotNull(locationModeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        LocationModeList locationModeList0 = LocationModeList.valueOf("INSTANCE");
        assertEquals("INSTANCE", locationModeList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        LocationModeList locationModeList0 = LocationModeList.valueOf("KIND");
        assertEquals(1, locationModeList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        LocationModeList locationModeList0 = LocationModeList.fromValue("instance");
        assertEquals("instance", locationModeList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            LocationModeList.valueOf((java.lang.String) null);
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
        LocationModeList locationModeList0 = LocationModeList.fromValue("kind");
        assertEquals("kind", locationModeList0.value());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            LocationModeList.fromValue("ifug");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ifug
            //
            assertThrownBy("com.csra.fhir.LocationModeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        LocationModeList locationModeList0 = LocationModeList.KIND;
        java.lang.String string0 = locationModeList0.value();
        assertEquals("kind", string0);
    }
}
