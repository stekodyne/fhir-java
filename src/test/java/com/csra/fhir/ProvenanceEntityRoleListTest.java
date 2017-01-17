/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:45:10 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ProvenanceEntityRoleListTest {

    @Test
    public void test0() throws Throwable {
        ProvenanceEntityRoleList[] provenanceEntityRoleListArray0 = ProvenanceEntityRoleList.values();
        assertNotNull(provenanceEntityRoleListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ProvenanceEntityRoleList provenanceEntityRoleList0 = ProvenanceEntityRoleList.valueOf("DERIVATION");
        assertEquals("derivation", provenanceEntityRoleList0.value());
    }

    @Test
    public void test2() throws Throwable {
        ProvenanceEntityRoleList provenanceEntityRoleList0 = ProvenanceEntityRoleList.valueOf("QUOTATION");
        assertEquals("quotation", provenanceEntityRoleList0.value());
    }

    @Test
    public void test3() throws Throwable {
        ProvenanceEntityRoleList provenanceEntityRoleList0 = ProvenanceEntityRoleList.fromValue("quotation");
        assertEquals("QUOTATION", provenanceEntityRoleList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ProvenanceEntityRoleList.valueOf((java.lang.String) null);
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
        ProvenanceEntityRoleList provenanceEntityRoleList0 = ProvenanceEntityRoleList.fromValue("derivation");
        assertEquals(0, provenanceEntityRoleList0.ordinal());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ProvenanceEntityRoleList.fromValue("tpzq]c");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // tpzq]c
            //
            assertThrownBy("com.csra.fhir.ProvenanceEntityRoleList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ProvenanceEntityRoleList provenanceEntityRoleList0 = ProvenanceEntityRoleList.QUOTATION;
        java.lang.String string0 = provenanceEntityRoleList0.value();
        assertEquals("quotation", string0);
    }
}
