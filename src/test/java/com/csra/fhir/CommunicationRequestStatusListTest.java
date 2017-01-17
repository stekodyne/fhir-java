/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:39:15 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class CommunicationRequestStatusListTest {

    @Test
    public void test0() throws Throwable {
        CommunicationRequestStatusList[] communicationRequestStatusListArray0 = CommunicationRequestStatusList.values();
        assertNotNull(communicationRequestStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        CommunicationRequestStatusList communicationRequestStatusList0 = CommunicationRequestStatusList.valueOf("PROPOSED");
        assertEquals(CommunicationRequestStatusList.PROPOSED, communicationRequestStatusList0);
    }

    @Test
    public void test2() throws Throwable {
        CommunicationRequestStatusList communicationRequestStatusList0 = CommunicationRequestStatusList.valueOf("REQUESTED");
        assertEquals(CommunicationRequestStatusList.REQUESTED, communicationRequestStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        CommunicationRequestStatusList communicationRequestStatusList0 = CommunicationRequestStatusList.fromValue("rejected");
        assertEquals("REJECTED", communicationRequestStatusList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            CommunicationRequestStatusList.valueOf((java.lang.String) null);
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
            CommunicationRequestStatusList.valueOf("requested");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.CommunicationRequestStatusList.requested
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        CommunicationRequestStatusList communicationRequestStatusList0 = CommunicationRequestStatusList.fromValue("proposed");
        assertEquals("PROPOSED", communicationRequestStatusList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            CommunicationRequestStatusList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.CommunicationRequestStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        CommunicationRequestStatusList communicationRequestStatusList0 = CommunicationRequestStatusList.PROPOSED;
        java.lang.String string0 = communicationRequestStatusList0.value();
        assertEquals("proposed", string0);
    }
}
