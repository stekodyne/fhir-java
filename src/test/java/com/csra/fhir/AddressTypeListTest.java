/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:37:07 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AddressTypeListTest {

    @Test
    public void test0() throws Throwable {
        AddressTypeList[] addressTypeListArray0 = AddressTypeList.values();
        assertNotNull(addressTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AddressTypeList addressTypeList0 = AddressTypeList.valueOf("POSTAL");
        assertEquals("postal", addressTypeList0.value());
    }

    @Test
    public void test2() throws Throwable {
        AddressTypeList addressTypeList0 = AddressTypeList.valueOf("BOTH");
        assertEquals("both", addressTypeList0.value());
    }

    @Test
    public void test3() throws Throwable {
        AddressTypeList addressTypeList0 = AddressTypeList.fromValue("physical");
        assertEquals("physical", addressTypeList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AddressTypeList.valueOf((java.lang.String) null);
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
            AddressTypeList.valueOf(",Q2$}])uQ");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AddressTypeList.,Q2$}])uQ
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        AddressTypeList addressTypeList0 = AddressTypeList.fromValue("postal");
        assertEquals("POSTAL", addressTypeList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            AddressTypeList.fromValue("KCWZ(-9Y6");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // KCWZ(-9Y6
            //
            assertThrownBy("com.csra.fhir.AddressTypeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        AddressTypeList addressTypeList0 = AddressTypeList.POSTAL;
        java.lang.String string0 = addressTypeList0.value();
        assertEquals("postal", string0);
    }
}
