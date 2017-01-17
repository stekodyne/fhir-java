/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:09:50 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GoalStatusListTest {

    @Test
    public void test0() throws Throwable {
        GoalStatusList[] goalStatusListArray0 = GoalStatusList.values();
        assertNotNull(goalStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        GoalStatusList goalStatusList0 = GoalStatusList.valueOf("PROPOSED");
        assertEquals(0, goalStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        GoalStatusList goalStatusList0 = GoalStatusList.valueOf("ACCEPTED");
        assertEquals("accepted", goalStatusList0.value());
    }

    @Test
    public void test3() throws Throwable {
        GoalStatusList goalStatusList0 = GoalStatusList.fromValue("proposed");
        assertEquals("PROPOSED", goalStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            GoalStatusList.valueOf((java.lang.String) null);
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
            GoalStatusList.fromValue("On?%,81M-ip");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // On?%,81M-ip
            //
            assertThrownBy("com.csra.fhir.GoalStatusList", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        GoalStatusList goalStatusList0 = GoalStatusList.fromValue("on-hold");
        java.lang.String string0 = goalStatusList0.value();
        assertEquals("on-hold", string0);
    }
}
