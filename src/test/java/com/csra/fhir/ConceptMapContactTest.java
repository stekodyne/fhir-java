/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:53:25 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConceptMapContactTest {

    @Test
    public void test0() throws Throwable {
        ConceptMapContact conceptMapContact0 = new ConceptMapContact();
        java.util.List<ContactPoint> list0 = conceptMapContact0.getTelecom();
        java.util.List<ContactPoint> list1 = conceptMapContact0.getTelecom();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ConceptMapContact conceptMapContact0 = new ConceptMapContact();
        conceptMapContact0.setName((String) null);
        assertNull(conceptMapContact0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ConceptMapContact conceptMapContact0 = new ConceptMapContact();
        String string0 = conceptMapContact0.getName();
        assertNull(string0);
    }
}
