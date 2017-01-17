/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:30:27 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AccountStatusListTest {

    @Test
    public void test0() throws Throwable {
        AccountStatusList[] accountStatusListArray0 = AccountStatusList.values();
        assertNotNull(accountStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AccountStatusList accountStatusList0 = AccountStatusList.valueOf("ACTIVE");
        assertEquals(AccountStatusList.ACTIVE, accountStatusList0);
    }

    @Test
    public void test2() throws Throwable {
        AccountStatusList accountStatusList0 = AccountStatusList.valueOf("INACTIVE");
        assertEquals("INACTIVE", accountStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        AccountStatusList accountStatusList0 = AccountStatusList.fromValue("active");
        assertEquals("ACTIVE", accountStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AccountStatusList.valueOf((java.lang.String) null);
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
            AccountStatusList.valueOf("d`djgLg0~PB");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AccountStatusList.d`djgLg0~PB
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            AccountStatusList.fromValue("sxGo37hP-UkJ@S");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // sxGo37hP-UkJ@S
            //
            assertThrownBy("com.csra.fhir.AccountStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        AccountStatusList accountStatusList0 = AccountStatusList.fromValue("inactive");
        java.lang.String string0 = accountStatusList0.value();
        assertEquals("inactive", string0);
    }
}
