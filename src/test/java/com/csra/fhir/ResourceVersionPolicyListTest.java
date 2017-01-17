/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:01:11 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ResourceVersionPolicyListTest {

    @Test
    public void test0() throws Throwable {
        ResourceVersionPolicyList[] resourceVersionPolicyListArray0 = ResourceVersionPolicyList.values();
        assertNotNull(resourceVersionPolicyListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ResourceVersionPolicyList resourceVersionPolicyList0 = ResourceVersionPolicyList.valueOf("NO_VERSION");
        assertEquals("NO_VERSION", resourceVersionPolicyList0.name());
    }

    @Test
    public void test2() throws Throwable {
        ResourceVersionPolicyList resourceVersionPolicyList0 = ResourceVersionPolicyList.valueOf("VERSIONED");
        assertEquals(ResourceVersionPolicyList.VERSIONED, resourceVersionPolicyList0);
    }

    @Test
    public void test3() throws Throwable {
        ResourceVersionPolicyList resourceVersionPolicyList0 = ResourceVersionPolicyList.fromValue("versioned");
        assertEquals("versioned", resourceVersionPolicyList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ResourceVersionPolicyList.valueOf((java.lang.String) null);
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
            ResourceVersionPolicyList.valueOf("no-version");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ResourceVersionPolicyList.no-version
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ResourceVersionPolicyList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.ResourceVersionPolicyList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ResourceVersionPolicyList resourceVersionPolicyList0 = ResourceVersionPolicyList.fromValue("no-version");
        java.lang.String string0 = resourceVersionPolicyList0.value();
        assertEquals("no-version", string0);
    }
}
