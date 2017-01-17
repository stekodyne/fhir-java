/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:35:58 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ObservationRelationshipTypeListTest {

    @Test
    public void test0() throws Throwable {
        ObservationRelationshipTypeList[] observationRelationshipTypeListArray0 = ObservationRelationshipTypeList.values();
        assertNotNull(observationRelationshipTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ObservationRelationshipTypeList observationRelationshipTypeList0 = ObservationRelationshipTypeList.valueOf("HAS_MEMBER");
        assertEquals("HAS_MEMBER", observationRelationshipTypeList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        ObservationRelationshipTypeList observationRelationshipTypeList0 = ObservationRelationshipTypeList.valueOf("INTERFERED_BY");
        assertEquals("INTERFERED_BY", observationRelationshipTypeList0.name());
    }

    @Test
    public void test3() throws Throwable {
        ObservationRelationshipTypeList observationRelationshipTypeList0 = ObservationRelationshipTypeList.fromValue("has-member");
        assertEquals("HAS_MEMBER", observationRelationshipTypeList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ObservationRelationshipTypeList.valueOf((java.lang.String) null);
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
            ObservationRelationshipTypeList.valueOf("sequel-to");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ObservationRelationshipTypeList.sequel-to
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ObservationRelationshipTypeList observationRelationshipTypeList0 = ObservationRelationshipTypeList.fromValue("qualified-by");
        assertEquals("qualified-by", observationRelationshipTypeList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ObservationRelationshipTypeList.fromValue("bhlr[fhj");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // bhlr[fhj
            //
            assertThrownBy("com.csra.fhir.ObservationRelationshipTypeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ObservationRelationshipTypeList observationRelationshipTypeList0 = ObservationRelationshipTypeList.QUALIFIED_BY;
        java.lang.String string0 = observationRelationshipTypeList0.value();
        assertEquals("qualified-by", string0);
    }
}
