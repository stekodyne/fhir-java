/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:25:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class SearchParamTypeListTest {

    @Test
    public void test0() throws Throwable {
        SearchParamTypeList[] searchParamTypeListArray0 = SearchParamTypeList.values();
        assertNotNull(searchParamTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        SearchParamTypeList searchParamTypeList0 = SearchParamTypeList.valueOf("TOKEN");
        assertEquals(SearchParamTypeList.TOKEN, searchParamTypeList0);
    }

    @Test
    public void test2() throws Throwable {
        // Undeclared exception!
        try {
            SearchParamTypeList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        SearchParamTypeList searchParamTypeList0 = SearchParamTypeList.fromValue("composite");
        assertEquals("composite", searchParamTypeList0.value());
    }

    @Test
    public void test4() throws Throwable {
        SearchParamTypeList searchParamTypeList0 = SearchParamTypeList.fromValue("number");
        assertEquals("NUMBER", searchParamTypeList0.toString());
    }

    @Test
    public void test5() throws Throwable {
        SearchParamTypeList searchParamTypeList0 = SearchParamTypeList.valueOf("NUMBER");
        java.lang.String string0 = searchParamTypeList0.value();
        assertEquals("number", string0);
    }
}
