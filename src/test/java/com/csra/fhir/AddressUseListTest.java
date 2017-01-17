/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:30:17 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AddressUseListTest {

    @Test
    public void test0() throws Throwable {
        AddressUseList[] addressUseListArray0 = AddressUseList.values();
        assertNotNull(addressUseListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AddressUseList addressUseList0 = AddressUseList.valueOf("HOME");
        assertEquals("HOME", addressUseList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        AddressUseList addressUseList0 = AddressUseList.valueOf("WORK");
        assertEquals(1, addressUseList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        AddressUseList addressUseList0 = AddressUseList.fromValue("work");
        assertEquals(1, addressUseList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AddressUseList.valueOf((java.lang.String) null);
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
            AddressUseList.valueOf("Qe^");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AddressUseList.Qe^
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        AddressUseList addressUseList0 = AddressUseList.fromValue("home");
        assertEquals("home", addressUseList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            AddressUseList.fromValue("/Bob/mlV_z]cs");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // /Bob/mlV_z]cs
            //
            assertThrownBy("com.csra.fhir.AddressUseList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        AddressUseList addressUseList0 = AddressUseList.OLD;
        java.lang.String string0 = addressUseList0.value();
        assertEquals("old", string0);
    }
}
