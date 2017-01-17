/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:34:51 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ConformanceTest {

    @Test
    public void test00() throws Throwable {
        Conformance conformance0 = new Conformance();
        UnknownContentCode unknownContentCode0 = new UnknownContentCode();
        conformance0.setAcceptUnknown(unknownContentCode0);
        assertNull(unknownContentCode0.getId());
    }

    @Test
    public void test01() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.version = string0;
        String string1 = conformance0.getCopyright();
        assertNull(string1);
    }

    @Test
    public void test02() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.setDescription(string0);
        String string1 = conformance0.getCopyright();
        assertNull(string1);
    }

    @Test
    public void test03() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.version = string0;
        String string1 = conformance0.getRequirements();
        assertNull(string1);
    }

    @Test
    public void test04() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.setDescription(string0);
        String string1 = conformance0.getRequirements();
        assertNull(string1);
    }

    @Test
    public void test05() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.version = string0;
        String string1 = conformance0.getPublisher();
        assertNull(string1);
    }

    @Test
    public void test06() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.setDescription(string0);
        String string1 = conformance0.getPublisher();
        assertNull(string1);
    }

    @Test
    public void test07() throws Throwable {
        Conformance conformance0 = new Conformance();
        Code code0 = new Code();
        conformance0.setLanguage(code0);
        Code code1 = conformance0.getStatus();
        assertNull(code1);
    }

    @Test
    public void test08() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.version = string0;
        String string1 = conformance0.getName();
        assertNull(string1);
    }

    @Test
    public void test09() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.setDescription(string0);
        String string1 = conformance0.getName();
        assertNull(string1);
    }

    @Test
    public void test10() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.version = string0;
        String string1 = conformance0.getVersion();
        assertNull(string1.getValue());
    }

    @Test
    public void test11() throws Throwable {
        Conformance conformance0 = new Conformance();
        ConformanceSoftware conformanceSoftware0 = new ConformanceSoftware();
        conformance0.setSoftware(conformanceSoftware0);
        ConformanceSoftware conformanceSoftware1 = conformance0.getSoftware();
        assertNull(conformanceSoftware1.getId());
    }

    @Test
    public void test12() throws Throwable {
        Conformance conformance0 = new Conformance();
        LinkedList<ConformanceRest> linkedList0 = new LinkedList<ConformanceRest>();
        conformance0.rest = (java.util.List<ConformanceRest>) linkedList0;
        ConformanceRest conformanceRest0 = new ConformanceRest();
        linkedList0.add(conformanceRest0);
        java.util.List<ConformanceRest> list0 = conformance0.getRest();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test13() throws Throwable {
        Conformance conformance0 = new Conformance();
        ConformanceStatementKind conformanceStatementKind0 = new ConformanceStatementKind();
        conformance0.kind = conformanceStatementKind0;
        ConformanceStatementKind conformanceStatementKind1 = conformance0.getKind();
        assertNull(conformanceStatementKind1.getValue());
    }

    @Test
    public void test14() throws Throwable {
        Conformance conformance0 = new Conformance();
        Boolean boolean0 = new Boolean();
        conformance0.experimental = boolean0;
        Boolean boolean1 = conformance0.getExperimental();
        assertSame(boolean1, boolean0);
    }

    @Test
    public void test15() throws Throwable {
        Conformance conformance0 = new Conformance();
        LinkedList<ConformanceDocument> linkedList0 = new LinkedList<ConformanceDocument>();
        ConformanceDocument conformanceDocument0 = new ConformanceDocument();
        linkedList0.add(conformanceDocument0);
        conformance0.document = (java.util.List<ConformanceDocument>) linkedList0;
        java.util.List<ConformanceDocument> list0 = conformance0.getDocument();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test16() throws Throwable {
        Conformance conformance0 = new Conformance();
        UnknownContentCode unknownContentCode0 = new UnknownContentCode();
        conformance0.acceptUnknown = unknownContentCode0;
        UnknownContentCode unknownContentCode1 = conformance0.getAcceptUnknown();
        assertNull(unknownContentCode1.getId());
    }

    @Test
    public void test17() throws Throwable {
        Conformance conformance0 = new Conformance();
        java.util.List<ConformanceDocument> list0 = conformance0.getDocument();
        java.util.List<ConformanceDocument> list1 = conformance0.getDocument();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test18() throws Throwable {
        Conformance conformance0 = new Conformance();
        java.util.List<ConformanceMessaging> list0 = conformance0.getMessaging();
        java.util.List<ConformanceMessaging> list1 = conformance0.getMessaging();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test19() throws Throwable {
        Conformance conformance0 = new Conformance();
        java.util.List<ConformanceRest> list0 = conformance0.getRest();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test20() throws Throwable {
        Conformance conformance0 = new Conformance();
        java.util.List<Reference> list0 = conformance0.getProfile();
        java.util.List<Reference> list1 = conformance0.getProfile();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test21() throws Throwable {
        Conformance conformance0 = new Conformance();
        java.util.List<Code> list0 = conformance0.getFormat();
        java.util.List<Code> list1 = conformance0.getFormat();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test22() throws Throwable {
        Conformance conformance0 = new Conformance();
        java.util.List<ConformanceContact> list0 = conformance0.getContact();
        java.util.List<ConformanceContact> list1 = conformance0.getContact();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test23() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.setVersion(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test24() throws Throwable {
        Conformance conformance0 = new Conformance();
        Boolean boolean0 = conformance0.getExperimental();
        assertNull(boolean0);
    }

    @Test
    public void test25() throws Throwable {
        Conformance conformance0 = new Conformance();
        ConformanceStatementKind conformanceStatementKind0 = new ConformanceStatementKind();
        conformance0.setKind(conformanceStatementKind0);
        assertNull(conformanceStatementKind0.getId());
    }

    @Test
    public void test26() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.setRequirements(string0);
        String string1 = conformance0.getName();
        assertNull(string1);
    }

    @Test
    public void test27() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.setPublisher(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test28() throws Throwable {
        Conformance conformance0 = new Conformance();
        Id id0 = conformance0.getFhirVersion();
        assertNull(id0);
    }

    @Test
    public void test29() throws Throwable {
        Conformance conformance0 = new Conformance();
        DateTime dateTime0 = conformance0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test30() throws Throwable {
        Conformance conformance0 = new Conformance();
        Uri uri0 = new Uri();
        conformance0.setUrl(uri0);
        Uri uri1 = conformance0.getUrl();
        assertSame(uri1, uri0);
    }

    @Test
    public void test31() throws Throwable {
        Conformance conformance0 = new Conformance();
        ConformanceStatementKind conformanceStatementKind0 = conformance0.getKind();
        assertNull(conformanceStatementKind0);
    }

    @Test
    public void test32() throws Throwable {
        Conformance conformance0 = new Conformance();
        Id id0 = new Id();
        conformance0.setFhirVersion(id0);
        Id id1 = conformance0.getFhirVersion();
        assertNull(id1.getValue());
    }

    @Test
    public void test33() throws Throwable {
        Conformance conformance0 = new Conformance();
        DateTime dateTime0 = new DateTime();
        conformance0.setDate(dateTime0);
        DateTime dateTime1 = conformance0.getDate();
        assertSame(dateTime1, dateTime0);
    }

    @Test
    public void test34() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = conformance0.getVersion();
        assertNull(string0);
    }

    @Test
    public void test35() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.setDescription(string0);
        String string1 = conformance0.getDescription();
        assertSame(string1, string0);
    }

    @Test
    public void test36() throws Throwable {
        Conformance conformance0 = new Conformance();
        Boolean boolean0 = new Boolean();
        conformance0.setExperimental(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test37() throws Throwable {
        Conformance conformance0 = new Conformance();
        Code code0 = new Code();
        conformance0.setStatus(code0);
        assertNull(code0.getId());
    }

    @Test
    public void test38() throws Throwable {
        Conformance conformance0 = new Conformance();
        Uri uri0 = conformance0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test39() throws Throwable {
        Conformance conformance0 = new Conformance();
        ConformanceImplementation conformanceImplementation0 = conformance0.getImplementation();
        assertNull(conformanceImplementation0);
    }

    @Test
    public void test40() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.setName(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test41() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = conformance0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test42() throws Throwable {
        Conformance conformance0 = new Conformance();
        String string0 = new String();
        conformance0.setCopyright(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test43() throws Throwable {
        Conformance conformance0 = new Conformance();
        UnknownContentCode unknownContentCode0 = conformance0.getAcceptUnknown();
        assertNull(unknownContentCode0);
    }

    @Test
    public void test44() throws Throwable {
        Conformance conformance0 = new Conformance();
        ConformanceSoftware conformanceSoftware0 = conformance0.getSoftware();
        assertNull(conformanceSoftware0);
    }

    @Test
    public void test45() throws Throwable {
        Conformance conformance0 = new Conformance();
        ConformanceImplementation conformanceImplementation0 = new ConformanceImplementation();
        conformance0.setImplementation(conformanceImplementation0);
        ConformanceImplementation conformanceImplementation1 = conformance0.getImplementation();
        assertSame(conformanceImplementation1, conformanceImplementation0);
    }
}
