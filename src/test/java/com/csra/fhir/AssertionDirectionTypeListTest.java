/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:16:18 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AssertionDirectionTypeListTest {

    @Test
    public void test0() throws Throwable {
        AssertionDirectionTypeList[] assertionDirectionTypeListArray0 = AssertionDirectionTypeList.values();
        assertNotNull(assertionDirectionTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AssertionDirectionTypeList assertionDirectionTypeList0 = AssertionDirectionTypeList.valueOf("RESPONSE");
        assertEquals("RESPONSE", assertionDirectionTypeList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        AssertionDirectionTypeList assertionDirectionTypeList0 = AssertionDirectionTypeList.valueOf("REQUEST");
        assertEquals(AssertionDirectionTypeList.REQUEST, assertionDirectionTypeList0);
    }

    @Test
    public void test3() throws Throwable {
        AssertionDirectionTypeList assertionDirectionTypeList0 = AssertionDirectionTypeList.fromValue("response");
        assertEquals("RESPONSE", assertionDirectionTypeList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AssertionDirectionTypeList.valueOf((java.lang.String) null);
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
            AssertionDirectionTypeList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AssertionDirectionTypeList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            AssertionDirectionTypeList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.AssertionDirectionTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        AssertionDirectionTypeList assertionDirectionTypeList0 = AssertionDirectionTypeList.fromValue("request");
        assertEquals("REQUEST", assertionDirectionTypeList0.toString());
    }

    @Test
    public void test8() throws Throwable {
        AssertionDirectionTypeList assertionDirectionTypeList0 = AssertionDirectionTypeList.RESPONSE;
        java.lang.String string0 = assertionDirectionTypeList0.value();
        assertEquals("response", string0);
    }
}
