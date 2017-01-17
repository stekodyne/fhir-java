/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:23:54 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImmunizationRecommendationTest {

    @Test
    public void test0() throws Throwable {
        ImmunizationRecommendation immunizationRecommendation0 = new ImmunizationRecommendation();
        java.util.List<ImmunizationRecommendationRecommendation> list0 = immunizationRecommendation0.getRecommendation();
        java.util.List<ImmunizationRecommendationRecommendation> list1 = immunizationRecommendation0.getRecommendation();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ImmunizationRecommendation immunizationRecommendation0 = new ImmunizationRecommendation();
        java.util.List<Identifier> list0 = immunizationRecommendation0.getIdentifier();
        java.util.List<Identifier> list1 = immunizationRecommendation0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        ImmunizationRecommendation immunizationRecommendation0 = new ImmunizationRecommendation();
        immunizationRecommendation0.setPatient((Reference) null);
    }

    @Test
    public void test3() throws Throwable {
        ImmunizationRecommendation immunizationRecommendation0 = new ImmunizationRecommendation();
        Reference reference0 = immunizationRecommendation0.getPatient();
        assertNull(reference0);
    }
}
