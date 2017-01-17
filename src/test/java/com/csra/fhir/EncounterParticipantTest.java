/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:05:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class EncounterParticipantTest {

    @Test
    public void test0() throws Throwable {
        EncounterParticipant encounterParticipant0 = new EncounterParticipant();
        java.util.List<CodeableConcept> list0 = encounterParticipant0.getType();
        java.util.List<CodeableConcept> list1 = encounterParticipant0.getType();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        EncounterParticipant encounterParticipant0 = new EncounterParticipant();
        encounterParticipant0.setPeriod((Period) null);
        assertNull(encounterParticipant0.getId());
    }

    @Test
    public void test2() throws Throwable {
        EncounterParticipant encounterParticipant0 = new EncounterParticipant();
        encounterParticipant0.setIndividual((Reference) null);
        assertNull(encounterParticipant0.getId());
    }

    @Test
    public void test3() throws Throwable {
        EncounterParticipant encounterParticipant0 = new EncounterParticipant();
        Reference reference0 = encounterParticipant0.getIndividual();
        assertNull(reference0);
    }

    @Test
    public void test4() throws Throwable {
        EncounterParticipant encounterParticipant0 = new EncounterParticipant();
        Period period0 = encounterParticipant0.getPeriod();
        assertNull(period0);
    }
}
