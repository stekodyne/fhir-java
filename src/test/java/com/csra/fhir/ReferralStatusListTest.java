/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:00:11 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ReferralStatusListTest {

    @Test
    public void test0() throws Throwable {
        ReferralStatusList[] referralStatusListArray0 = ReferralStatusList.values();
        assertNotNull(referralStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ReferralStatusList referralStatusList0 = ReferralStatusList.valueOf("DRAFT");
        assertEquals("draft", referralStatusList0.value());
    }

    @Test
    public void test2() throws Throwable {
        ReferralStatusList referralStatusList0 = ReferralStatusList.valueOf("REJECTED");
        assertEquals(ReferralStatusList.REJECTED, referralStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        ReferralStatusList referralStatusList0 = ReferralStatusList.fromValue("completed");
        assertEquals(6, referralStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ReferralStatusList.valueOf((java.lang.String) null);
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
            ReferralStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ReferralStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ReferralStatusList referralStatusList0 = ReferralStatusList.fromValue("draft");
        assertEquals(0, referralStatusList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ReferralStatusList.fromValue("compfeted");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // compfeted
            //
            assertThrownBy("com.csra.fhir.ReferralStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ReferralStatusList referralStatusList0 = ReferralStatusList.DRAFT;
        java.lang.String string0 = referralStatusList0.value();
        assertEquals("draft", string0);
    }
}
