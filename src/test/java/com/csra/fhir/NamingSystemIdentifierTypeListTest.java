/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:29:13 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class NamingSystemIdentifierTypeListTest {

    @Test
    public void test0() throws Throwable {
        NamingSystemIdentifierTypeList[] namingSystemIdentifierTypeListArray0 = NamingSystemIdentifierTypeList.values();
        assertNotNull(namingSystemIdentifierTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        NamingSystemIdentifierTypeList namingSystemIdentifierTypeList0 = NamingSystemIdentifierTypeList.valueOf("OID");
        assertEquals("OID", namingSystemIdentifierTypeList0.name());
    }

    @Test
    public void test2() throws Throwable {
        NamingSystemIdentifierTypeList namingSystemIdentifierTypeList0 = NamingSystemIdentifierTypeList.valueOf("URI");
        assertEquals("URI", namingSystemIdentifierTypeList0.name());
    }

    @Test
    public void test3() throws Throwable {
        NamingSystemIdentifierTypeList namingSystemIdentifierTypeList0 = NamingSystemIdentifierTypeList.fromValue("uuid");
        assertEquals("uuid", namingSystemIdentifierTypeList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            NamingSystemIdentifierTypeList.valueOf((java.lang.String) null);
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
            NamingSystemIdentifierTypeList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.NamingSystemIdentifierTypeList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        NamingSystemIdentifierTypeList namingSystemIdentifierTypeList0 = NamingSystemIdentifierTypeList.fromValue("oid");
        assertEquals("OID", namingSystemIdentifierTypeList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            NamingSystemIdentifierTypeList.fromValue("OID");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // OID
            //
            assertThrownBy("com.csra.fhir.NamingSystemIdentifierTypeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        NamingSystemIdentifierTypeList namingSystemIdentifierTypeList0 = NamingSystemIdentifierTypeList.URI;
        java.lang.String string0 = namingSystemIdentifierTypeList0.value();
        assertEquals("uri", string0);
    }
}
