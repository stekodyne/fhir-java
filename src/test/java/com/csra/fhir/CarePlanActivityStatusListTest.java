/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:51:06 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class CarePlanActivityStatusListTest {

    @Test
    public void test0() throws Throwable {
        CarePlanActivityStatusList[] carePlanActivityStatusListArray0 = CarePlanActivityStatusList.values();
        assertNotNull(carePlanActivityStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        CarePlanActivityStatusList carePlanActivityStatusList0 = CarePlanActivityStatusList.valueOf("NOT_STARTED");
        assertEquals("not-started", carePlanActivityStatusList0.value());
    }

    @Test
    public void test2() throws Throwable {
        CarePlanActivityStatusList carePlanActivityStatusList0 = CarePlanActivityStatusList.valueOf("SCHEDULED");
        assertEquals("SCHEDULED", carePlanActivityStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        CarePlanActivityStatusList carePlanActivityStatusList0 = CarePlanActivityStatusList.fromValue("scheduled");
        assertEquals(1, carePlanActivityStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            CarePlanActivityStatusList.valueOf((java.lang.String) null);
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
            CarePlanActivityStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.CarePlanActivityStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        CarePlanActivityStatusList carePlanActivityStatusList0 = CarePlanActivityStatusList.fromValue("not-started");
        assertEquals("NOT_STARTED", carePlanActivityStatusList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            CarePlanActivityStatusList.fromValue("eGx}w{:Cf&U_mg4@T8");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // eGx}w{:Cf&U_mg4@T8
            //
            assertThrownBy("com.csra.fhir.CarePlanActivityStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        CarePlanActivityStatusList carePlanActivityStatusList0 = CarePlanActivityStatusList.NOT_STARTED;
        java.lang.String string0 = carePlanActivityStatusList0.value();
        assertEquals("not-started", string0);
    }
}
