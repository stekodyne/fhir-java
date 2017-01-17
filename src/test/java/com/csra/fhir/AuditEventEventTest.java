/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:44:47 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AuditEventEventTest {

    @Test
    public void test00() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        java.util.List<Coding> list0 = auditEventEvent0.getPurposeOfEvent();
        java.util.List<Coding> list1 = auditEventEvent0.getPurposeOfEvent();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        java.util.List<Coding> list0 = auditEventEvent0.getSubtype();
        java.util.List<Coding> list1 = auditEventEvent0.getSubtype();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        Instant instant0 = auditEventEvent0.getDateTime();
        assertNull(instant0);
    }

    @Test
    public void test03() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        auditEventEvent0.setDateTime((Instant) null);
        assertNull(auditEventEvent0.getId());
    }

    @Test
    public void test04() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        auditEventEvent0.setAction((AuditEventAction) null);
        assertNull(auditEventEvent0.getId());
    }

    @Test
    public void test05() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        auditEventEvent0.setOutcomeDesc((String) null);
        assertNull(auditEventEvent0.getId());
    }

    @Test
    public void test06() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        auditEventEvent0.setOutcome((AuditEventOutcome) null);
        assertNull(auditEventEvent0.getId());
    }

    @Test
    public void test07() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        Coding coding0 = auditEventEvent0.getType();
        assertNull(coding0);
    }

    @Test
    public void test08() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        AuditEventOutcome auditEventOutcome0 = auditEventEvent0.getOutcome();
        assertNull(auditEventOutcome0);
    }

    @Test
    public void test09() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        String string0 = auditEventEvent0.getOutcomeDesc();
        assertNull(string0);
    }

    @Test
    public void test10() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        AuditEventAction auditEventAction0 = auditEventEvent0.getAction();
        assertNull(auditEventAction0);
    }

    @Test
    public void test11() throws Throwable {
        AuditEventEvent auditEventEvent0 = new AuditEventEvent();
        auditEventEvent0.setType((Coding) null);
        assertNull(auditEventEvent0.getId());
    }
}
