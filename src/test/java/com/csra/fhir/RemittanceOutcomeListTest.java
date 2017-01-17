/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:25:45 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class RemittanceOutcomeListTest {

    @Test
    public void test0() throws Throwable {
        RemittanceOutcomeList[] remittanceOutcomeListArray0 = RemittanceOutcomeList.values();
        assertNotNull(remittanceOutcomeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        RemittanceOutcomeList remittanceOutcomeList0 = RemittanceOutcomeList.valueOf("COMPLETE");
        assertEquals("COMPLETE", remittanceOutcomeList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        RemittanceOutcomeList remittanceOutcomeList0 = RemittanceOutcomeList.valueOf("ERROR");
        assertEquals("error", remittanceOutcomeList0.value());
    }

    @Test
    public void test3() throws Throwable {
        RemittanceOutcomeList remittanceOutcomeList0 = RemittanceOutcomeList.fromValue("complete");
        assertEquals("complete", remittanceOutcomeList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            RemittanceOutcomeList.valueOf((java.lang.String) null);
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
            RemittanceOutcomeList.valueOf("error");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.RemittanceOutcomeList.error
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        RemittanceOutcomeList remittanceOutcomeList0 = RemittanceOutcomeList.fromValue("error");
        assertEquals("error", remittanceOutcomeList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            RemittanceOutcomeList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.RemittanceOutcomeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        RemittanceOutcomeList remittanceOutcomeList0 = RemittanceOutcomeList.ERROR;
        java.lang.String string0 = remittanceOutcomeList0.value();
        assertEquals("error", string0);
    }
}
