/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:45:53 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ConditionalDeleteStatusListTest {

    @Test
    public void test0() throws Throwable {
        ConditionalDeleteStatusList[] conditionalDeleteStatusListArray0 = ConditionalDeleteStatusList.values();
        assertNotNull(conditionalDeleteStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ConditionalDeleteStatusList conditionalDeleteStatusList0 = ConditionalDeleteStatusList.valueOf("NOT_SUPPORTED");
        assertEquals(0, conditionalDeleteStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        ConditionalDeleteStatusList conditionalDeleteStatusList0 = ConditionalDeleteStatusList.valueOf("SINGLE");
        assertEquals("single", conditionalDeleteStatusList0.value());
    }

    @Test
    public void test3() throws Throwable {
        ConditionalDeleteStatusList conditionalDeleteStatusList0 = ConditionalDeleteStatusList.fromValue("not-supported");
        assertEquals("NOT_SUPPORTED", conditionalDeleteStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ConditionalDeleteStatusList.valueOf((java.lang.String) null);
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
            ConditionalDeleteStatusList.valueOf("0myW3N V");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ConditionalDeleteStatusList.0myW3N V
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ConditionalDeleteStatusList conditionalDeleteStatusList0 = ConditionalDeleteStatusList.fromValue("multiple");
        assertEquals("multiple", conditionalDeleteStatusList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ConditionalDeleteStatusList.fromValue("multip^e");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // multip^e
            //
            assertThrownBy("com.csra.fhir.ConditionalDeleteStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ConditionalDeleteStatusList conditionalDeleteStatusList0 = ConditionalDeleteStatusList.MULTIPLE;
        java.lang.String string0 = conditionalDeleteStatusList0.value();
        assertEquals("multiple", string0);
    }
}
