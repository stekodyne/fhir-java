/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:42:28 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AuditEventObjectTest {

    @Test
    public void test00() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        java.util.List<AuditEventDetail> list0 = auditEventObject0.getDetail();
        java.util.List<AuditEventDetail> list1 = auditEventObject0.getDetail();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        java.util.List<Coding> list0 = auditEventObject0.getSecurityLabel();
        java.util.List<Coding> list1 = auditEventObject0.getSecurityLabel();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        String string0 = auditEventObject0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test03() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        String string0 = auditEventObject0.getName();
        assertNull(string0);
    }

    @Test
    public void test04() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        Coding coding0 = auditEventObject0.getType();
        assertNull(coding0);
    }

    @Test
    public void test05() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        auditEventObject0.setType((Coding) null);
        assertNull(auditEventObject0.getId());
    }

    @Test
    public void test06() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        Base64Binary base64Binary0 = auditEventObject0.getQuery();
        assertNull(base64Binary0);
    }

    @Test
    public void test07() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        auditEventObject0.setDescription((String) null);
        assertNull(auditEventObject0.getId());
    }

    @Test
    public void test08() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        auditEventObject0.setIdentifier((Identifier) null);
        assertNull(auditEventObject0.getId());
    }

    @Test
    public void test09() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        auditEventObject0.setQuery((Base64Binary) null);
        assertNull(auditEventObject0.getId());
    }

    @Test
    public void test10() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        Identifier identifier0 = auditEventObject0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test11() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        auditEventObject0.setLifecycle((Coding) null);
        assertNull(auditEventObject0.getId());
    }

    @Test
    public void test12() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        Coding coding0 = auditEventObject0.getLifecycle();
        assertNull(coding0);
    }

    @Test
    public void test13() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        auditEventObject0.setReference((Reference) null);
        assertNull(auditEventObject0.getId());
    }

    @Test
    public void test14() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        Reference reference0 = auditEventObject0.getReference();
        assertNull(reference0);
    }

    @Test
    public void test15() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        auditEventObject0.setRole((Coding) null);
        assertNull(auditEventObject0.getId());
    }

    @Test
    public void test16() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        auditEventObject0.setName((String) null);
        assertNull(auditEventObject0.getId());
    }

    @Test
    public void test17() throws Throwable {
        AuditEventObject auditEventObject0 = new AuditEventObject();
        Coding coding0 = auditEventObject0.getRole();
        assertNull(coding0);
    }
}
