/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:33:09 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class CarePlanStatusListTest {

    @Test
    public void test0() throws Throwable {
        CarePlanStatusList[] carePlanStatusListArray0 = CarePlanStatusList.values();
        assertNotNull(carePlanStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        CarePlanStatusList carePlanStatusList0 = CarePlanStatusList.valueOf("PROPOSED");
        assertEquals("proposed", carePlanStatusList0.value());
    }

    @Test
    public void test2() throws Throwable {
        CarePlanStatusList carePlanStatusList0 = CarePlanStatusList.valueOf("DRAFT");
        assertEquals("DRAFT", carePlanStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        CarePlanStatusList carePlanStatusList0 = CarePlanStatusList.fromValue("cancelled");
        assertEquals(4, carePlanStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            CarePlanStatusList.valueOf((java.lang.String) null);
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
            CarePlanStatusList.valueOf("*;x?`r't~2b");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.CarePlanStatusList.*;x?`r't~2b
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            CarePlanStatusList.fromValue("PROPOSED");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // PROPOSED
            //
            assertThrownBy("com.csra.fhir.CarePlanStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        CarePlanStatusList carePlanStatusList0 = CarePlanStatusList.fromValue("proposed");
        assertEquals("proposed", carePlanStatusList0.value());
    }

    @Test
    public void test8() throws Throwable {
        CarePlanStatusList carePlanStatusList0 = CarePlanStatusList.ACTIVE;
        java.lang.String string0 = carePlanStatusList0.value();
        assertEquals("active", string0);
    }
}
