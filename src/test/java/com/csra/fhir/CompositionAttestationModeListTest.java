/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:33:51 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class CompositionAttestationModeListTest {

    @Test
    public void test0() throws Throwable {
        CompositionAttestationModeList[] compositionAttestationModeListArray0 = CompositionAttestationModeList.values();
        assertNotNull(compositionAttestationModeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        CompositionAttestationModeList compositionAttestationModeList0 = CompositionAttestationModeList.valueOf("PERSONAL");
        assertEquals(0, compositionAttestationModeList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        CompositionAttestationModeList compositionAttestationModeList0 = CompositionAttestationModeList.valueOf("OFFICIAL");
        assertEquals("official", compositionAttestationModeList0.value());
    }

    @Test
    public void test3() throws Throwable {
        CompositionAttestationModeList compositionAttestationModeList0 = CompositionAttestationModeList.fromValue("professional");
        assertEquals(1, compositionAttestationModeList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            CompositionAttestationModeList.valueOf((java.lang.String) null);
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
            CompositionAttestationModeList.valueOf("GAL");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.CompositionAttestationModeList.GAL
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        CompositionAttestationModeList compositionAttestationModeList0 = CompositionAttestationModeList.fromValue("personal");
        assertEquals("PERSONAL", compositionAttestationModeList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            CompositionAttestationModeList.fromValue("$VALUES");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // $VALUES
            //
            assertThrownBy("com.csra.fhir.CompositionAttestationModeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        CompositionAttestationModeList compositionAttestationModeList0 = CompositionAttestationModeList.PERSONAL;
        java.lang.String string0 = compositionAttestationModeList0.value();
        assertEquals("personal", string0);
    }
}
