/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:19:38 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class OrderStatusListTest {

    @Test
    public void test0() throws Throwable {
        OrderStatusList[] orderStatusListArray0 = OrderStatusList.values();
        assertNotNull(orderStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        OrderStatusList orderStatusList0 = OrderStatusList.valueOf("PENDING");
        assertEquals("PENDING", orderStatusList0.name());
    }

    @Test
    public void test2() throws Throwable {
        OrderStatusList orderStatusList0 = OrderStatusList.valueOf("REJECTED");
        assertEquals("rejected", orderStatusList0.value());
    }

    @Test
    public void test3() throws Throwable {
        OrderStatusList orderStatusList0 = OrderStatusList.fromValue("pending");
        assertEquals("PENDING", orderStatusList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            OrderStatusList.valueOf((java.lang.String) null);
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
            OrderStatusList.valueOf("accepted");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.OrderStatusList.accepted
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            OrderStatusList.fromValue("rbplaced");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // rbplaced
            //
            assertThrownBy("com.csra.fhir.OrderStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        OrderStatusList orderStatusList0 = OrderStatusList.fromValue("replaced");
        java.lang.String string0 = orderStatusList0.value();
        assertEquals("replaced", string0);
    }
}
