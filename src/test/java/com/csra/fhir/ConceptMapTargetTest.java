/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:58:23 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConceptMapTargetTest {

    @Test
    public void test0() throws Throwable {
        ConceptMapTarget conceptMapTarget0 = new ConceptMapTarget();
        java.util.List<ConceptMapDependsOn> list0 = conceptMapTarget0.getProduct();
        java.util.List<ConceptMapDependsOn> list1 = conceptMapTarget0.getProduct();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ConceptMapTarget conceptMapTarget0 = new ConceptMapTarget();
        java.util.List<ConceptMapDependsOn> list0 = conceptMapTarget0.getDependsOn();
        java.util.List<ConceptMapDependsOn> list1 = conceptMapTarget0.getDependsOn();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        ConceptMapTarget conceptMapTarget0 = new ConceptMapTarget();
        String string0 = conceptMapTarget0.getComments();
        assertNull(string0);
    }

    @Test
    public void test3() throws Throwable {
        ConceptMapTarget conceptMapTarget0 = new ConceptMapTarget();
        Code code0 = conceptMapTarget0.getCode();
        assertNull(code0);
    }

    @Test
    public void test4() throws Throwable {
        ConceptMapTarget conceptMapTarget0 = new ConceptMapTarget();
        conceptMapTarget0.setEquivalence((Code) null);
        assertNull(conceptMapTarget0.getId());
    }

    @Test
    public void test5() throws Throwable {
        ConceptMapTarget conceptMapTarget0 = new ConceptMapTarget();
        Code code0 = conceptMapTarget0.getEquivalence();
        assertNull(code0);
    }

    @Test
    public void test6() throws Throwable {
        ConceptMapTarget conceptMapTarget0 = new ConceptMapTarget();
        conceptMapTarget0.setCode((Code) null);
        assertNull(conceptMapTarget0.getId());
    }

    @Test
    public void test7() throws Throwable {
        ConceptMapTarget conceptMapTarget0 = new ConceptMapTarget();
        conceptMapTarget0.setCodeSystem((Uri) null);
        assertNull(conceptMapTarget0.getId());
    }

    @Test
    public void test8() throws Throwable {
        ConceptMapTarget conceptMapTarget0 = new ConceptMapTarget();
        conceptMapTarget0.setComments((String) null);
        assertNull(conceptMapTarget0.getId());
    }

    @Test
    public void test9() throws Throwable {
        ConceptMapTarget conceptMapTarget0 = new ConceptMapTarget();
        Uri uri0 = conceptMapTarget0.getCodeSystem();
        assertNull(uri0);
    }
}
