/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:43:03 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AppointmentTest {

    @Test
    public void test00() throws Throwable {
        Appointment appointment0 = new Appointment();
        java.util.List<AppointmentParticipant> list0 = appointment0.getParticipant();
        java.util.List<AppointmentParticipant> list1 = appointment0.getParticipant();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        Appointment appointment0 = new Appointment();
        java.util.List<Reference> list0 = appointment0.getSlot();
        java.util.List<Reference> list1 = appointment0.getSlot();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        Appointment appointment0 = new Appointment();
        java.util.List<Identifier> list0 = appointment0.getIdentifier();
        java.util.List<Identifier> list1 = appointment0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        Appointment appointment0 = new Appointment();
        appointment0.setMinutesDuration((PositiveInt) null);
    }

    @Test
    public void test04() throws Throwable {
        Appointment appointment0 = new Appointment();
        PositiveInt positiveInt0 = appointment0.getMinutesDuration();
        assertNull(positiveInt0);
    }

    @Test
    public void test05() throws Throwable {
        Appointment appointment0 = new Appointment();
        appointment0.setComment((String) null);
    }

    @Test
    public void test06() throws Throwable {
        Appointment appointment0 = new Appointment();
        appointment0.setEnd((Instant) null);
    }

    @Test
    public void test07() throws Throwable {
        Appointment appointment0 = new Appointment();
        appointment0.setStart((Instant) null);
    }

    @Test
    public void test08() throws Throwable {
        Appointment appointment0 = new Appointment();
        Instant instant0 = appointment0.getEnd();
        assertNull(instant0);
    }

    @Test
    public void test09() throws Throwable {
        Appointment appointment0 = new Appointment();
        appointment0.setDescription((String) null);
    }

    @Test
    public void test10() throws Throwable {
        Appointment appointment0 = new Appointment();
        UnsignedInt unsignedInt0 = appointment0.getPriority();
        assertNull(unsignedInt0);
    }

    @Test
    public void test11() throws Throwable {
        Appointment appointment0 = new Appointment();
        CodeableConcept codeableConcept0 = appointment0.getReason();
        assertNull(codeableConcept0);
    }

    @Test
    public void test12() throws Throwable {
        Appointment appointment0 = new Appointment();
        String string0 = appointment0.getComment();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        Appointment appointment0 = new Appointment();
        Instant instant0 = appointment0.getStart();
        assertNull(instant0);
    }

    @Test
    public void test14() throws Throwable {
        Appointment appointment0 = new Appointment();
        appointment0.setType((CodeableConcept) null);
    }

    @Test
    public void test15() throws Throwable {
        Appointment appointment0 = new Appointment();
        AppointmentStatus appointmentStatus0 = appointment0.getStatus();
        assertNull(appointmentStatus0);
    }

    @Test
    public void test16() throws Throwable {
        Appointment appointment0 = new Appointment();
        CodeableConcept codeableConcept0 = appointment0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test17() throws Throwable {
        Appointment appointment0 = new Appointment();
        appointment0.setStatus((AppointmentStatus) null);
    }

    @Test
    public void test18() throws Throwable {
        Appointment appointment0 = new Appointment();
        String string0 = appointment0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test19() throws Throwable {
        Appointment appointment0 = new Appointment();
        appointment0.setPriority((UnsignedInt) null);
    }

    @Test
    public void test20() throws Throwable {
        Appointment appointment0 = new Appointment();
        appointment0.setReason((CodeableConcept) null);
    }
}
