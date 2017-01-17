/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:44:00 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class IdentifierUseListTest {

    @Test
    public void test0() throws Throwable {
        IdentifierUseList[] identifierUseListArray0 = IdentifierUseList.values();
        assertNotNull(identifierUseListArray0);
    }

    @Test
    public void test1() throws Throwable {
        IdentifierUseList identifierUseList0 = IdentifierUseList.valueOf("USUAL");
        assertEquals(IdentifierUseList.USUAL, identifierUseList0);
    }

    @Test
    public void test2() throws Throwable {
        IdentifierUseList identifierUseList0 = IdentifierUseList.valueOf("SECONDARY");
        assertEquals(IdentifierUseList.SECONDARY, identifierUseList0);
    }

    @Test
    public void test3() throws Throwable {
        IdentifierUseList identifierUseList0 = IdentifierUseList.fromValue("secondary");
        assertEquals("SECONDARY", identifierUseList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            IdentifierUseList.valueOf((java.lang.String) null);
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
            IdentifierUseList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.IdentifierUseList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        IdentifierUseList identifierUseList0 = IdentifierUseList.fromValue("usual");
        assertEquals("USUAL", identifierUseList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            IdentifierUseList.fromValue("secon_ary");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // secon_ary
            //
            assertThrownBy("com.csra.fhir.IdentifierUseList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        IdentifierUseList identifierUseList0 = IdentifierUseList.TEMP;
        java.lang.String string0 = identifierUseList0.value();
        assertEquals("temp", string0);
    }
}
