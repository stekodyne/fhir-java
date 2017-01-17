/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:34:30 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class EncounterStateListTest {

    @Test
    public void test0() throws Throwable {
        EncounterStateList[] encounterStateListArray0 = EncounterStateList.values();
        assertNotNull(encounterStateListArray0);
    }

    @Test
    public void test1() throws Throwable {
        EncounterStateList encounterStateList0 = EncounterStateList.valueOf("PLANNED");
        assertEquals(0, encounterStateList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        EncounterStateList encounterStateList0 = EncounterStateList.valueOf("FINISHED");
        assertEquals("finished", encounterStateList0.value());
    }

    @Test
    public void test3() throws Throwable {
        EncounterStateList encounterStateList0 = EncounterStateList.fromValue("finished");
        assertEquals(4, encounterStateList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            EncounterStateList.valueOf((java.lang.String) null);
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
            EncounterStateList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.EncounterStateList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        EncounterStateList encounterStateList0 = EncounterStateList.fromValue("planned");
        assertEquals("PLANNED", encounterStateList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            EncounterStateList.fromValue("olanxed");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // olanxed
            //
            assertThrownBy("com.csra.fhir.EncounterStateList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        EncounterStateList encounterStateList0 = EncounterStateList.FINISHED;
        java.lang.String string0 = encounterStateList0.value();
        assertEquals("finished", string0);
    }
}
