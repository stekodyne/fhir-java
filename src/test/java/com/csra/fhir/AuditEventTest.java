/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:42:54 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AuditEventTest {

    @Test
    public void test0() throws Throwable {
        AuditEvent auditEvent0 = new AuditEvent();
        java.util.List<AuditEventObject> list0 = auditEvent0.getObject();
        java.util.List<AuditEventObject> list1 = auditEvent0.getObject();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        AuditEvent auditEvent0 = new AuditEvent();
        java.util.List<AuditEventParticipant> list0 = auditEvent0.getParticipant();
        java.util.List<AuditEventParticipant> list1 = auditEvent0.getParticipant();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        AuditEvent auditEvent0 = new AuditEvent();
        auditEvent0.setSource((AuditEventSource) null);
    }

    @Test
    public void test3() throws Throwable {
        AuditEvent auditEvent0 = new AuditEvent();
        auditEvent0.setEvent((AuditEventEvent) null);
    }

    @Test
    public void test4() throws Throwable {
        AuditEvent auditEvent0 = new AuditEvent();
        AuditEventEvent auditEventEvent0 = auditEvent0.getEvent();
        assertNull(auditEventEvent0);
    }

    @Test
    public void test5() throws Throwable {
        AuditEvent auditEvent0 = new AuditEvent();
        auditEvent0.getSource();
    }
}
