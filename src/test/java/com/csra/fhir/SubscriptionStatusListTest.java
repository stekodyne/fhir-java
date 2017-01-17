/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:57:52 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SubscriptionStatusListTest {

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            SubscriptionStatusList.fromValue("ofc");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ofc
            //
            assertThrownBy("com.csra.fhir.SubscriptionStatusList", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        SubscriptionStatusList[] subscriptionStatusListArray0 = SubscriptionStatusList.values();
        assertNotNull(subscriptionStatusListArray0);
    }

    @Test
    public void test2() throws Throwable {
        SubscriptionStatusList subscriptionStatusList0 = SubscriptionStatusList.valueOf("REQUESTED");
        assertEquals(SubscriptionStatusList.REQUESTED, subscriptionStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        SubscriptionStatusList subscriptionStatusList0 = SubscriptionStatusList.valueOf("ACTIVE");
        assertEquals(1, subscriptionStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        SubscriptionStatusList subscriptionStatusList0 = SubscriptionStatusList.fromValue("requested");
        assertEquals("requested", subscriptionStatusList0.value());
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            SubscriptionStatusList.valueOf((java.lang.String) null);
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
            SubscriptionStatusList.valueOf("active");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.SubscriptionStatusList.active
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        SubscriptionStatusList subscriptionStatusList0 = SubscriptionStatusList.fromValue("active");
        assertEquals("ACTIVE", subscriptionStatusList0.toString());
    }

    @Test
    public void test8() throws Throwable {
        SubscriptionStatusList subscriptionStatusList0 = SubscriptionStatusList.ERROR;
        java.lang.String string0 = subscriptionStatusList0.value();
        assertEquals("error", string0);
    }
}
