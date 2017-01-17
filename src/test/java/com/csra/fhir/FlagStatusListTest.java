/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:42:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class FlagStatusListTest {

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            FlagStatusList.fromValue("ACTIVE");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ACTIVE
            //
            assertThrownBy("com.csra.fhir.FlagStatusList", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        FlagStatusList[] flagStatusListArray0 = FlagStatusList.values();
        assertNotNull(flagStatusListArray0);
    }

    @Test
    public void test2() throws Throwable {
        FlagStatusList flagStatusList0 = FlagStatusList.valueOf("ACTIVE");
        assertEquals("active", flagStatusList0.value());
    }

    @Test
    public void test3() throws Throwable {
        FlagStatusList flagStatusList0 = FlagStatusList.valueOf("INACTIVE");
        assertEquals("INACTIVE", flagStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        FlagStatusList flagStatusList0 = FlagStatusList.fromValue("active");
        assertEquals(0, flagStatusList0.ordinal());
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            FlagStatusList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            FlagStatusList.valueOf("&g>&!/4iFBhNU");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.FlagStatusList.&g>&!/4iFBhNU
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        FlagStatusList flagStatusList0 = FlagStatusList.fromValue("entered-in-error");
        assertEquals("ENTERED_IN_ERROR", flagStatusList0.name());
    }

    @Test
    public void test8() throws Throwable {
        FlagStatusList flagStatusList0 = FlagStatusList.ENTERED_IN_ERROR;
        java.lang.String string0 = flagStatusList0.value();
        assertEquals("entered-in-error", string0);
    }
}
