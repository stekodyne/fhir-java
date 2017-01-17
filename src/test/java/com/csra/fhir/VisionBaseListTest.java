/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:15:30 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class VisionBaseListTest {

    @Test
    public void test0() throws Throwable {
        VisionBaseList[] visionBaseListArray0 = VisionBaseList.values();
        assertNotNull(visionBaseListArray0);
    }

    @Test
    public void test1() throws Throwable {
        VisionBaseList visionBaseList0 = VisionBaseList.valueOf("UP");
        assertEquals(VisionBaseList.UP, visionBaseList0);
    }

    @Test
    public void test2() throws Throwable {
        VisionBaseList visionBaseList0 = VisionBaseList.valueOf("IN");
        assertEquals("in", visionBaseList0.value());
    }

    @Test
    public void test3() throws Throwable {
        VisionBaseList visionBaseList0 = VisionBaseList.fromValue("down");
        assertEquals(1, visionBaseList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            VisionBaseList.valueOf((java.lang.String) null);
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
            VisionBaseList.valueOf("Q6Y$csZ");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.VisionBaseList.Q6Y$csZ
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        VisionBaseList visionBaseList0 = VisionBaseList.fromValue("up");
        assertEquals("up", visionBaseList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            VisionBaseList.fromValue("UP");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // UP
            //
            assertThrownBy("com.csra.fhir.VisionBaseList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        VisionBaseList visionBaseList0 = VisionBaseList.DOWN;
        java.lang.String string0 = visionBaseList0.value();
        assertEquals("down", string0);
    }
}
