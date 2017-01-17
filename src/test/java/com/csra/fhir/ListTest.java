/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:51:16 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ListTest {

    @Test
    public void test00() throws Throwable {
        List list0 = new List();
        java.util.List<ListEntry> list1 = list0.getEntry();
        java.util.List<ListEntry> list2 = list0.getEntry();
        assertSame(list2, list1);
        assertNotNull(list2);
    }

    @Test
    public void test01() throws Throwable {
        List list0 = new List();
        java.util.List<Identifier> list1 = list0.getIdentifier();
        java.util.List<Identifier> list2 = list0.getIdentifier();
        assertSame(list2, list1);
        assertNotNull(list2);
    }

    @Test
    public void test02() throws Throwable {
        List list0 = new List();
        ListStatus listStatus0 = list0.getStatus();
        assertNull(listStatus0);
    }

    @Test
    public void test03() throws Throwable {
        List list0 = new List();
        list0.setMode((ListMode) null);
    }

    @Test
    public void test04() throws Throwable {
        List list0 = new List();
        CodeableConcept codeableConcept0 = list0.getEmptyReason();
        assertNull(codeableConcept0);
    }

    @Test
    public void test05() throws Throwable {
        List list0 = new List();
        list0.setTitle((String) null);
    }

    @Test
    public void test06() throws Throwable {
        List list0 = new List();
        list0.setSubject((Reference) null);
    }

    @Test
    public void test07() throws Throwable {
        List list0 = new List();
        ListMode listMode0 = list0.getMode();
        assertNull(listMode0);
    }

    @Test
    public void test08() throws Throwable {
        List list0 = new List();
        list0.setSource((Reference) null);
    }

    @Test
    public void test09() throws Throwable {
        List list0 = new List();
        Reference reference0 = list0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test10() throws Throwable {
        List list0 = new List();
        list0.setEncounter((Reference) null);
    }

    @Test
    public void test11() throws Throwable {
        List list0 = new List();
        Reference reference0 = list0.getSource();
        assertNull(reference0);
    }

    @Test
    public void test12() throws Throwable {
        List list0 = new List();
        list0.setOrderedBy((CodeableConcept) null);
    }

    @Test
    public void test13() throws Throwable {
        List list0 = new List();
        String string0 = list0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test14() throws Throwable {
        List list0 = new List();
        list0.setCode((CodeableConcept) null);
    }

    @Test
    public void test15() throws Throwable {
        List list0 = new List();
        list0.setNote((String) null);
    }

    @Test
    public void test16() throws Throwable {
        List list0 = new List();
        String string0 = list0.getNote();
        assertNull(string0);
    }

    @Test
    public void test17() throws Throwable {
        List list0 = new List();
        CodeableConcept codeableConcept0 = list0.getOrderedBy();
        assertNull(codeableConcept0);
    }

    @Test
    public void test18() throws Throwable {
        List list0 = new List();
        Reference reference0 = list0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test19() throws Throwable {
        List list0 = new List();
        CodeableConcept codeableConcept0 = list0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test20() throws Throwable {
        List list0 = new List();
        list0.setEmptyReason((CodeableConcept) null);
    }

    @Test
    public void test21() throws Throwable {
        List list0 = new List();
        DateTime dateTime0 = list0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test22() throws Throwable {
        List list0 = new List();
        list0.setDate((DateTime) null);
    }

    @Test
    public void test23() throws Throwable {
        List list0 = new List();
        list0.setStatus((ListStatus) null);
    }
}
