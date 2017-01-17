/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:23:45 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class TypeRestfulInteractionListTest {

    @Test
    public void test0() throws Throwable {
        TypeRestfulInteractionList[] typeRestfulInteractionListArray0 = TypeRestfulInteractionList.values();
        assertNotNull(typeRestfulInteractionListArray0);
    }

    @Test
    public void test1() throws Throwable {
        TypeRestfulInteractionList typeRestfulInteractionList0 = TypeRestfulInteractionList.valueOf("READ");
        assertEquals("READ", typeRestfulInteractionList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        TypeRestfulInteractionList typeRestfulInteractionList0 = TypeRestfulInteractionList.valueOf("UPDATE");
        assertEquals("UPDATE", typeRestfulInteractionList0.name());
    }

    @Test
    public void test3() throws Throwable {
        TypeRestfulInteractionList typeRestfulInteractionList0 = TypeRestfulInteractionList.fromValue("vread");
        assertEquals("VREAD", typeRestfulInteractionList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            TypeRestfulInteractionList.valueOf((java.lang.String) null);
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
        TypeRestfulInteractionList typeRestfulInteractionList0 = TypeRestfulInteractionList.fromValue("read");
        assertEquals(0, typeRestfulInteractionList0.ordinal());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            TypeRestfulInteractionList.fromValue("NO");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // NO
            //
            assertThrownBy("com.csra.fhir.TypeRestfulInteractionList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        TypeRestfulInteractionList typeRestfulInteractionList0 = TypeRestfulInteractionList.VREAD;
        java.lang.String string0 = typeRestfulInteractionList0.value();
        assertEquals("vread", string0);
    }
}
