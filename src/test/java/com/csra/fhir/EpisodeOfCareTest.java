/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:33:49 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class EpisodeOfCareTest {

    @Test
    public void test00() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        EpisodeOfCareStatus episodeOfCareStatus0 = new EpisodeOfCareStatus();
        episodeOfCare0.setStatus(episodeOfCareStatus0);
        assertNull(episodeOfCareStatus0.getValue());
    }

    @Test
    public void test01() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        EpisodeOfCareStatus episodeOfCareStatus0 = new EpisodeOfCareStatus();
        episodeOfCare0.status = episodeOfCareStatus0;
        EpisodeOfCareStatus episodeOfCareStatus1 = episodeOfCare0.getStatus();
        assertSame(episodeOfCareStatus1, episodeOfCareStatus0);
    }

    @Test
    public void test02() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        episodeOfCare0.referralRequest = (java.util.List<Reference>) linkedList0;
        linkedList0.add((Reference) null);
        java.util.List<Reference> list0 = episodeOfCare0.getReferralRequest();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test03() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        Reference reference0 = new Reference();
        episodeOfCare0.setPatient(reference0);
        Reference reference1 = episodeOfCare0.getPatient();
        assertNull(reference1.getId());
    }

    @Test
    public void test04() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        LinkedList<Identifier> linkedList0 = new LinkedList<Identifier>();
        Identifier identifier0 = new Identifier();
        linkedList0.add(identifier0);
        episodeOfCare0.identifier = (java.util.List<Identifier>) linkedList0;
        java.util.List<Identifier> list0 = episodeOfCare0.getIdentifier();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test05() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        LinkedList<EpisodeOfCareCareTeam> linkedList0 = new LinkedList<EpisodeOfCareCareTeam>();
        episodeOfCare0.careTeam = (java.util.List<EpisodeOfCareCareTeam>) linkedList0;
        linkedList0.add((EpisodeOfCareCareTeam) null);
        java.util.List<EpisodeOfCareCareTeam> list0 = episodeOfCare0.getCareTeam();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test06() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        Reference reference0 = new Reference();
        episodeOfCare0.setCareManager(reference0);
        Reference reference1 = episodeOfCare0.getCareManager();
        assertSame(reference1, reference0);
    }

    @Test
    public void test07() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        java.util.List<EpisodeOfCareCareTeam> list0 = episodeOfCare0.getCareTeam();
        assertEquals(0, list0.size());
    }

    @Test
    public void test08() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        java.util.List<Reference> list0 = episodeOfCare0.getReferralRequest();
        java.util.List<Reference> list1 = episodeOfCare0.getReferralRequest();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test09() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        java.util.List<Reference> list0 = episodeOfCare0.getCondition();
        java.util.List<Reference> list1 = episodeOfCare0.getCondition();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test10() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        java.util.List<CodeableConcept> list0 = episodeOfCare0.getType();
        java.util.List<CodeableConcept> list1 = episodeOfCare0.getType();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test11() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        java.util.List<EpisodeOfCareStatusHistory> list0 = episodeOfCare0.getStatusHistory();
        java.util.List<EpisodeOfCareStatusHistory> list1 = episodeOfCare0.getStatusHistory();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test12() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        java.util.List<Identifier> list0 = episodeOfCare0.getIdentifier();
        java.util.List<Identifier> list1 = episodeOfCare0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test13() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        EpisodeOfCareStatus episodeOfCareStatus0 = episodeOfCare0.getStatus();
        assertNull(episodeOfCareStatus0);
    }

    @Test
    public void test14() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        Reference reference0 = episodeOfCare0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test15() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        Reference reference0 = episodeOfCare0.getCareManager();
        assertNull(reference0);
    }

    @Test
    public void test16() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        Reference reference0 = new Reference();
        episodeOfCare0.setManagingOrganization(reference0);
        Reference reference1 = episodeOfCare0.getManagingOrganization();
        assertSame(reference1, reference0);
    }

    @Test
    public void test17() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        Period period0 = episodeOfCare0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test18() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        Reference reference0 = episodeOfCare0.getManagingOrganization();
        assertNull(reference0);
    }

    @Test
    public void test19() throws Throwable {
        EpisodeOfCare episodeOfCare0 = new EpisodeOfCare();
        Period period0 = new Period();
        episodeOfCare0.setPeriod(period0);
        Period period1 = episodeOfCare0.getPeriod();
        assertSame(period1, period0);
    }
}
