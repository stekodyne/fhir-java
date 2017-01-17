/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:32:01 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ParticipationStatusListTest {

    @Test
    public void test0() throws Throwable {
        ParticipationStatusList[] participationStatusListArray0 = ParticipationStatusList.values();
        assertNotNull(participationStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ParticipationStatusList participationStatusList0 = ParticipationStatusList.valueOf("ACCEPTED");
        assertEquals("ACCEPTED", participationStatusList0.name());
    }

    @Test
    public void test2() throws Throwable {
        ParticipationStatusList participationStatusList0 = ParticipationStatusList.valueOf("NEEDS_ACTION");
        assertEquals(ParticipationStatusList.NEEDS_ACTION, participationStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        ParticipationStatusList participationStatusList0 = ParticipationStatusList.fromValue("accepted");
        assertEquals("ACCEPTED", participationStatusList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ParticipationStatusList.valueOf((java.lang.String) null);
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
            ParticipationStatusList.fromValue("ACCEPTED");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ACCEPTED
            //
            assertThrownBy("com.csra.fhir.ParticipationStatusList", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ParticipationStatusList participationStatusList0 = ParticipationStatusList.fromValue("declined");
        java.lang.String string0 = participationStatusList0.value();
        assertEquals("declined", string0);
    }
}
