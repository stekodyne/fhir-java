/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:22:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SupplyDeliveryStatusListTest {

    @Test
    public void test0() throws Throwable {
        SupplyDeliveryStatusList[] supplyDeliveryStatusListArray0 = SupplyDeliveryStatusList.values();
        assertNotNull(supplyDeliveryStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        SupplyDeliveryStatusList supplyDeliveryStatusList0 = SupplyDeliveryStatusList.valueOf("IN_PROGRESS");
        assertEquals("IN_PROGRESS", supplyDeliveryStatusList0.name());
    }

    @Test
    public void test2() throws Throwable {
        SupplyDeliveryStatusList supplyDeliveryStatusList0 = SupplyDeliveryStatusList.valueOf("COMPLETED");
        assertEquals(1, supplyDeliveryStatusList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        SupplyDeliveryStatusList supplyDeliveryStatusList0 = SupplyDeliveryStatusList.fromValue("completed");
        assertEquals("COMPLETED", supplyDeliveryStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            SupplyDeliveryStatusList.valueOf((java.lang.String) null);
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
            SupplyDeliveryStatusList.valueOf("\"|\"?i:wgsSdbDD_=");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.SupplyDeliveryStatusList.\"|\"?i:wgsSdbDD_=
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        SupplyDeliveryStatusList supplyDeliveryStatusList0 = SupplyDeliveryStatusList.fromValue("in-progress");
        assertEquals("IN_PROGRESS", supplyDeliveryStatusList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            SupplyDeliveryStatusList.fromValue("52{p{Z0X~");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // 52{p{Z0X~
            //
            assertThrownBy("com.csra.fhir.SupplyDeliveryStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        SupplyDeliveryStatusList supplyDeliveryStatusList0 = SupplyDeliveryStatusList.ABANDONED;
        java.lang.String string0 = supplyDeliveryStatusList0.value();
        assertEquals("abandoned", string0);
    }
}
