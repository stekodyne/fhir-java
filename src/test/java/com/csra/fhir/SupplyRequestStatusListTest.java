/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:14:47 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SupplyRequestStatusListTest {

    @Test
    public void test0() throws Throwable {
        SupplyRequestStatusList[] supplyRequestStatusListArray0 = SupplyRequestStatusList.values();
        assertNotNull(supplyRequestStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        SupplyRequestStatusList supplyRequestStatusList0 = SupplyRequestStatusList.valueOf("REQUESTED");
        assertEquals("REQUESTED", supplyRequestStatusList0.name());
    }

    @Test
    public void test2() throws Throwable {
        SupplyRequestStatusList supplyRequestStatusList0 = SupplyRequestStatusList.valueOf("COMPLETED");
        assertEquals(SupplyRequestStatusList.COMPLETED, supplyRequestStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        SupplyRequestStatusList supplyRequestStatusList0 = SupplyRequestStatusList.fromValue("requested");
        assertEquals("requested", supplyRequestStatusList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            SupplyRequestStatusList.valueOf((java.lang.String) null);
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
            SupplyRequestStatusList.valueOf("`ilgey (Y;R9[YM");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.SupplyRequestStatusList.`ilgey (Y;R9[YM
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        SupplyRequestStatusList supplyRequestStatusList0 = SupplyRequestStatusList.fromValue("cancelled");
        assertEquals("cancelled", supplyRequestStatusList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            SupplyRequestStatusList.fromValue("anelde");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // anelde
            //
            assertThrownBy("com.csra.fhir.SupplyRequestStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        SupplyRequestStatusList supplyRequestStatusList0 = SupplyRequestStatusList.REQUESTED;
        java.lang.String string0 = supplyRequestStatusList0.value();
        assertEquals("requested", string0);
    }
}
