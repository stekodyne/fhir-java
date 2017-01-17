/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:05:57 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AssertionOperatorTypeListTest {

    @Test
    public void test0() throws Throwable {
        AssertionOperatorTypeList[] assertionOperatorTypeListArray0 = AssertionOperatorTypeList.values();
        assertNotNull(assertionOperatorTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AssertionOperatorTypeList assertionOperatorTypeList0 = AssertionOperatorTypeList.valueOf("EQUALS");
        assertEquals("equals", assertionOperatorTypeList0.value());
    }

    @Test
    public void test2() throws Throwable {
        AssertionOperatorTypeList assertionOperatorTypeList0 = AssertionOperatorTypeList.valueOf("CONTAINS");
        assertEquals(8, assertionOperatorTypeList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        AssertionOperatorTypeList assertionOperatorTypeList0 = AssertionOperatorTypeList.fromValue("notEmpty");
        assertEquals("NOT_EMPTY", assertionOperatorTypeList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AssertionOperatorTypeList.valueOf((java.lang.String) null);
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
            AssertionOperatorTypeList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AssertionOperatorTypeList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        AssertionOperatorTypeList assertionOperatorTypeList0 = AssertionOperatorTypeList.fromValue("equals");
        assertEquals("equals", assertionOperatorTypeList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            AssertionOperatorTypeList.fromValue("Yo<Ik:Bo\"P~dc");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Yo<Ik:Bo\"P~dc
            //
            assertThrownBy("com.csra.fhir.AssertionOperatorTypeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        AssertionOperatorTypeList assertionOperatorTypeList0 = AssertionOperatorTypeList.EMPTY;
        java.lang.String string0 = assertionOperatorTypeList0.value();
        assertEquals("empty", string0);
    }
}
