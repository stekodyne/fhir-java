/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:56:45 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ConditionVerificationStatusListTest {

    @Test
    public void test0() throws Throwable {
        ConditionVerificationStatusList[] conditionVerificationStatusListArray0 = ConditionVerificationStatusList.values();
        assertNotNull(conditionVerificationStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ConditionVerificationStatusList conditionVerificationStatusList0 = ConditionVerificationStatusList.valueOf("PROVISIONAL");
        assertEquals("PROVISIONAL", conditionVerificationStatusList0.name());
    }

    @Test
    public void test2() throws Throwable {
        ConditionVerificationStatusList conditionVerificationStatusList0 = ConditionVerificationStatusList.valueOf("ENTERED_IN_ERROR");
        assertEquals(ConditionVerificationStatusList.ENTERED_IN_ERROR, conditionVerificationStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        ConditionVerificationStatusList conditionVerificationStatusList0 = ConditionVerificationStatusList.fromValue("unknown");
        assertEquals("UNKNOWN", conditionVerificationStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ConditionVerificationStatusList.valueOf((java.lang.String) null);
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
            ConditionVerificationStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ConditionVerificationStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ConditionVerificationStatusList conditionVerificationStatusList0 = ConditionVerificationStatusList.fromValue("provisional");
        assertEquals(0, conditionVerificationStatusList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ConditionVerificationStatusList.fromValue("B.tV2Nz:");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // B.tV2Nz:
            //
            assertThrownBy("com.csra.fhir.ConditionVerificationStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ConditionVerificationStatusList conditionVerificationStatusList0 = ConditionVerificationStatusList.UNKNOWN;
        java.lang.String string0 = conditionVerificationStatusList0.value();
        assertEquals("unknown", string0);
    }
}
