/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:31:03 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class IssueTypeListTest {

    @Test
    public void test0() throws Throwable {
        IssueTypeList[] issueTypeListArray0 = IssueTypeList.values();
        assertNotNull(issueTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        IssueTypeList issueTypeList0 = IssueTypeList.valueOf("INVALID");
        assertEquals("INVALID", issueTypeList0.name());
    }

    @Test
    public void test2() throws Throwable {
        IssueTypeList issueTypeList0 = IssueTypeList.valueOf("EXCEPTION");
        assertEquals("exception", issueTypeList0.value());
    }

    @Test
    public void test3() throws Throwable {
        IssueTypeList issueTypeList0 = IssueTypeList.fromValue("invalid");
        assertEquals(0, issueTypeList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            IssueTypeList.valueOf((java.lang.String) null);
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
            IssueTypeList.valueOf("\"Ig1J");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.IssueTypeList.\"Ig1J
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            IssueTypeList.fromValue((java.lang.String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("com.csra.fhir.IssueTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        IssueTypeList issueTypeList0 = IssueTypeList.fromValue("exception");
        java.lang.String string0 = issueTypeList0.value();
        assertEquals("exception", string0);
    }
}
