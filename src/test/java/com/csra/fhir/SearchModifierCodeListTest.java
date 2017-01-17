/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:10:05 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SearchModifierCodeListTest {

    @Test
    public void test0() throws Throwable {
        SearchModifierCodeList[] searchModifierCodeListArray0 = SearchModifierCodeList.values();
        assertNotNull(searchModifierCodeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        SearchModifierCodeList searchModifierCodeList0 = SearchModifierCodeList.valueOf("MISSING");
        assertEquals("MISSING", searchModifierCodeList0.name());
    }

    @Test
    public void test2() throws Throwable {
        SearchModifierCodeList searchModifierCodeList0 = SearchModifierCodeList.valueOf("IN");
        assertEquals("IN", searchModifierCodeList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        SearchModifierCodeList searchModifierCodeList0 = SearchModifierCodeList.fromValue("type");
        assertEquals(9, searchModifierCodeList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            SearchModifierCodeList.valueOf((java.lang.String) null);
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
            SearchModifierCodeList.valueOf("type");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.SearchModifierCodeList.type
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        SearchModifierCodeList searchModifierCodeList0 = SearchModifierCodeList.fromValue("missing");
        assertEquals("MISSING", searchModifierCodeList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            SearchModifierCodeList.fromValue("MISSING");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // MISSING
            //
            assertThrownBy("com.csra.fhir.SearchModifierCodeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        SearchModifierCodeList searchModifierCodeList0 = SearchModifierCodeList.MISSING;
        java.lang.String string0 = searchModifierCodeList0.value();
        assertEquals("missing", string0);
    }
}
