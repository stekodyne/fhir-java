/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:05:13 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class OperationKindListTest {

    @Test
    public void test0() throws Throwable {
        OperationKindList[] operationKindListArray0 = OperationKindList.values();
        assertNotNull(operationKindListArray0);
    }

    @Test
    public void test1() throws Throwable {
        OperationKindList operationKindList0 = OperationKindList.valueOf("OPERATION");
        assertEquals("operation", operationKindList0.value());
    }

    @Test
    public void test2() throws Throwable {
        OperationKindList operationKindList0 = OperationKindList.valueOf("QUERY");
        assertEquals("QUERY", operationKindList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        OperationKindList operationKindList0 = OperationKindList.fromValue("operation");
        assertEquals("operation", operationKindList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            OperationKindList.valueOf((java.lang.String) null);
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
            OperationKindList.valueOf("r$PUq0yDjwJ/0");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.OperationKindList.r$PUq0yDjwJ/0
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        OperationKindList operationKindList0 = OperationKindList.fromValue("query");
        assertEquals(1, operationKindList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            OperationKindList.fromValue(" ");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.OperationKindList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        OperationKindList operationKindList0 = OperationKindList.OPERATION;
        java.lang.String string0 = operationKindList0.value();
        assertEquals("operation", string0);
    }
}
