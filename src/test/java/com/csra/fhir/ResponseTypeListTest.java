/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:28:34 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ResponseTypeListTest {

    @Test
    public void test0() throws Throwable {
        ResponseTypeList[] responseTypeListArray0 = ResponseTypeList.values();
        assertNotNull(responseTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ResponseTypeList responseTypeList0 = ResponseTypeList.valueOf("OK");
        assertEquals(ResponseTypeList.OK, responseTypeList0);
    }

    @Test
    public void test2() throws Throwable {
        ResponseTypeList responseTypeList0 = ResponseTypeList.valueOf("FATAL_ERROR");
        assertEquals("FATAL_ERROR", responseTypeList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        ResponseTypeList responseTypeList0 = ResponseTypeList.fromValue("fatal-error");
        assertEquals(2, responseTypeList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ResponseTypeList.valueOf((java.lang.String) null);
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
        ResponseTypeList responseTypeList0 = ResponseTypeList.fromValue("ok");
        assertEquals(0, responseTypeList0.ordinal());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ResponseTypeList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.ResponseTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ResponseTypeList responseTypeList0 = ResponseTypeList.FATAL_ERROR;
        java.lang.String string0 = responseTypeList0.value();
        assertEquals("fatal-error", string0);
    }
}
