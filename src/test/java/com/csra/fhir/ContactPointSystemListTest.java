/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:40:49 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ContactPointSystemListTest {

    @Test
    public void test0() throws Throwable {
        ContactPointSystemList[] contactPointSystemListArray0 = ContactPointSystemList.values();
        assertNotNull(contactPointSystemListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ContactPointSystemList contactPointSystemList0 = ContactPointSystemList.valueOf("PHONE");
        assertEquals("phone", contactPointSystemList0.value());
    }

    @Test
    public void test2() throws Throwable {
        ContactPointSystemList contactPointSystemList0 = ContactPointSystemList.valueOf("EMAIL");
        assertEquals(ContactPointSystemList.EMAIL, contactPointSystemList0);
    }

    @Test
    public void test3() throws Throwable {
        ContactPointSystemList contactPointSystemList0 = ContactPointSystemList.fromValue("email");
        assertEquals("email", contactPointSystemList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ContactPointSystemList.valueOf((java.lang.String) null);
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
            ContactPointSystemList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ContactPointSystemList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ContactPointSystemList contactPointSystemList0 = ContactPointSystemList.fromValue("phone");
        assertEquals(0, contactPointSystemList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ContactPointSystemList.fromValue("L$fY,~");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // L$fY,~
            //
            assertThrownBy("com.csra.fhir.ContactPointSystemList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ContactPointSystemList contactPointSystemList0 = ContactPointSystemList.OTHER;
        java.lang.String string0 = contactPointSystemList0.value();
        assertEquals("other", string0);
    }
}
