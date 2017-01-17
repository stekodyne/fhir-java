/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:20:12 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class UseListTest {

    @Test
    public void test0() throws Throwable {
        UseList[] useListArray0 = UseList.values();
        assertNotNull(useListArray0);
    }

    @Test
    public void test1() throws Throwable {
        UseList useList0 = UseList.valueOf("COMPLETE");
        assertEquals(UseList.COMPLETE, useList0);
    }

    @Test
    public void test2() throws Throwable {
        UseList useList0 = UseList.valueOf("OTHER");
        assertEquals("OTHER", useList0.name());
    }

    @Test
    public void test3() throws Throwable {
        UseList useList0 = UseList.fromValue("complete");
        assertEquals("COMPLETE", useList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            UseList.valueOf((java.lang.String) null);
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
            UseList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.UseList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            UseList.fromValue("COMPLETE");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // COMPLETE
            //
            assertThrownBy("com.csra.fhir.UseList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        UseList useList0 = UseList.fromValue("exploratory");
        java.lang.String string0 = useList0.value();
        assertEquals("exploratory", string0);
    }
}
