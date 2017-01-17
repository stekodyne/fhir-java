/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:48:16 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class EncounterLocationStatusListTest {

    @Test
    public void test0() throws Throwable {
        EncounterLocationStatusList[] encounterLocationStatusListArray0 = EncounterLocationStatusList.values();
        assertNotNull(encounterLocationStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        EncounterLocationStatusList encounterLocationStatusList0 = EncounterLocationStatusList.valueOf("PLANNED");
        assertEquals("PLANNED", encounterLocationStatusList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        EncounterLocationStatusList encounterLocationStatusList0 = EncounterLocationStatusList.valueOf("ACTIVE");
        assertEquals("ACTIVE", encounterLocationStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        EncounterLocationStatusList encounterLocationStatusList0 = EncounterLocationStatusList.fromValue("planned");
        assertEquals("PLANNED", encounterLocationStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            EncounterLocationStatusList.valueOf((java.lang.String) null);
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
            EncounterLocationStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.EncounterLocationStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        EncounterLocationStatusList encounterLocationStatusList0 = EncounterLocationStatusList.fromValue("reserved");
        assertEquals("RESERVED", encounterLocationStatusList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            EncounterLocationStatusList.fromValue("PLANNED");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // PLANNED
            //
            assertThrownBy("com.csra.fhir.EncounterLocationStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        EncounterLocationStatusList encounterLocationStatusList0 = EncounterLocationStatusList.PLANNED;
        java.lang.String string0 = encounterLocationStatusList0.value();
        assertEquals("planned", string0);
    }
}
