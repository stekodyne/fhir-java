/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:02:58 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class EpisodeOfCareCareTeamTest {

    @Test
    public void test0() throws Throwable {
        EpisodeOfCareCareTeam episodeOfCareCareTeam0 = new EpisodeOfCareCareTeam();
        java.util.List<CodeableConcept> list0 = episodeOfCareCareTeam0.getRole();
        java.util.List<CodeableConcept> list1 = episodeOfCareCareTeam0.getRole();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        EpisodeOfCareCareTeam episodeOfCareCareTeam0 = new EpisodeOfCareCareTeam();
        Reference reference0 = episodeOfCareCareTeam0.getMember();
        assertNull(reference0);
    }

    @Test
    public void test2() throws Throwable {
        EpisodeOfCareCareTeam episodeOfCareCareTeam0 = new EpisodeOfCareCareTeam();
        Period period0 = episodeOfCareCareTeam0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test3() throws Throwable {
        EpisodeOfCareCareTeam episodeOfCareCareTeam0 = new EpisodeOfCareCareTeam();
        episodeOfCareCareTeam0.setMember((Reference) null);
        assertNull(episodeOfCareCareTeam0.getId());
    }

    @Test
    public void test4() throws Throwable {
        EpisodeOfCareCareTeam episodeOfCareCareTeam0 = new EpisodeOfCareCareTeam();
        episodeOfCareCareTeam0.setPeriod((Period) null);
    }
}
