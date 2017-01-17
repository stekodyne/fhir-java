/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:26:14 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class EncounterClassListTest {

    @Test
    public void test0() throws Throwable {
        EncounterClassList[] encounterClassListArray0 = EncounterClassList.values();
        assertNotNull(encounterClassListArray0);
    }

    @Test
    public void test1() throws Throwable {
        EncounterClassList encounterClassList0 = EncounterClassList.valueOf("INPATIENT");
        assertEquals("INPATIENT", encounterClassList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        EncounterClassList encounterClassList0 = EncounterClassList.valueOf("HOME");
        assertEquals("HOME", encounterClassList0.name());
    }

    @Test
    public void test3() throws Throwable {
        EncounterClassList encounterClassList0 = EncounterClassList.fromValue("other");
        assertEquals("OTHER", encounterClassList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            EncounterClassList.valueOf((java.lang.String) null);
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
            EncounterClassList.valueOf("inpatient");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.EncounterClassList.inpatient
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        EncounterClassList encounterClassList0 = EncounterClassList.fromValue("inpatient");
        assertEquals("INPATIENT", encounterClassList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            EncounterClassList.fromValue("omher");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // omher
            //
            assertThrownBy("com.csra.fhir.EncounterClassList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        EncounterClassList encounterClassList0 = EncounterClassList.INPATIENT;
        java.lang.String string0 = encounterClassList0.value();
        assertEquals("inpatient", string0);
    }
}
