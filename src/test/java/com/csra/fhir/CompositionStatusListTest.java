/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:16:42 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class CompositionStatusListTest {

    @Test
    public void test0() throws Throwable {
        CompositionStatusList[] compositionStatusListArray0 = CompositionStatusList.values();
        assertNotNull(compositionStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        CompositionStatusList compositionStatusList0 = CompositionStatusList.valueOf("ENTERED_IN_ERROR");
        assertEquals(3, compositionStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        CompositionStatusList compositionStatusList0 = CompositionStatusList.fromValue("final");
        assertEquals(1, compositionStatusList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            CompositionStatusList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            CompositionStatusList.valueOf("preliminary");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.CompositionStatusList.preliminary
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        CompositionStatusList compositionStatusList0 = CompositionStatusList.fromValue("preliminary");
        assertEquals("preliminary", compositionStatusList0.value());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            CompositionStatusList.fromValue("\"fPQT)@JV");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // \"fPQT)@JV
            //
            assertThrownBy("com.csra.fhir.CompositionStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        CompositionStatusList compositionStatusList0 = CompositionStatusList.valueOf("PRELIMINARY");
        java.lang.String string0 = compositionStatusList0.value();
        assertEquals("preliminary", string0);
    }
}
