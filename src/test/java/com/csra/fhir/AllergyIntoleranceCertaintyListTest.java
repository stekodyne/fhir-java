/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:22:21 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AllergyIntoleranceCertaintyListTest {

    @Test
    public void test0() throws Throwable {
        AllergyIntoleranceCertaintyList[] allergyIntoleranceCertaintyListArray0 = AllergyIntoleranceCertaintyList.values();
        assertNotNull(allergyIntoleranceCertaintyListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AllergyIntoleranceCertaintyList allergyIntoleranceCertaintyList0 = AllergyIntoleranceCertaintyList.valueOf("UNLIKELY");
        assertEquals(0, allergyIntoleranceCertaintyList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        AllergyIntoleranceCertaintyList allergyIntoleranceCertaintyList0 = AllergyIntoleranceCertaintyList.valueOf("LIKELY");
        assertEquals("LIKELY", allergyIntoleranceCertaintyList0.name());
    }

    @Test
    public void test3() throws Throwable {
        AllergyIntoleranceCertaintyList allergyIntoleranceCertaintyList0 = AllergyIntoleranceCertaintyList.fromValue("likely");
        assertEquals("LIKELY", allergyIntoleranceCertaintyList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AllergyIntoleranceCertaintyList.valueOf((java.lang.String) null);
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
            AllergyIntoleranceCertaintyList.valueOf("E!X#2v@*_");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AllergyIntoleranceCertaintyList.E!X#2v@*_
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        AllergyIntoleranceCertaintyList allergyIntoleranceCertaintyList0 = AllergyIntoleranceCertaintyList.fromValue("unlikely");
        assertEquals("UNLIKELY", allergyIntoleranceCertaintyList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            AllergyIntoleranceCertaintyList.fromValue("ndogyt");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ndogyt
            //
            assertThrownBy("com.csra.fhir.AllergyIntoleranceCertaintyList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        AllergyIntoleranceCertaintyList allergyIntoleranceCertaintyList0 = AllergyIntoleranceCertaintyList.LIKELY;
        java.lang.String string0 = allergyIntoleranceCertaintyList0.value();
        assertEquals("likely", string0);
    }
}
