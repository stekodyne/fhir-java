/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:39:10 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class IdentityAssuranceLevelListTest {

    @Test
    public void test0() throws Throwable {
        IdentityAssuranceLevelList[] identityAssuranceLevelListArray0 = IdentityAssuranceLevelList.values();
        assertNotNull(identityAssuranceLevelListArray0);
    }

    @Test
    public void test1() throws Throwable {
        IdentityAssuranceLevelList identityAssuranceLevelList0 = IdentityAssuranceLevelList.valueOf("LEVEL_1");
        assertEquals("LEVEL_1", identityAssuranceLevelList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        IdentityAssuranceLevelList identityAssuranceLevelList0 = IdentityAssuranceLevelList.valueOf("LEVEL_3");
        assertEquals(2, identityAssuranceLevelList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        IdentityAssuranceLevelList identityAssuranceLevelList0 = IdentityAssuranceLevelList.fromValue("level2");
        assertEquals(1, identityAssuranceLevelList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            IdentityAssuranceLevelList.valueOf((java.lang.String) null);
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
            IdentityAssuranceLevelList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.IdentityAssuranceLevelList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        IdentityAssuranceLevelList identityAssuranceLevelList0 = IdentityAssuranceLevelList.fromValue("level1");
        assertEquals("level1", identityAssuranceLevelList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            IdentityAssuranceLevelList.fromValue("=,W$/mj");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // =,W$/mj
            //
            assertThrownBy("com.csra.fhir.IdentityAssuranceLevelList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        IdentityAssuranceLevelList identityAssuranceLevelList0 = IdentityAssuranceLevelList.LEVEL_1;
        java.lang.String string0 = identityAssuranceLevelList0.value();
        assertEquals("level1", string0);
    }
}
