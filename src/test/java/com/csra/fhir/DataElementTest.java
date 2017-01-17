/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:42:49 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class DataElementTest {

    @Test
    public void test00() throws Throwable {
        DataElement dataElement0 = new DataElement();
        String string0 = new String();
        dataElement0.name = string0;
        String string1 = dataElement0.getCopyright();
        assertNull(string1);
    }

    @Test
    public void test01() throws Throwable {
        DataElement dataElement0 = new DataElement();
        String string0 = new String();
        dataElement0.setName(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test02() throws Throwable {
        DataElement dataElement0 = new DataElement();
        String string0 = new String();
        dataElement0.setVersion(string0);
        String string1 = dataElement0.getName();
        assertNull(string1);
    }

    @Test
    public void test03() throws Throwable {
        DataElement dataElement0 = new DataElement();
        Uri uri0 = new Uri();
        dataElement0.setUrl(uri0);
        Uri uri1 = dataElement0.getUrl();
        assertNull(uri1.getId());
    }

    @Test
    public void test04() throws Throwable {
        DataElement dataElement0 = new DataElement();
        DataElementStringency dataElementStringency0 = new DataElementStringency();
        dataElement0.setStringency(dataElementStringency0);
        DataElementStringency dataElementStringency1 = dataElement0.getStringency();
        assertSame(dataElementStringency1, dataElementStringency0);
    }

    @Test
    public void test05() throws Throwable {
        DataElement dataElement0 = new DataElement();
        DateTime dateTime0 = new DateTime();
        dataElement0.date = dateTime0;
        DateTime dateTime1 = dataElement0.getDate();
        assertNull(dateTime1.getId());
    }

    @Test
    public void test06() throws Throwable {
        DataElement dataElement0 = new DataElement();
        LinkedList<DataElementContact> linkedList0 = new LinkedList<DataElementContact>();
        DataElementContact dataElementContact0 = new DataElementContact();
        linkedList0.add(dataElementContact0);
        dataElement0.contact = (java.util.List<DataElementContact>) linkedList0;
        java.util.List<DataElementContact> list0 = dataElement0.getContact();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test07() throws Throwable {
        DataElement dataElement0 = new DataElement();
        java.util.List<ElementDefinition> list0 = dataElement0.getElement();
        java.util.List<ElementDefinition> list1 = dataElement0.getElement();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test08() throws Throwable {
        DataElement dataElement0 = new DataElement();
        java.util.List<DataElementMapping> list0 = dataElement0.getMapping();
        java.util.List<DataElementMapping> list1 = dataElement0.getMapping();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        DataElement dataElement0 = new DataElement();
        java.util.List<CodeableConcept> list0 = dataElement0.getUseContext();
        java.util.List<CodeableConcept> list1 = dataElement0.getUseContext();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test10() throws Throwable {
        DataElement dataElement0 = new DataElement();
        java.util.List<DataElementContact> list0 = dataElement0.getContact();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test11() throws Throwable {
        DataElement dataElement0 = new DataElement();
        java.util.List<Identifier> list0 = dataElement0.getIdentifier();
        java.util.List<Identifier> list1 = dataElement0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test12() throws Throwable {
        DataElement dataElement0 = new DataElement();
        String string0 = dataElement0.getPublisher();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        DataElement dataElement0 = new DataElement();
        String string0 = new String();
        dataElement0.setCopyright(string0);
        String string1 = dataElement0.getName();
        assertNull(string1);
    }

    @Test
    public void test14() throws Throwable {
        DataElement dataElement0 = new DataElement();
        DataElementStringency dataElementStringency0 = dataElement0.getStringency();
        assertNull(dataElementStringency0);
    }

    @Test
    public void test15() throws Throwable {
        DataElement dataElement0 = new DataElement();
        String string0 = new String();
        dataElement0.setPublisher(string0);
        String string1 = dataElement0.getCopyright();
        assertNull(string1);
    }

    @Test
    public void test16() throws Throwable {
        DataElement dataElement0 = new DataElement();
        Code code0 = new Code();
        dataElement0.setStatus(code0);
        Code code1 = dataElement0.getStatus();
        assertSame(code1, code0);
    }

    @Test
    public void test17() throws Throwable {
        DataElement dataElement0 = new DataElement();
        DateTime dateTime0 = new DateTime();
        dataElement0.setDate(dateTime0);
        assertNull(dateTime0.getId());
    }

    @Test
    public void test18() throws Throwable {
        DataElement dataElement0 = new DataElement();
        Boolean boolean0 = dataElement0.getExperimental();
        assertNull(boolean0);
    }

    @Test
    public void test19() throws Throwable {
        DataElement dataElement0 = new DataElement();
        Code code0 = dataElement0.getStatus();
        assertNull(code0);
    }

    @Test
    public void test20() throws Throwable {
        DataElement dataElement0 = new DataElement();
        String string0 = new String();
        dataElement0.setVersion(string0);
        String string1 = dataElement0.getVersion();
        assertSame(string1, string0);
    }

    @Test
    public void test21() throws Throwable {
        DataElement dataElement0 = new DataElement();
        DateTime dateTime0 = dataElement0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test22() throws Throwable {
        DataElement dataElement0 = new DataElement();
        Uri uri0 = dataElement0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test23() throws Throwable {
        DataElement dataElement0 = new DataElement();
        String string0 = dataElement0.getVersion();
        assertNull(string0);
    }

    @Test
    public void test24() throws Throwable {
        DataElement dataElement0 = new DataElement();
        Boolean boolean0 = new Boolean();
        dataElement0.setExperimental(boolean0);
        Boolean boolean1 = dataElement0.getExperimental();
        assertSame(boolean1, boolean0);
    }
}
