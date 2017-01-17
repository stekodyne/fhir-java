/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:58:46 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class LinkTypeListTest {

    @Test
    public void test0() throws Throwable {
        LinkTypeList[] linkTypeListArray0 = LinkTypeList.values();
        assertNotNull(linkTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        LinkTypeList linkTypeList0 = LinkTypeList.valueOf("REPLACE");
        assertEquals(LinkTypeList.REPLACE, linkTypeList0);
    }

    @Test
    public void test2() throws Throwable {
        LinkTypeList linkTypeList0 = LinkTypeList.fromValue("refer");
        assertEquals(1, linkTypeList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            LinkTypeList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            LinkTypeList.valueOf("2yKdl{Xh&^A;");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.LinkTypeList.2yKdl{Xh&^A;
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        LinkTypeList linkTypeList0 = LinkTypeList.fromValue("replace");
        assertEquals("replace", linkTypeList0.value());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            LinkTypeList.fromValue("REPLACE");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // REPLACE
            //
            assertThrownBy("com.csra.fhir.LinkTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        LinkTypeList linkTypeList0 = LinkTypeList.valueOf("REFER");
        java.lang.String string0 = linkTypeList0.value();
        assertEquals("refer", string0);
    }
}
