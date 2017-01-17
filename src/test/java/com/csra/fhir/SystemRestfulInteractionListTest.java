/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:30:39 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SystemRestfulInteractionListTest {

    @Test
    public void test0() throws Throwable {
        SystemRestfulInteractionList[] systemRestfulInteractionListArray0 = SystemRestfulInteractionList.values();
        assertNotNull(systemRestfulInteractionListArray0);
    }

    @Test
    public void test1() throws Throwable {
        SystemRestfulInteractionList systemRestfulInteractionList0 = SystemRestfulInteractionList.valueOf("TRANSACTION");
        assertEquals(SystemRestfulInteractionList.TRANSACTION, systemRestfulInteractionList0);
    }

    @Test
    public void test2() throws Throwable {
        SystemRestfulInteractionList systemRestfulInteractionList0 = SystemRestfulInteractionList.valueOf("SEARCH_SYSTEM");
        assertEquals("SEARCH_SYSTEM", systemRestfulInteractionList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        SystemRestfulInteractionList systemRestfulInteractionList0 = SystemRestfulInteractionList.fromValue("search-system");
        assertEquals("SEARCH_SYSTEM", systemRestfulInteractionList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            SystemRestfulInteractionList.valueOf((java.lang.String) null);
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
        SystemRestfulInteractionList systemRestfulInteractionList0 = SystemRestfulInteractionList.fromValue("transaction");
        assertEquals("TRANSACTION", systemRestfulInteractionList0.name());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            SystemRestfulInteractionList.fromValue((java.lang.String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("com.csra.fhir.SystemRestfulInteractionList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        SystemRestfulInteractionList systemRestfulInteractionList0 = SystemRestfulInteractionList.SEARCH_SYSTEM;
        java.lang.String string0 = systemRestfulInteractionList0.value();
        assertEquals("search-system", string0);
    }
}
