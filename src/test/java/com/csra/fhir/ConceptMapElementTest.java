/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:51:04 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConceptMapElementTest {

    @Test
    public void test0() throws Throwable {
        ConceptMapElement conceptMapElement0 = new ConceptMapElement();
        java.util.List<ConceptMapTarget> list0 = conceptMapElement0.getTarget();
        java.util.List<ConceptMapTarget> list1 = conceptMapElement0.getTarget();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ConceptMapElement conceptMapElement0 = new ConceptMapElement();
        Code code0 = conceptMapElement0.getCode();
        assertNull(code0);
    }

    @Test
    public void test2() throws Throwable {
        ConceptMapElement conceptMapElement0 = new ConceptMapElement();
        conceptMapElement0.setCodeSystem((Uri) null);
        assertNull(conceptMapElement0.getId());
    }

    @Test
    public void test3() throws Throwable {
        ConceptMapElement conceptMapElement0 = new ConceptMapElement();
        conceptMapElement0.setCode((Code) null);
        assertNull(conceptMapElement0.getId());
    }

    @Test
    public void test4() throws Throwable {
        ConceptMapElement conceptMapElement0 = new ConceptMapElement();
        conceptMapElement0.getCodeSystem();
    }
}
