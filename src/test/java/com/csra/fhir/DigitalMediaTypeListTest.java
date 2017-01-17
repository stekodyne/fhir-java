/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:11:36 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DigitalMediaTypeListTest {

    @Test
    public void test0() throws Throwable {
        DigitalMediaTypeList[] digitalMediaTypeListArray0 = DigitalMediaTypeList.values();
        assertNotNull(digitalMediaTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DigitalMediaTypeList digitalMediaTypeList0 = DigitalMediaTypeList.valueOf("VIDEO");
        assertEquals(1, digitalMediaTypeList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        DigitalMediaTypeList digitalMediaTypeList0 = DigitalMediaTypeList.fromValue("photo");
        assertEquals("PHOTO", digitalMediaTypeList0.name());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            DigitalMediaTypeList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DigitalMediaTypeList.valueOf("='z[H;>xFg<Tr\"y");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DigitalMediaTypeList.='z[H;>xFg<Tr\"y
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        DigitalMediaTypeList digitalMediaTypeList0 = DigitalMediaTypeList.fromValue("audio");
        assertEquals("audio", digitalMediaTypeList0.value());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            DigitalMediaTypeList.fromValue("audin");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // audin
            //
            assertThrownBy("com.csra.fhir.DigitalMediaTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        DigitalMediaTypeList digitalMediaTypeList0 = DigitalMediaTypeList.valueOf("PHOTO");
        java.lang.String string0 = digitalMediaTypeList0.value();
        assertEquals("photo", string0);
    }
}
