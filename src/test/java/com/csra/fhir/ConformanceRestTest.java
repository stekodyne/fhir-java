/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:37:22 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ConformanceRestTest {

    @Test
    public void test00() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        TransactionMode transactionMode0 = new TransactionMode();
        conformanceRest0.setTransactionMode(transactionMode0);
        assertNull(transactionMode0.getId());
    }

    @Test
    public void test01() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        TransactionMode transactionMode0 = new TransactionMode();
        conformanceRest0.transactionMode = transactionMode0;
        TransactionMode transactionMode1 = conformanceRest0.getTransactionMode();
        assertSame(transactionMode1, transactionMode0);
    }

    @Test
    public void test02() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        LinkedList<ConformanceSearchParam> linkedList0 = new LinkedList<ConformanceSearchParam>();
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        linkedList0.offerFirst(conformanceSearchParam0);
        conformanceRest0.searchParam = (java.util.List<ConformanceSearchParam>) linkedList0;
        java.util.List<ConformanceSearchParam> list0 = conformanceRest0.getSearchParam();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test03() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        LinkedList<ConformanceResource> linkedList0 = new LinkedList<ConformanceResource>();
        conformanceRest0.resource = (java.util.List<ConformanceResource>) linkedList0;
        linkedList0.offerLast((ConformanceResource) null);
        java.util.List<ConformanceResource> list0 = conformanceRest0.getResource();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test04() throws Throwable {
        RestfulConformanceMode restfulConformanceMode0 = new RestfulConformanceMode();
        ConformanceRest conformanceRest0 = new ConformanceRest();
        conformanceRest0.mode = restfulConformanceMode0;
        RestfulConformanceMode restfulConformanceMode1 = conformanceRest0.getMode();
        assertSame(restfulConformanceMode1, restfulConformanceMode0);
    }

    @Test
    public void test05() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        LinkedList<ConformanceInteraction1> linkedList0 = new LinkedList<ConformanceInteraction1>();
        ConformanceInteraction1 conformanceInteraction1_0 = new ConformanceInteraction1();
        linkedList0.add(conformanceInteraction1_0);
        conformanceRest0.interaction = (java.util.List<ConformanceInteraction1>) linkedList0;
        java.util.List<ConformanceInteraction1> list0 = conformanceRest0.getInteraction();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test06() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        String string0 = new String();
        conformanceRest0.documentation = string0;
        String string1 = conformanceRest0.getDocumentation();
        assertSame(string1, string0);
    }

    @Test
    public void test07() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        LinkedList<Uri> linkedList0 = new LinkedList<Uri>();
        linkedList0.add((Uri) null);
        conformanceRest0.compartment = (java.util.List<Uri>) linkedList0;
        java.util.List<Uri> list0 = conformanceRest0.getCompartment();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test08() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        java.util.List<Uri> list0 = conformanceRest0.getCompartment();
        java.util.List<Uri> list1 = conformanceRest0.getCompartment();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        java.util.List<ConformanceOperation> list0 = conformanceRest0.getOperation();
        java.util.List<ConformanceOperation> list1 = conformanceRest0.getOperation();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test10() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        java.util.List<ConformanceSearchParam> list0 = conformanceRest0.getSearchParam();
        assertEquals(0, list0.size());
    }

    @Test
    public void test11() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        java.util.List<ConformanceInteraction1> list0 = conformanceRest0.getInteraction();
        assertEquals(0, list0.size());
    }

    @Test
    public void test12() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        java.util.List<ConformanceResource> list0 = conformanceRest0.getResource();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test13() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        ConformanceSecurity conformanceSecurity0 = conformanceRest0.getSecurity();
        assertNull(conformanceSecurity0);
    }

    @Test
    public void test14() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        String string0 = new String();
        conformanceRest0.setDocumentation(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test15() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        RestfulConformanceMode restfulConformanceMode0 = conformanceRest0.getMode();
        assertNull(restfulConformanceMode0);
    }

    @Test
    public void test16() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        RestfulConformanceMode restfulConformanceMode0 = new RestfulConformanceMode();
        conformanceRest0.setMode(restfulConformanceMode0);
        assertNull(restfulConformanceMode0.getId());
    }

    @Test
    public void test17() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        TransactionMode transactionMode0 = conformanceRest0.getTransactionMode();
        assertNull(transactionMode0);
    }

    @Test
    public void test18() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        ConformanceSecurity conformanceSecurity0 = new ConformanceSecurity();
        conformanceRest0.setSecurity(conformanceSecurity0);
        ConformanceSecurity conformanceSecurity1 = conformanceRest0.getSecurity();
        assertSame(conformanceSecurity1, conformanceSecurity0);
    }

    @Test
    public void test19() throws Throwable {
        ConformanceRest conformanceRest0 = new ConformanceRest();
        String string0 = conformanceRest0.getDocumentation();
        assertNull(string0);
    }
}
