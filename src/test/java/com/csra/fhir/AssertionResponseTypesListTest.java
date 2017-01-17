/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:13:11 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AssertionResponseTypesListTest {

    @Test
    public void test0() throws Throwable {
        AssertionResponseTypesList[] assertionResponseTypesListArray0 = AssertionResponseTypesList.values();
        assertNotNull(assertionResponseTypesListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AssertionResponseTypesList assertionResponseTypesList0 = AssertionResponseTypesList.valueOf("OKAY");
        assertEquals(AssertionResponseTypesList.OKAY, assertionResponseTypesList0);
    }

    @Test
    public void test2() throws Throwable {
        AssertionResponseTypesList assertionResponseTypesList0 = AssertionResponseTypesList.valueOf("NOT_FOUND");
        assertEquals("NOT_FOUND", assertionResponseTypesList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        AssertionResponseTypesList assertionResponseTypesList0 = AssertionResponseTypesList.fromValue("forbidden");
        assertEquals("forbidden", assertionResponseTypesList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AssertionResponseTypesList.valueOf((java.lang.String) null);
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
            AssertionResponseTypesList.valueOf("ht;Dl;:.r;SZoe8");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AssertionResponseTypesList.ht;Dl;:.r;SZoe8
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        AssertionResponseTypesList assertionResponseTypesList0 = AssertionResponseTypesList.fromValue("okay");
        assertEquals("OKAY", assertionResponseTypesList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            AssertionResponseTypesList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.AssertionResponseTypesList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        AssertionResponseTypesList assertionResponseTypesList0 = AssertionResponseTypesList.NOT_FOUND;
        java.lang.String string0 = assertionResponseTypesList0.value();
        assertEquals("notFound", string0);
    }
}
