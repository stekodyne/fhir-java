/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:18:50 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ParticipantStatusListTest {

    @Test
    public void test0() throws Throwable {
        ParticipantStatusList[] participantStatusListArray0 = ParticipantStatusList.values();
        assertNotNull(participantStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ParticipantStatusList participantStatusList0 = ParticipantStatusList.valueOf("ACCEPTED");
        assertEquals("ACCEPTED", participantStatusList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        ParticipantStatusList participantStatusList0 = ParticipantStatusList.fromValue("accepted");
        assertEquals("ACCEPTED", participantStatusList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            ParticipantStatusList.valueOf((java.lang.String) null);
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
            ParticipantStatusList.valueOf("8LPj3{e)&S");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ParticipantStatusList.8LPj3{e)&S
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        ParticipantStatusList participantStatusList0 = ParticipantStatusList.fromValue("in-process");
        assertEquals(3, participantStatusList0.ordinal());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ParticipantStatusList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.ParticipantStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ParticipantStatusList participantStatusList0 = ParticipantStatusList.valueOf("IN_PROCESS");
        java.lang.String string0 = participantStatusList0.value();
        assertEquals("in-process", string0);
    }
}
