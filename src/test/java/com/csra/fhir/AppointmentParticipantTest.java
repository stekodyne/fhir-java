/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:12:30 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AppointmentParticipantTest {

    @Test
    public void test0() throws Throwable {
        AppointmentParticipant appointmentParticipant0 = new AppointmentParticipant();
        java.util.List<CodeableConcept> list0 = appointmentParticipant0.getType();
        java.util.List<CodeableConcept> list1 = appointmentParticipant0.getType();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        AppointmentParticipant appointmentParticipant0 = new AppointmentParticipant();
        ParticipationStatus participationStatus0 = appointmentParticipant0.getStatus();
        assertNull(participationStatus0);
    }

    @Test
    public void test2() throws Throwable {
        AppointmentParticipant appointmentParticipant0 = new AppointmentParticipant();
        appointmentParticipant0.setStatus((ParticipationStatus) null);
        assertNull(appointmentParticipant0.getId());
    }

    @Test
    public void test3() throws Throwable {
        AppointmentParticipant appointmentParticipant0 = new AppointmentParticipant();
        ParticipantRequired participantRequired0 = appointmentParticipant0.getRequired();
        assertNull(participantRequired0);
    }

    @Test
    public void test4() throws Throwable {
        AppointmentParticipant appointmentParticipant0 = new AppointmentParticipant();
        Reference reference0 = appointmentParticipant0.getActor();
        assertNull(reference0);
    }

    @Test
    public void test5() throws Throwable {
        AppointmentParticipant appointmentParticipant0 = new AppointmentParticipant();
        appointmentParticipant0.setRequired((ParticipantRequired) null);
        assertNull(appointmentParticipant0.getId());
    }

    @Test
    public void test6() throws Throwable {
        AppointmentParticipant appointmentParticipant0 = new AppointmentParticipant();
        appointmentParticipant0.setActor((Reference) null);
    }
}
