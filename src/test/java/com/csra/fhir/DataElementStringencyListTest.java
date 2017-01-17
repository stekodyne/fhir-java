/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:09:18 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DataElementStringencyListTest {

    @Test
    public void test0() throws Throwable {
        DataElementStringencyList[] dataElementStringencyListArray0 = DataElementStringencyList.values();
        assertNotNull(dataElementStringencyListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DataElementStringencyList dataElementStringencyList0 = DataElementStringencyList.valueOf("COMPARABLE");
        assertEquals("comparable", dataElementStringencyList0.value());
    }

    @Test
    public void test2() throws Throwable {
        DataElementStringencyList dataElementStringencyList0 = DataElementStringencyList.valueOf("FLEXIBLE");
        assertEquals(DataElementStringencyList.FLEXIBLE, dataElementStringencyList0);
    }

    @Test
    public void test3() throws Throwable {
        DataElementStringencyList dataElementStringencyList0 = DataElementStringencyList.fromValue("comparable");
        assertEquals("COMPARABLE", dataElementStringencyList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DataElementStringencyList.valueOf((java.lang.String) null);
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
            DataElementStringencyList.valueOf("hi,P6$f,_~a^:5./{\"[");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DataElementStringencyList.hi,P6$f,_~a^:5./{\"[
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DataElementStringencyList dataElementStringencyList0 = DataElementStringencyList.fromValue("scaleable");
        assertEquals("SCALEABLE", dataElementStringencyList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DataElementStringencyList.fromValue("42");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // 42
            //
            assertThrownBy("com.csra.fhir.DataElementStringencyList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DataElementStringencyList dataElementStringencyList0 = DataElementStringencyList.SCALEABLE;
        java.lang.String string0 = dataElementStringencyList0.value();
        assertEquals("scaleable", string0);
    }
}
