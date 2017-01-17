/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:22:56 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class IssueSeverityListTest {

    @Test
    public void test0() throws Throwable {
        IssueSeverityList[] issueSeverityListArray0 = IssueSeverityList.values();
        assertNotNull(issueSeverityListArray0);
    }

    @Test
    public void test1() throws Throwable {
        IssueSeverityList issueSeverityList0 = IssueSeverityList.valueOf("FATAL");
        assertEquals("fatal", issueSeverityList0.value());
    }

    @Test
    public void test2() throws Throwable {
        IssueSeverityList issueSeverityList0 = IssueSeverityList.valueOf("ERROR");
        assertEquals(IssueSeverityList.ERROR, issueSeverityList0);
    }

    @Test
    public void test3() throws Throwable {
        IssueSeverityList issueSeverityList0 = IssueSeverityList.fromValue("warning");
        assertEquals(2, issueSeverityList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            IssueSeverityList.valueOf((java.lang.String) null);
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
            IssueSeverityList.valueOf("}*Igrr:;/D=tuWRPp^y");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.IssueSeverityList.}*Igrr:;/D=tuWRPp^y
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        IssueSeverityList issueSeverityList0 = IssueSeverityList.fromValue("fatal");
        assertEquals("FATAL", issueSeverityList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            IssueSeverityList.fromValue("fata]");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // fata]
            //
            assertThrownBy("com.csra.fhir.IssueSeverityList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        IssueSeverityList issueSeverityList0 = IssueSeverityList.WARNING;
        java.lang.String string0 = issueSeverityList0.value();
        assertEquals("warning", string0);
    }
}
