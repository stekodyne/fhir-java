/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:17:21 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class RestfulConformanceModeListTest {

    @Test
    public void test0() throws Throwable {
        RestfulConformanceModeList[] restfulConformanceModeListArray0 = RestfulConformanceModeList.values();
        assertNotNull(restfulConformanceModeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        RestfulConformanceModeList restfulConformanceModeList0 = RestfulConformanceModeList.valueOf("CLIENT");
        assertEquals(RestfulConformanceModeList.CLIENT, restfulConformanceModeList0);
    }

    @Test
    public void test2() throws Throwable {
        RestfulConformanceModeList restfulConformanceModeList0 = RestfulConformanceModeList.valueOf("SERVER");
        assertEquals("SERVER", restfulConformanceModeList0.name());
    }

    @Test
    public void test3() throws Throwable {
        RestfulConformanceModeList restfulConformanceModeList0 = RestfulConformanceModeList.fromValue("server");
        assertEquals("SERVER", restfulConformanceModeList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            RestfulConformanceModeList.valueOf((java.lang.String) null);
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
            RestfulConformanceModeList.valueOf("client");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.RestfulConformanceModeList.client
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        RestfulConformanceModeList restfulConformanceModeList0 = RestfulConformanceModeList.fromValue("client");
        assertEquals("client", restfulConformanceModeList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            RestfulConformanceModeList.fromValue("mbrqdr");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // mbrqdr
            //
            assertThrownBy("com.csra.fhir.RestfulConformanceModeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        RestfulConformanceModeList restfulConformanceModeList0 = RestfulConformanceModeList.SERVER;
        java.lang.String string0 = restfulConformanceModeList0.value();
        assertEquals("server", string0);
    }
}
