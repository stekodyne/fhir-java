/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:46:12 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SubscriptionChannelTypeListTest {

    @Test
    public void test0() throws Throwable {
        SubscriptionChannelTypeList[] subscriptionChannelTypeListArray0 = SubscriptionChannelTypeList.values();
        assertNotNull(subscriptionChannelTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        SubscriptionChannelTypeList subscriptionChannelTypeList0 = SubscriptionChannelTypeList.valueOf("REST_HOOK");
        assertEquals("rest-hook", subscriptionChannelTypeList0.value());
    }

    @Test
    public void test2() throws Throwable {
        SubscriptionChannelTypeList subscriptionChannelTypeList0 = SubscriptionChannelTypeList.valueOf("SMS");
        assertEquals(SubscriptionChannelTypeList.SMS, subscriptionChannelTypeList0);
    }

    @Test
    public void test3() throws Throwable {
        SubscriptionChannelTypeList subscriptionChannelTypeList0 = SubscriptionChannelTypeList.fromValue("email");
        assertEquals("email", subscriptionChannelTypeList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            SubscriptionChannelTypeList.valueOf((java.lang.String) null);
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
        SubscriptionChannelTypeList subscriptionChannelTypeList0 = SubscriptionChannelTypeList.fromValue("rest-hook");
        assertEquals("REST_HOOK", subscriptionChannelTypeList0.toString());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            SubscriptionChannelTypeList.fromValue("i]s");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // i]s
            //
            assertThrownBy("com.csra.fhir.SubscriptionChannelTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        SubscriptionChannelTypeList subscriptionChannelTypeList0 = SubscriptionChannelTypeList.REST_HOOK;
        java.lang.String string0 = subscriptionChannelTypeList0.value();
        assertEquals("rest-hook", string0);
    }
}
