/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:00:14 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SearchEntryModeListTest {

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            SearchEntryModeList.fromValue("isclude");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // isclude
            //
            assertThrownBy("com.csra.fhir.SearchEntryModeList", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        SearchEntryModeList[] searchEntryModeListArray0 = SearchEntryModeList.values();
        assertNotNull(searchEntryModeListArray0);
    }

    @Test
    public void test2() throws Throwable {
        SearchEntryModeList searchEntryModeList0 = SearchEntryModeList.valueOf("MATCH");
        assertEquals("match", searchEntryModeList0.value());
    }

    @Test
    public void test3() throws Throwable {
        SearchEntryModeList searchEntryModeList0 = SearchEntryModeList.valueOf("OUTCOME");
        assertEquals("OUTCOME", searchEntryModeList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        SearchEntryModeList searchEntryModeList0 = SearchEntryModeList.fromValue("match");
        assertEquals("MATCH", searchEntryModeList0.toString());
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            SearchEntryModeList.valueOf((java.lang.String) null);
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
            SearchEntryModeList.valueOf("include");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.SearchEntryModeList.include
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        SearchEntryModeList searchEntryModeList0 = SearchEntryModeList.fromValue("include");
        assertEquals("INCLUDE", searchEntryModeList0.name());
    }

    @Test
    public void test8() throws Throwable {
        SearchEntryModeList searchEntryModeList0 = SearchEntryModeList.MATCH;
        java.lang.String string0 = searchEntryModeList0.value();
        assertEquals("match", string0);
    }
}
