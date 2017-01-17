/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:52:14 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class NoteTypeListTest {

    @Test
    public void test0() throws Throwable {
        NoteTypeList[] noteTypeListArray0 = NoteTypeList.values();
        assertNotNull(noteTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        NoteTypeList noteTypeList0 = NoteTypeList.valueOf("DISPLAY");
        assertEquals(NoteTypeList.DISPLAY, noteTypeList0);
    }

    @Test
    public void test2() throws Throwable {
        NoteTypeList noteTypeList0 = NoteTypeList.valueOf("PRINTOPER");
        assertEquals(2, noteTypeList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        NoteTypeList noteTypeList0 = NoteTypeList.fromValue("print");
        assertEquals("PRINT", noteTypeList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            NoteTypeList.valueOf((java.lang.String) null);
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
            NoteTypeList.valueOf("KKZ&_?2i'=j");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.NoteTypeList.KKZ&_?2i'=j
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            NoteTypeList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.NoteTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        NoteTypeList noteTypeList0 = NoteTypeList.fromValue("display");
        java.lang.String string0 = noteTypeList0.value();
        assertEquals("display", string0);
    }
}
