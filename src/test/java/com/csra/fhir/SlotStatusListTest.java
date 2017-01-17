/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:20:49 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SlotStatusListTest {

    @Test
    public void test0() throws Throwable {
        SlotStatusList[] slotStatusListArray0 = SlotStatusList.values();
        assertNotNull(slotStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        SlotStatusList slotStatusList0 = SlotStatusList.valueOf("BUSY");
        assertEquals(0, slotStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        SlotStatusList slotStatusList0 = SlotStatusList.valueOf("FREE");
        assertEquals("free", slotStatusList0.value());
    }

    @Test
    public void test3() throws Throwable {
        SlotStatusList slotStatusList0 = SlotStatusList.fromValue("busy");
        assertEquals("busy", slotStatusList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            SlotStatusList.valueOf((java.lang.String) null);
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
            SlotStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.SlotStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        SlotStatusList slotStatusList0 = SlotStatusList.fromValue("free");
        assertEquals("free", slotStatusList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            SlotStatusList.fromValue("AhV17)<%p");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // AhV17)<%p
            //
            assertThrownBy("com.csra.fhir.SlotStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        SlotStatusList slotStatusList0 = SlotStatusList.FREE;
        java.lang.String string0 = slotStatusList0.value();
        assertEquals("free", string0);
    }
}
