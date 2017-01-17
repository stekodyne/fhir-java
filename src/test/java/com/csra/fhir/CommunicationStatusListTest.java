/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:06:38 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class CommunicationStatusListTest {

    @Test
    public void test0() throws Throwable {
        CommunicationStatusList[] communicationStatusListArray0 = CommunicationStatusList.values();
        assertNotNull(communicationStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        CommunicationStatusList communicationStatusList0 = CommunicationStatusList.valueOf("IN_PROGRESS");
        assertEquals("IN_PROGRESS", communicationStatusList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        CommunicationStatusList communicationStatusList0 = CommunicationStatusList.valueOf("FAILED");
        assertEquals(CommunicationStatusList.FAILED, communicationStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        CommunicationStatusList communicationStatusList0 = CommunicationStatusList.fromValue("completed");
        assertEquals("completed", communicationStatusList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            CommunicationStatusList.valueOf((java.lang.String) null);
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
            CommunicationStatusList.valueOf("$1/8~b<p");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.CommunicationStatusList.$1/8~b<p
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        CommunicationStatusList communicationStatusList0 = CommunicationStatusList.fromValue("in-progress");
        assertEquals(0, communicationStatusList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            CommunicationStatusList.fromValue("faiqed");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // faiqed
            //
            assertThrownBy("com.csra.fhir.CommunicationStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        CommunicationStatusList communicationStatusList0 = CommunicationStatusList.COMPLETED;
        java.lang.String string0 = communicationStatusList0.value();
        assertEquals("completed", string0);
    }
}
