/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:44:16 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class NameUseListTest {

    @Test
    public void test0() throws Throwable {
        NameUseList[] nameUseListArray0 = NameUseList.values();
        assertNotNull(nameUseListArray0);
    }

    @Test
    public void test1() throws Throwable {
        NameUseList nameUseList0 = NameUseList.valueOf("USUAL");
        assertEquals("usual", nameUseList0.value());
    }

    @Test
    public void test2() throws Throwable {
        NameUseList nameUseList0 = NameUseList.valueOf("NICKNAME");
        assertEquals(3, nameUseList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        NameUseList nameUseList0 = NameUseList.fromValue("anonymous");
        assertEquals("ANONYMOUS", nameUseList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            NameUseList.valueOf((java.lang.String) null);
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
            NameUseList.valueOf("usual");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.NameUseList.usual
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        NameUseList nameUseList0 = NameUseList.fromValue("usual");
        assertEquals("USUAL", nameUseList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            NameUseList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.NameUseList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        NameUseList nameUseList0 = NameUseList.TEMP;
        java.lang.String string0 = nameUseList0.value();
        assertEquals("temp", string0);
    }
}
