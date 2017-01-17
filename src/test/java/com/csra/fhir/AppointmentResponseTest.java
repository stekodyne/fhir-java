/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:09:11 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AppointmentResponseTest {

    @Test
    public void test00() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        java.util.List<CodeableConcept> list0 = appointmentResponse0.getParticipantType();
        java.util.List<CodeableConcept> list1 = appointmentResponse0.getParticipantType();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        java.util.List<Identifier> list0 = appointmentResponse0.getIdentifier();
        java.util.List<Identifier> list1 = appointmentResponse0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        appointmentResponse0.setStart((Instant) null);
    }

    @Test
    public void test03() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        appointmentResponse0.setParticipantStatus((ParticipantStatus) null);
    }

    @Test
    public void test04() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        Instant instant0 = appointmentResponse0.getEnd();
        assertNull(instant0);
    }

    @Test
    public void test05() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        appointmentResponse0.setComment((String) null);
    }

    @Test
    public void test06() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        Reference reference0 = appointmentResponse0.getActor();
        assertNull(reference0);
    }

    @Test
    public void test07() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        appointmentResponse0.setActor((Reference) null);
    }

    @Test
    public void test08() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        String string0 = appointmentResponse0.getComment();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        appointmentResponse0.setAppointment((Reference) null);
    }

    @Test
    public void test10() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        ParticipantStatus participantStatus0 = appointmentResponse0.getParticipantStatus();
        assertNull(participantStatus0);
    }

    @Test
    public void test11() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        appointmentResponse0.setEnd((Instant) null);
    }

    @Test
    public void test12() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        Instant instant0 = appointmentResponse0.getStart();
        assertNull(instant0);
    }

    @Test
    public void test13() throws Throwable {
        AppointmentResponse appointmentResponse0 = new AppointmentResponse();
        Reference reference0 = appointmentResponse0.getAppointment();
        assertNull(reference0);
    }
}
