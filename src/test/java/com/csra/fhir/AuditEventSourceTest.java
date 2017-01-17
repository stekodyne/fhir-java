/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:54:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AuditEventSourceTest {

    @Test
    public void test0() throws Throwable {
        AuditEventSource auditEventSource0 = new AuditEventSource();
        java.util.List<Coding> list0 = auditEventSource0.getType();
        java.util.List<Coding> list1 = auditEventSource0.getType();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        AuditEventSource auditEventSource0 = new AuditEventSource();
        auditEventSource0.setIdentifier((Identifier) null);
        assertNull(auditEventSource0.getId());
    }

    @Test
    public void test2() throws Throwable {
        AuditEventSource auditEventSource0 = new AuditEventSource();
        auditEventSource0.setSite((String) null);
        assertNull(auditEventSource0.getId());
    }

    @Test
    public void test3() throws Throwable {
        AuditEventSource auditEventSource0 = new AuditEventSource();
        String string0 = auditEventSource0.getSite();
        assertNull(string0);
    }

    @Test
    public void test4() throws Throwable {
        AuditEventSource auditEventSource0 = new AuditEventSource();
        auditEventSource0.getIdentifier();
    }
}
