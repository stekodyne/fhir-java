/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:19:22 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class BindingStrengthListTest {

    @Test
    public void test0() throws Throwable {
        BindingStrengthList[] bindingStrengthListArray0 = BindingStrengthList.values();
        assertNotNull(bindingStrengthListArray0);
    }

    @Test
    public void test1() throws Throwable {
        BindingStrengthList bindingStrengthList0 = BindingStrengthList.valueOf("REQUIRED");
        assertEquals(BindingStrengthList.REQUIRED, bindingStrengthList0);
    }

    @Test
    public void test2() throws Throwable {
        BindingStrengthList bindingStrengthList0 = BindingStrengthList.valueOf("PREFERRED");
        assertEquals("preferred", bindingStrengthList0.value());
    }

    @Test
    public void test3() throws Throwable {
        BindingStrengthList bindingStrengthList0 = BindingStrengthList.fromValue("extensible");
        assertEquals("extensible", bindingStrengthList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            BindingStrengthList.valueOf((java.lang.String) null);
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
            BindingStrengthList.valueOf("_ImQkUs");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.BindingStrengthList._ImQkUs
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        BindingStrengthList bindingStrengthList0 = BindingStrengthList.fromValue("required");
        assertEquals("REQUIRED", bindingStrengthList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            BindingStrengthList.fromValue("REQUIRED");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // REQUIRED
            //
            assertThrownBy("com.csra.fhir.BindingStrengthList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        BindingStrengthList bindingStrengthList0 = BindingStrengthList.REQUIRED;
        java.lang.String string0 = bindingStrengthList0.value();
        assertEquals("required", string0);
    }
}
