/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:06:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ConstraintSeverityListTest {

    @Test
    public void test0() throws Throwable {
        ConstraintSeverityList[] constraintSeverityListArray0 = ConstraintSeverityList.values();
        assertNotNull(constraintSeverityListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ConstraintSeverityList constraintSeverityList0 = ConstraintSeverityList.valueOf("ERROR");
        assertEquals(ConstraintSeverityList.ERROR, constraintSeverityList0);
    }

    @Test
    public void test2() throws Throwable {
        ConstraintSeverityList constraintSeverityList0 = ConstraintSeverityList.valueOf("WARNING");
        assertEquals(ConstraintSeverityList.WARNING, constraintSeverityList0);
    }

    @Test
    public void test3() throws Throwable {
        ConstraintSeverityList constraintSeverityList0 = ConstraintSeverityList.fromValue("error");
        assertEquals("error", constraintSeverityList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ConstraintSeverityList.valueOf((java.lang.String) null);
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
            ConstraintSeverityList.valueOf("warning");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ConstraintSeverityList.warning
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ConstraintSeverityList constraintSeverityList0 = ConstraintSeverityList.fromValue("warning");
        assertEquals("WARNING", constraintSeverityList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ConstraintSeverityList.fromValue("V");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // V
            //
            assertThrownBy("com.csra.fhir.ConstraintSeverityList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ConstraintSeverityList constraintSeverityList0 = ConstraintSeverityList.ERROR;
        java.lang.String string0 = constraintSeverityList0.value();
        assertEquals("error", string0);
    }
}
