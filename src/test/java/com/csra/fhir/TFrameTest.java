/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:11:22 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class TFrameTest {

    @Test
    public void test0() throws Throwable {
        TFrame[] tFrameArray0 = TFrame.values();
        assertNotNull(tFrameArray0);
    }

    @Test
    public void test1() throws Throwable {
        TFrame tFrame0 = TFrame.valueOf("VOID");
        assertEquals(0, tFrame0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        TFrame tFrame0 = TFrame.valueOf("BORDER");
        assertEquals(8, tFrame0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        TFrame tFrame0 = TFrame.fromValue("void");
        assertEquals(0, tFrame0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            TFrame.valueOf((java.lang.String) null);
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
            TFrame.valueOf("rhs");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.TFrame.rhs
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        TFrame tFrame0 = TFrame.fromValue("rhs");
        assertEquals(5, tFrame0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            TFrame.fromValue((java.lang.String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("com.csra.fhir.TFrame", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        TFrame tFrame0 = TFrame.RHS;
        java.lang.String string0 = tFrame0.value();
        assertEquals("rhs", string0);
    }
}
