/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:06:20 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DocumentRelationshipTypeListTest {

    @Test
    public void test0() throws Throwable {
        DocumentRelationshipTypeList[] documentRelationshipTypeListArray0 = DocumentRelationshipTypeList.values();
        assertNotNull(documentRelationshipTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DocumentRelationshipTypeList documentRelationshipTypeList0 = DocumentRelationshipTypeList.valueOf("SIGNS");
        assertEquals("SIGNS", documentRelationshipTypeList0.name());
    }

    @Test
    public void test2() throws Throwable {
        DocumentRelationshipTypeList documentRelationshipTypeList0 = DocumentRelationshipTypeList.fromValue("appends");
        assertEquals("APPENDS", documentRelationshipTypeList0.name());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            DocumentRelationshipTypeList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DocumentRelationshipTypeList.valueOf("3(hn0sL5");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DocumentRelationshipTypeList.3(hn0sL5
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        DocumentRelationshipTypeList documentRelationshipTypeList0 = DocumentRelationshipTypeList.fromValue("replaces");
        assertEquals("REPLACES", documentRelationshipTypeList0.toString());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            DocumentRelationshipTypeList.fromValue("com.csra.fhir.DocumentRelationshipTypeList");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // com.csra.fhir.DocumentRelationshipTypeList
            //
            assertThrownBy("com.csra.fhir.DocumentRelationshipTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        DocumentRelationshipTypeList documentRelationshipTypeList0 = DocumentRelationshipTypeList.valueOf("REPLACES");
        java.lang.String string0 = documentRelationshipTypeList0.value();
        assertEquals("replaces", string0);
    }
}
