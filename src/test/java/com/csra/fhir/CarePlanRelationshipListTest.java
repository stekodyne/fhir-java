/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:03:24 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class CarePlanRelationshipListTest {

    @Test
    public void test0() throws Throwable {
        CarePlanRelationshipList[] carePlanRelationshipListArray0 = CarePlanRelationshipList.values();
        assertNotNull(carePlanRelationshipListArray0);
    }

    @Test
    public void test1() throws Throwable {
        CarePlanRelationshipList carePlanRelationshipList0 = CarePlanRelationshipList.valueOf("INCLUDES");
        assertEquals("INCLUDES", carePlanRelationshipList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        CarePlanRelationshipList carePlanRelationshipList0 = CarePlanRelationshipList.valueOf("REPLACES");
        assertEquals("REPLACES", carePlanRelationshipList0.name());
    }

    @Test
    public void test3() throws Throwable {
        CarePlanRelationshipList carePlanRelationshipList0 = CarePlanRelationshipList.fromValue("includes");
        assertEquals(0, carePlanRelationshipList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            CarePlanRelationshipList.valueOf((java.lang.String) null);
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
            CarePlanRelationshipList.valueOf("includes");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.CarePlanRelationshipList.includes
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            CarePlanRelationshipList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.CarePlanRelationshipList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        CarePlanRelationshipList carePlanRelationshipList0 = CarePlanRelationshipList.fromValue("replaces");
        java.lang.String string0 = carePlanRelationshipList0.value();
        assertEquals("replaces", string0);
    }
}
