/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:27:14 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ConceptMapEquivalenceListTest {

    @Test
    public void test0() throws Throwable {
        ConceptMapEquivalenceList[] conceptMapEquivalenceListArray0 = ConceptMapEquivalenceList.values();
        assertNotNull(conceptMapEquivalenceListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ConceptMapEquivalenceList conceptMapEquivalenceList0 = ConceptMapEquivalenceList.valueOf("SUBSUMES");
        assertEquals("SUBSUMES", conceptMapEquivalenceList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        ConceptMapEquivalenceList conceptMapEquivalenceList0 = ConceptMapEquivalenceList.fromValue("disjoint");
        assertEquals("disjoint", conceptMapEquivalenceList0.value());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            ConceptMapEquivalenceList.valueOf((java.lang.String) null);
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
            ConceptMapEquivalenceList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ConceptMapEquivalenceList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        ConceptMapEquivalenceList conceptMapEquivalenceList0 = ConceptMapEquivalenceList.fromValue("equivalent");
        assertEquals(0, conceptMapEquivalenceList0.ordinal());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ConceptMapEquivalenceList.fromValue("SUBSUMES");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // SUBSUMES
            //
            assertThrownBy("com.csra.fhir.ConceptMapEquivalenceList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ConceptMapEquivalenceList conceptMapEquivalenceList0 = ConceptMapEquivalenceList.valueOf("EQUIVALENT");
        java.lang.String string0 = conceptMapEquivalenceList0.value();
        assertEquals("equivalent", string0);
    }
}
