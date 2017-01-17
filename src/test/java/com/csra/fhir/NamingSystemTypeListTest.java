/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:49:20 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

//

public class NamingSystemTypeListTest {

    @Test
    public void test0() throws Throwable {
        NamingSystemTypeList[] namingSystemTypeListArray0 = NamingSystemTypeList.values();
        assertNotNull(namingSystemTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        NamingSystemTypeList namingSystemTypeList0 = NamingSystemTypeList.valueOf("CODESYSTEM");
        assertEquals(0, namingSystemTypeList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        NamingSystemTypeList namingSystemTypeList0 = NamingSystemTypeList.valueOf("IDENTIFIER");
        assertEquals(NamingSystemTypeList.IDENTIFIER.toString(), namingSystemTypeList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        NamingSystemTypeList namingSystemTypeList0 = NamingSystemTypeList.fromValue("root");
        assertEquals("root", namingSystemTypeList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            NamingSystemTypeList.valueOf((java.lang.String) null);
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
            NamingSystemTypeList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.NamingSystemTypeList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        NamingSystemTypeList namingSystemTypeList0 = NamingSystemTypeList.fromValue("codesystem");
        assertEquals(0, namingSystemTypeList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            NamingSystemTypeList.fromValue("IDENTIFIER");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // IDENTIFIER
            //
            assertThrownBy("com.csra.fhir.NamingSystemTypeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        NamingSystemTypeList namingSystemTypeList0 = NamingSystemTypeList.ROOT;
        java.lang.String string0 = namingSystemTypeList0.value();
        assertEquals("root", string0);
    }
}
