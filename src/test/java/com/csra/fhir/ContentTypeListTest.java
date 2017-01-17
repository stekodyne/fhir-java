/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:22:08 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ContentTypeListTest {

    @Test
    public void test0() throws Throwable {
        ContentTypeList[] contentTypeListArray0 = ContentTypeList.values();
        assertNotNull(contentTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ContentTypeList contentTypeList0 = ContentTypeList.valueOf("XML");
        assertEquals("XML", contentTypeList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        ContentTypeList contentTypeList0 = ContentTypeList.valueOf("JSON");
        assertEquals("JSON", contentTypeList0.name());
    }

    @Test
    public void test3() throws Throwable {
        ContentTypeList contentTypeList0 = ContentTypeList.fromValue("json");
        assertEquals("json", contentTypeList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ContentTypeList.valueOf((java.lang.String) null);
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
        ContentTypeList contentTypeList0 = ContentTypeList.fromValue("xml");
        assertEquals("XML", contentTypeList0.name());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ContentTypeList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.ContentTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ContentTypeList contentTypeList0 = ContentTypeList.JSON;
        java.lang.String string0 = contentTypeList0.value();
        assertEquals("json", string0);
    }
}
