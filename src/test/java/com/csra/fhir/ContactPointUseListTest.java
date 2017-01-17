/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:45:52 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ContactPointUseListTest {

    @Test
    public void test0() throws Throwable {
        ContactPointUseList[] contactPointUseListArray0 = ContactPointUseList.values();
        assertNotNull(contactPointUseListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ContactPointUseList contactPointUseList0 = ContactPointUseList.valueOf("HOME");
        assertEquals("home", contactPointUseList0.value());
    }

    @Test
    public void test2() throws Throwable {
        ContactPointUseList contactPointUseList0 = ContactPointUseList.valueOf("TEMP");
        assertEquals(2, contactPointUseList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        ContactPointUseList contactPointUseList0 = ContactPointUseList.fromValue("home");
        assertEquals("home", contactPointUseList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ContactPointUseList.valueOf((java.lang.String) null);
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
            ContactPointUseList.valueOf("ZVET");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ContactPointUseList.ZVET
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ContactPointUseList.fromValue("bJI%DE($X}<(:v/ ");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // bJI%DE($X}<(:v/
            //
            assertThrownBy("com.csra.fhir.ContactPointUseList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ContactPointUseList contactPointUseList0 = ContactPointUseList.fromValue("work");
        java.lang.String string0 = contactPointUseList0.value();
        assertEquals("work", string0);
    }
}
