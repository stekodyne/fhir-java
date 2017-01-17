/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:13:12 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ScopeTest {

    @Test
    public void test0() throws Throwable {
        Scope[] scopeArray0 = Scope.values();
        assertNotNull(scopeArray0);
    }

    @Test
    public void test1() throws Throwable {
        Scope scope0 = Scope.valueOf("ROW");
        assertEquals("row", scope0.value());
    }

    @Test
    public void test2() throws Throwable {
        Scope scope0 = Scope.valueOf("COLGROUP");
        assertEquals("colgroup", scope0.value());
    }

    @Test
    public void test3() throws Throwable {
        Scope scope0 = Scope.fromValue("col");
        assertEquals("col", scope0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            Scope.valueOf((java.lang.String) null);
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
            Scope.valueOf("]");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.Scope.]
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        Scope scope0 = Scope.fromValue("row");
        assertEquals("ROW", scope0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            Scope.fromValue("ROW");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ROW
            //
            assertThrownBy("com.csra.fhir.Scope", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        Scope scope0 = Scope.COL;
        java.lang.String string0 = scope0.value();
        assertEquals("col", string0);
    }
}
