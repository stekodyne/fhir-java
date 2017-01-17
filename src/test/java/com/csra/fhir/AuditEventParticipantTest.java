/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:47:35 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AuditEventParticipantTest {

    @Test
    public void test00() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        java.util.List<Coding> list0 = auditEventParticipant0.getPurposeOfUse();
        java.util.List<Coding> list1 = auditEventParticipant0.getPurposeOfUse();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        java.util.List<Uri> list0 = auditEventParticipant0.getPolicy();
        java.util.List<Uri> list1 = auditEventParticipant0.getPolicy();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        java.util.List<CodeableConcept> list0 = auditEventParticipant0.getRole();
        java.util.List<CodeableConcept> list1 = auditEventParticipant0.getRole();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        auditEventParticipant0.setNetwork((AuditEventNetwork) null);
        assertNull(auditEventParticipant0.getId());
    }

    @Test
    public void test04() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        String string0 = auditEventParticipant0.getAltId();
        assertNull(string0);
    }

    @Test
    public void test05() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        Reference reference0 = auditEventParticipant0.getLocation();
        assertNull(reference0);
    }

    @Test
    public void test06() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        Reference reference0 = auditEventParticipant0.getReference();
        assertNull(reference0);
    }

    @Test
    public void test07() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        Coding coding0 = auditEventParticipant0.getMedia();
        assertNull(coding0);
    }

    @Test
    public void test08() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        String string0 = auditEventParticipant0.getName();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        Identifier identifier0 = auditEventParticipant0.getUserId();
        assertNull(identifier0);
    }

    @Test
    public void test10() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        Boolean boolean0 = auditEventParticipant0.getRequestor();
        assertNull(boolean0);
    }

    @Test
    public void test11() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        auditEventParticipant0.setLocation((Reference) null);
        assertNull(auditEventParticipant0.getId());
    }

    @Test
    public void test12() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        auditEventParticipant0.setAltId((String) null);
        assertNull(auditEventParticipant0.getId());
    }

    @Test
    public void test13() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        auditEventParticipant0.setMedia((Coding) null);
        assertNull(auditEventParticipant0.getId());
    }

    @Test
    public void test14() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        auditEventParticipant0.setName((String) null);
        assertNull(auditEventParticipant0.getId());
    }

    @Test
    public void test15() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        AuditEventNetwork auditEventNetwork0 = auditEventParticipant0.getNetwork();
        assertNull(auditEventNetwork0);
    }

    @Test
    public void test16() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        auditEventParticipant0.setUserId((Identifier) null);
        assertNull(auditEventParticipant0.getId());
    }

    @Test
    public void test17() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        auditEventParticipant0.setReference((Reference) null);
        assertNull(auditEventParticipant0.getId());
    }

    @Test
    public void test18() throws Throwable {
        AuditEventParticipant auditEventParticipant0 = new AuditEventParticipant();
        auditEventParticipant0.setRequestor((Boolean) null);
        assertNull(auditEventParticipant0.getId());
    }
}
