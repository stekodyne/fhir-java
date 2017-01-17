/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:04:41 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class InputTypeTest {

    @Test
    public void test0() throws Throwable {
        InputType[] inputTypeArray0 = InputType.values();
        assertNotNull(inputTypeArray0);
    }

    @Test
    public void test1() throws Throwable {
        InputType inputType0 = InputType.valueOf("TEXT");
        assertEquals(InputType.TEXT, inputType0);
    }

    @Test
    public void test2() throws Throwable {
        InputType inputType0 = InputType.valueOf("RESET");
        assertEquals(5, inputType0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        InputType inputType0 = InputType.fromValue("password");
        assertEquals("PASSWORD", inputType0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            InputType.valueOf((java.lang.String) null);
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
            InputType.valueOf("eT4,6F");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.InputType.eT4,6F
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        InputType inputType0 = InputType.fromValue("text");
        assertEquals("TEXT", inputType0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            InputType.fromValue("radiq");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // radiq
            //
            assertThrownBy("com.csra.fhir.InputType", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        InputType inputType0 = InputType.HIDDEN;
        java.lang.String string0 = inputType0.value();
        assertEquals("hidden", string0);
    }
}
