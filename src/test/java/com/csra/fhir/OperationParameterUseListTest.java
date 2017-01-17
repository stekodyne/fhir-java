/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:17:12 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class OperationParameterUseListTest {

    @Test
    public void test0() throws Throwable {
        OperationParameterUseList[] operationParameterUseListArray0 = OperationParameterUseList.values();
        assertNotNull(operationParameterUseListArray0);
    }

    @Test
    public void test1() throws Throwable {
        OperationParameterUseList operationParameterUseList0 = OperationParameterUseList.valueOf("IN");
        assertEquals("IN", operationParameterUseList0.name());
    }

    @Test
    public void test2() throws Throwable {
        OperationParameterUseList operationParameterUseList0 = OperationParameterUseList.valueOf("OUT");
        assertEquals("out", operationParameterUseList0.value());
    }

    @Test
    public void test3() throws Throwable {
        OperationParameterUseList operationParameterUseList0 = OperationParameterUseList.fromValue("out");
        assertEquals("out", operationParameterUseList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            OperationParameterUseList.valueOf((java.lang.String) null);
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
            OperationParameterUseList.valueOf("D5]Vl4JP;lf");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.OperationParameterUseList.D5]Vl4JP;lf
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        OperationParameterUseList operationParameterUseList0 = OperationParameterUseList.fromValue("in");
        assertEquals("IN", operationParameterUseList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            OperationParameterUseList.fromValue("IN");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // IN
            //
            assertThrownBy("com.csra.fhir.OperationParameterUseList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        OperationParameterUseList operationParameterUseList0 = OperationParameterUseList.OUT;
        java.lang.String string0 = operationParameterUseList0.value();
        assertEquals("out", string0);
    }
}
