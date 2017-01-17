/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:33:58 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ExtensionContextListTest {

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            ExtensionContextList.fromValue("_~:@E");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // _~:@E
            //
            assertThrownBy("com.csra.fhir.ExtensionContextList", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        ExtensionContextList[] extensionContextListArray0 = ExtensionContextList.values();
        assertNotNull(extensionContextListArray0);
    }

    @Test
    public void test2() throws Throwable {
        ExtensionContextList extensionContextList0 = ExtensionContextList.valueOf("RESOURCE");
        assertEquals("RESOURCE", extensionContextList0.name());
    }

    @Test
    public void test3() throws Throwable {
        ExtensionContextList extensionContextList0 = ExtensionContextList.valueOf("EXTENSION");
        assertEquals("extension", extensionContextList0.value());
    }

    @Test
    public void test4() throws Throwable {
        ExtensionContextList extensionContextList0 = ExtensionContextList.fromValue("extension");
        assertEquals("extension", extensionContextList0.value());
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            ExtensionContextList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ExtensionContextList.valueOf("resource");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ExtensionContextList.resource
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ExtensionContextList extensionContextList0 = ExtensionContextList.fromValue("resource");
        assertEquals("RESOURCE", extensionContextList0.name());
    }

    @Test
    public void test8() throws Throwable {
        ExtensionContextList extensionContextList0 = ExtensionContextList.RESOURCE;
        java.lang.String string0 = extensionContextList0.value();
        assertEquals("resource", string0);
    }
}
