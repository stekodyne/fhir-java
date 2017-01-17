/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:27:35 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ConformanceStatementKindListTest {

    @Test
    public void test0() throws Throwable {
        ConformanceStatementKindList[] conformanceStatementKindListArray0 = ConformanceStatementKindList.values();
        assertNotNull(conformanceStatementKindListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ConformanceStatementKindList conformanceStatementKindList0 = ConformanceStatementKindList.valueOf("INSTANCE");
        assertEquals("INSTANCE", conformanceStatementKindList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        ConformanceStatementKindList conformanceStatementKindList0 = ConformanceStatementKindList.fromValue("instance");
        assertEquals("INSTANCE", conformanceStatementKindList0.name());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            ConformanceStatementKindList.valueOf((java.lang.String) null);
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
            ConformanceStatementKindList.valueOf("capability");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ConformanceStatementKindList.capability
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        ConformanceStatementKindList conformanceStatementKindList0 = ConformanceStatementKindList.fromValue("capability");
        assertEquals("CAPABILITY", conformanceStatementKindList0.name());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ConformanceStatementKindList.fromValue("H]+Q<:w\"DbX");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // H]+Q<:w\"DbX
            //
            assertThrownBy("com.csra.fhir.ConformanceStatementKindList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ConformanceStatementKindList conformanceStatementKindList0 = ConformanceStatementKindList.valueOf("CAPABILITY");
        java.lang.String string0 = conformanceStatementKindList0.value();
        assertEquals("capability", string0);
    }
}
