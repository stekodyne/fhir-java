/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:59:38 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class NarrativeStatusListTest {

    @Test
    public void test0() throws Throwable {
        NarrativeStatusList[] narrativeStatusListArray0 = NarrativeStatusList.values();
        assertNotNull(narrativeStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        NarrativeStatusList narrativeStatusList0 = NarrativeStatusList.valueOf("GENERATED");
        assertEquals("generated", narrativeStatusList0.value());
    }

    @Test
    public void test2() throws Throwable {
        NarrativeStatusList narrativeStatusList0 = NarrativeStatusList.valueOf("EMPTY");
        assertEquals(3, narrativeStatusList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        NarrativeStatusList narrativeStatusList0 = NarrativeStatusList.fromValue("extensions");
        assertEquals("extensions", narrativeStatusList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            NarrativeStatusList.valueOf((java.lang.String) null);
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
            NarrativeStatusList.valueOf("$VALUES");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.NarrativeStatusList.$VALUES
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        NarrativeStatusList narrativeStatusList0 = NarrativeStatusList.fromValue("generated");
        assertEquals("generated", narrativeStatusList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            NarrativeStatusList.fromValue("EMPTY");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // EMPTY
            //
            assertThrownBy("com.csra.fhir.NarrativeStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        NarrativeStatusList narrativeStatusList0 = NarrativeStatusList.ADDITIONAL;
        java.lang.String string0 = narrativeStatusList0.value();
        assertEquals("additional", string0);
    }
}
