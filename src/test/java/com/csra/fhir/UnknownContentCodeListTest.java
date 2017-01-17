/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:59:13 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class UnknownContentCodeListTest {

    @Test
    public void test0() throws Throwable {
        UnknownContentCodeList[] unknownContentCodeListArray0 = UnknownContentCodeList.values();
        assertNotNull(unknownContentCodeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        UnknownContentCodeList unknownContentCodeList0 = UnknownContentCodeList.valueOf("NO");
        assertEquals("NO", unknownContentCodeList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        UnknownContentCodeList unknownContentCodeList0 = UnknownContentCodeList.valueOf("EXTENSIONS");
        assertEquals(UnknownContentCodeList.EXTENSIONS, unknownContentCodeList0);
    }

    @Test
    public void test3() throws Throwable {
        UnknownContentCodeList unknownContentCodeList0 = UnknownContentCodeList.fromValue("extensions");
        assertEquals("EXTENSIONS", unknownContentCodeList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            UnknownContentCodeList.valueOf((java.lang.String) null);
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
            UnknownContentCodeList.valueOf("NL");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.UnknownContentCodeList.NL
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        UnknownContentCodeList unknownContentCodeList0 = UnknownContentCodeList.fromValue("no");
        assertEquals("no", unknownContentCodeList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            UnknownContentCodeList.fromValue("SC`TMs){Z~&R0zYFc");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // SC`TMs){Z~&R0zYFc
            //
            assertThrownBy("com.csra.fhir.UnknownContentCodeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        UnknownContentCodeList unknownContentCodeList0 = UnknownContentCodeList.NO;
        java.lang.String string0 = unknownContentCodeList0.value();
        assertEquals("no", string0);
    }
}
