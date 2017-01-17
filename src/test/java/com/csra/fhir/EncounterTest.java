/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:11:22 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class EncounterTest {

    @Test
    public void test00() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = new Reference();
        encounter0.setPatient(reference0);
        Reference reference1 = encounter0.getPartOf();
        assertNull(reference1);
    }

    @Test
    public void test01() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = new Reference();
        encounter0.appointment = reference0;
        Reference reference1 = encounter0.getPartOf();
        assertNull(reference1);
    }

    @Test
    public void test02() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = new Reference();
        encounter0.serviceProvider = reference0;
        Reference reference1 = encounter0.getServiceProvider();
        assertSame(reference1, reference0);
    }

    @Test
    public void test03() throws Throwable {
        Encounter encounter0 = new Encounter();
        LinkedList<EncounterLocation> linkedList0 = new LinkedList<EncounterLocation>();
        encounter0.location = (java.util.List<EncounterLocation>) linkedList0;
        linkedList0.push((EncounterLocation) null);
        java.util.List<EncounterLocation> list0 = encounter0.getLocation();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test04() throws Throwable {
        Encounter encounter0 = new Encounter();
        Duration duration0 = new Duration();
        encounter0.length = duration0;
        Duration duration1 = encounter0.getLength();
        assertSame(duration1, duration0);
    }

    @Test
    public void test05() throws Throwable {
        Encounter encounter0 = new Encounter();
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        encounter0.hospitalization = encounterHospitalization0;
        EncounterHospitalization encounterHospitalization1 = encounter0.getHospitalization();
        assertNull(encounterHospitalization1.getId());
    }

    @Test
    public void test06() throws Throwable {
        Encounter encounter0 = new Encounter();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        Reference reference0 = new Reference();
        linkedList0.add(reference0);
        encounter0.episodeOfCare = (java.util.List<Reference>) linkedList0;
        java.util.List<Reference> list0 = encounter0.getEpisodeOfCare();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test07() throws Throwable {
        Encounter encounter0 = new Encounter();
        EncounterClass encounterClass0 = new EncounterClass();
        encounter0.clazz = encounterClass0;
        EncounterClass encounterClass1 = encounter0.getClazz();
        assertNull(encounterClass1.getValue());
    }

    @Test
    public void test08() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = new Reference();
        encounter0.appointment = reference0;
        Reference reference1 = encounter0.getAppointment();
        assertNull(reference1.getId());
    }

    @Test
    public void test09() throws Throwable {
        Encounter encounter0 = new Encounter();
        java.util.List<EncounterLocation> list0 = encounter0.getLocation();
        assertEquals(0, list0.size());
    }

    @Test
    public void test10() throws Throwable {
        Encounter encounter0 = new Encounter();
        java.util.List<Reference> list0 = encounter0.getIndication();
        java.util.List<Reference> list1 = encounter0.getIndication();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test11() throws Throwable {
        Encounter encounter0 = new Encounter();
        java.util.List<CodeableConcept> list0 = encounter0.getReason();
        java.util.List<CodeableConcept> list1 = encounter0.getReason();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test12() throws Throwable {
        Encounter encounter0 = new Encounter();
        java.util.List<EncounterParticipant> list0 = encounter0.getParticipant();
        java.util.List<EncounterParticipant> list1 = encounter0.getParticipant();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test13() throws Throwable {
        Encounter encounter0 = new Encounter();
        java.util.List<Reference> list0 = encounter0.getIncomingReferral();
        java.util.List<Reference> list1 = encounter0.getIncomingReferral();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test14() throws Throwable {
        Encounter encounter0 = new Encounter();
        java.util.List<Reference> list0 = encounter0.getEpisodeOfCare();
        assertEquals(0, list0.size());
    }

    @Test
    public void test15() throws Throwable {
        Encounter encounter0 = new Encounter();
        java.util.List<CodeableConcept> list0 = encounter0.getType();
        java.util.List<CodeableConcept> list1 = encounter0.getType();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test16() throws Throwable {
        Encounter encounter0 = new Encounter();
        java.util.List<EncounterStatusHistory> list0 = encounter0.getStatusHistory();
        java.util.List<EncounterStatusHistory> list1 = encounter0.getStatusHistory();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test17() throws Throwable {
        Encounter encounter0 = new Encounter();
        java.util.List<Identifier> list0 = encounter0.getIdentifier();
        java.util.List<Identifier> list1 = encounter0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test18() throws Throwable {
        Encounter encounter0 = new Encounter();
        Duration duration0 = encounter0.getLength();
        assertNull(duration0);
    }

    @Test
    public void test19() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = new Reference();
        encounter0.setPatient(reference0);
        Reference reference1 = encounter0.getPatient();
        assertNull(reference1.getId());
    }

    @Test
    public void test20() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = encounter0.getServiceProvider();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        Encounter encounter0 = new Encounter();
        Period period0 = encounter0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test22() throws Throwable {
        Encounter encounter0 = new Encounter();
        Period period0 = new Period();
        encounter0.setPeriod(period0);
        Period period1 = encounter0.getPeriod();
        assertSame(period1, period0);
    }

    @Test
    public void test23() throws Throwable {
        Encounter encounter0 = new Encounter();
        EncounterHospitalization encounterHospitalization0 = encounter0.getHospitalization();
        assertNull(encounterHospitalization0);
    }

    @Test
    public void test24() throws Throwable {
        Encounter encounter0 = new Encounter();
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        encounter0.setHospitalization(encounterHospitalization0);
        assertNull(encounterHospitalization0.getId());
    }

    @Test
    public void test25() throws Throwable {
        Encounter encounter0 = new Encounter();
        EncounterClass encounterClass0 = new EncounterClass();
        encounter0.setClazz(encounterClass0);
        assertNull(encounterClass0.getValue());
    }

    @Test
    public void test26() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = new Reference();
        encounter0.setPartOf(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test27() throws Throwable {
        Encounter encounter0 = new Encounter();
        Duration duration0 = new Duration();
        encounter0.setLength(duration0);
        assertNull(duration0.getId());
    }

    @Test
    public void test28() throws Throwable {
        Encounter encounter0 = new Encounter();
        EncounterClass encounterClass0 = encounter0.getClazz();
        assertNull(encounterClass0);
    }

    @Test
    public void test29() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = new Reference();
        encounter0.setServiceProvider(reference0);
        Reference reference1 = encounter0.getPartOf();
        assertNull(reference1);
    }

    @Test
    public void test30() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = new Reference();
        encounter0.setAppointment(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test31() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = encounter0.getAppointment();
        assertNull(reference0);
    }

    @Test
    public void test32() throws Throwable {
        Encounter encounter0 = new Encounter();
        EncounterState encounterState0 = encounter0.getStatus();
        assertNull(encounterState0);
    }

    @Test
    public void test33() throws Throwable {
        Encounter encounter0 = new Encounter();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        encounter0.setPriority(codeableConcept0);
        CodeableConcept codeableConcept1 = encounter0.getPriority();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test34() throws Throwable {
        Encounter encounter0 = new Encounter();
        Reference reference0 = encounter0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test35() throws Throwable {
        Encounter encounter0 = new Encounter();
        EncounterState encounterState0 = new EncounterState();
        encounter0.setStatus(encounterState0);
        EncounterState encounterState1 = encounter0.getStatus();
        assertNull(encounterState1.getId());
    }

    @Test
    public void test36() throws Throwable {
        Encounter encounter0 = new Encounter();
        CodeableConcept codeableConcept0 = encounter0.getPriority();
        assertNull(codeableConcept0);
    }
}
