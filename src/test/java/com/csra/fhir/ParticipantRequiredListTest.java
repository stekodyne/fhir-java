/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:12:34 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ParticipantRequiredListTest {

    @Test
    public void test0() throws Throwable {
        ParticipantRequiredList[] participantRequiredListArray0 = ParticipantRequiredList.values();
        assertNotNull(participantRequiredListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ParticipantRequiredList participantRequiredList0 = ParticipantRequiredList.valueOf("REQUIRED");
        assertEquals(ParticipantRequiredList.REQUIRED, participantRequiredList0);
    }

    @Test
    public void test2() throws Throwable {
        ParticipantRequiredList participantRequiredList0 = ParticipantRequiredList.valueOf("INFORMATION_ONLY");
        assertEquals("INFORMATION_ONLY", participantRequiredList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        ParticipantRequiredList participantRequiredList0 = ParticipantRequiredList.fromValue("required");
        assertEquals("REQUIRED", participantRequiredList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ParticipantRequiredList.valueOf((java.lang.String) null);
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
            ParticipantRequiredList.valueOf("required");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ParticipantRequiredList.required
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ParticipantRequiredList.fromValue("optiunal");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // optiunal
            //
            assertThrownBy("com.csra.fhir.ParticipantRequiredList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ParticipantRequiredList participantRequiredList0 = ParticipantRequiredList.fromValue("optional");
        java.lang.String string0 = participantRequiredList0.value();
        assertEquals("optional", string0);
    }
}
