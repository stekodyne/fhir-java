/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:08:16 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SlicingRulesListTest {

    @Test
    public void test0() throws Throwable {
        SlicingRulesList[] slicingRulesListArray0 = SlicingRulesList.values();
        assertNotNull(slicingRulesListArray0);
    }

    @Test
    public void test1() throws Throwable {
        SlicingRulesList slicingRulesList0 = SlicingRulesList.valueOf("CLOSED");
        assertEquals(SlicingRulesList.CLOSED, slicingRulesList0);
    }

    @Test
    public void test2() throws Throwable {
        SlicingRulesList slicingRulesList0 = SlicingRulesList.valueOf("OPEN");
        assertEquals("OPEN", slicingRulesList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        SlicingRulesList slicingRulesList0 = SlicingRulesList.fromValue("openAtEnd");
        assertEquals("openAtEnd", slicingRulesList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            SlicingRulesList.valueOf((java.lang.String) null);
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
            SlicingRulesList.valueOf("@=<'JoD8");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.SlicingRulesList.@=<'JoD8
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        SlicingRulesList slicingRulesList0 = SlicingRulesList.fromValue("closed");
        assertEquals("CLOSED", slicingRulesList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            SlicingRulesList.fromValue("CLOSED");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // CLOSED
            //
            assertThrownBy("com.csra.fhir.SlicingRulesList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        SlicingRulesList slicingRulesList0 = SlicingRulesList.OPEN_AT_END;
        java.lang.String string0 = slicingRulesList0.value();
        assertEquals("openAtEnd", string0);
    }
}
