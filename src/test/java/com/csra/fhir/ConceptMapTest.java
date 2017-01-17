/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:50:01 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConceptMapTest {

    @Test
    public void test00() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        java.util.List<ConceptMapElement> list0 = conceptMap0.getElement();
        java.util.List<ConceptMapElement> list1 = conceptMap0.getElement();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        java.util.List<CodeableConcept> list0 = conceptMap0.getUseContext();
        java.util.List<CodeableConcept> list1 = conceptMap0.getUseContext();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        java.util.List<ConceptMapContact> list0 = conceptMap0.getContact();
        java.util.List<ConceptMapContact> list1 = conceptMap0.getContact();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setTargetUriOrTargetReference((Element) null);
    }

    @Test
    public void test04() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setRequirements((String) null);
    }

    @Test
    public void test05() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setIdentifier((Identifier) null);
    }

    @Test
    public void test06() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        String string0 = conceptMap0.getName();
        assertNull(string0);
    }

    @Test
    public void test07() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        Identifier identifier0 = conceptMap0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test08() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        String string0 = conceptMap0.getPublisher();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        Boolean boolean0 = conceptMap0.getExperimental();
        assertNull(boolean0);
    }

    @Test
    public void test10() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setStatus((Code) null);
    }

    @Test
    public void test11() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setSourceUriOrSourceReference((Element) null);
    }

    @Test
    public void test12() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        String string0 = conceptMap0.getCopyright();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        Uri uri0 = conceptMap0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test14() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setUrl((Uri) null);
    }

    @Test
    public void test15() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        DateTime dateTime0 = conceptMap0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test16() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setDate((DateTime) null);
    }

    @Test
    public void test17() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setVersion((String) null);
    }

    @Test
    public void test18() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setName((String) null);
    }

    @Test
    public void test19() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setExperimental((Boolean) null);
    }

    @Test
    public void test20() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setCopyright((String) null);
    }

    @Test
    public void test21() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        String string0 = conceptMap0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test22() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setDescription((String) null);
    }

    @Test
    public void test23() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        String string0 = conceptMap0.getRequirements();
        assertNull(string0);
    }

    @Test
    public void test24() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        String string0 = conceptMap0.getVersion();
        assertNull(string0);
    }

    @Test
    public void test25() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        conceptMap0.setPublisher((String) null);
    }

    @Test
    public void test26() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        Element element0 = conceptMap0.getSourceUriOrSourceReference();
        assertNull(element0);
    }

    @Test
    public void test27() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        Code code0 = conceptMap0.getStatus();
        assertNull(code0);
    }

    @Test
    public void test28() throws Throwable {
        ConceptMap conceptMap0 = new ConceptMap();
        Element element0 = conceptMap0.getTargetUriOrTargetReference();
        assertNull(element0);
    }
}
