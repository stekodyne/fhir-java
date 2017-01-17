/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:26:59 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ClaimTypeListTest {

    @Test
    public void test0() throws Throwable {
        ClaimTypeList[] claimTypeListArray0 = ClaimTypeList.values();
        assertNotNull(claimTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ClaimTypeList claimTypeList0 = ClaimTypeList.valueOf("INSTITUTIONAL");
        assertEquals("INSTITUTIONAL", claimTypeList0.name());
    }

    @Test
    public void test2() throws Throwable {
        ClaimTypeList claimTypeList0 = ClaimTypeList.fromValue("oral");
        assertEquals("ORAL", claimTypeList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            ClaimTypeList.valueOf((java.lang.String) null);
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
            ClaimTypeList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ClaimTypeList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        ClaimTypeList claimTypeList0 = ClaimTypeList.fromValue("institutional");
        assertEquals("INSTITUTIONAL", claimTypeList0.toString());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ClaimTypeList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.ClaimTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ClaimTypeList claimTypeList0 = ClaimTypeList.valueOf("ORAL");
        java.lang.String string0 = claimTypeList0.value();
        assertEquals("oral", string0);
    }
}
