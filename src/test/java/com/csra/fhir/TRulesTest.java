/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:32:18 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class TRulesTest {

    @Test
    public void test0() throws Throwable {
        TRules[] tRulesArray0 = TRules.values();
        assertNotNull(tRulesArray0);
    }

    @Test
    public void test1() throws Throwable {
        TRules tRules0 = TRules.valueOf("NONE");
        assertEquals(0, tRules0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        TRules tRules0 = TRules.valueOf("ALL");
        assertEquals("ALL", tRules0.name());
    }

    @Test
    public void test3() throws Throwable {
        TRules tRules0 = TRules.fromValue("all");
        assertEquals("ALL", tRules0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            TRules.valueOf((java.lang.String) null);
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
            TRules.valueOf("none");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.TRules.none
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        TRules tRules0 = TRules.fromValue("none");
        assertEquals(0, tRules0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            TRules.fromValue("cho");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // cho
            //
            assertThrownBy("com.csra.fhir.TRules", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        TRules tRules0 = TRules.NONE;
        java.lang.String string0 = tRules0.value();
        assertEquals("none", string0);
    }
}
