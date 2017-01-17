/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:33:58 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImmunizationRecommendationRecommendationTest {

    @Test
    public void test00() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        java.util.List<Reference> list0 = immunizationRecommendationRecommendation0.getSupportingPatientInformation();
        java.util.List<Reference> list1 = immunizationRecommendationRecommendation0.getSupportingPatientInformation();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        java.util.List<Reference> list0 = immunizationRecommendationRecommendation0.getSupportingImmunization();
        java.util.List<Reference> list1 = immunizationRecommendationRecommendation0.getSupportingImmunization();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        java.util.List<ImmunizationRecommendationDateCriterion> list0 = immunizationRecommendationRecommendation0.getDateCriterion();
        java.util.List<ImmunizationRecommendationDateCriterion> list1 = immunizationRecommendationRecommendation0.getDateCriterion();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        DateTime dateTime0 = immunizationRecommendationRecommendation0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test04() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        PositiveInt positiveInt0 = immunizationRecommendationRecommendation0.getDoseNumber();
        assertNull(positiveInt0);
    }

    @Test
    public void test05() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        immunizationRecommendationRecommendation0.setVaccineCode((CodeableConcept) null);
        assertNull(immunizationRecommendationRecommendation0.getId());
    }

    @Test
    public void test06() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        CodeableConcept codeableConcept0 = immunizationRecommendationRecommendation0.getForecastStatus();
        assertNull(codeableConcept0);
    }

    @Test
    public void test07() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        CodeableConcept codeableConcept0 = immunizationRecommendationRecommendation0.getVaccineCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test08() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        immunizationRecommendationRecommendation0.setProtocol((ImmunizationRecommendationProtocol) null);
        assertNull(immunizationRecommendationRecommendation0.getId());
    }

    @Test
    public void test09() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        ImmunizationRecommendationProtocol immunizationRecommendationProtocol0 = immunizationRecommendationRecommendation0.getProtocol();
        assertNull(immunizationRecommendationProtocol0);
    }

    @Test
    public void test10() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        immunizationRecommendationRecommendation0.setForecastStatus((CodeableConcept) null);
        assertNull(immunizationRecommendationRecommendation0.getId());
    }

    @Test
    public void test11() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        immunizationRecommendationRecommendation0.setDoseNumber((PositiveInt) null);
        assertNull(immunizationRecommendationRecommendation0.getId());
    }

    @Test
    public void test12() throws Throwable {
        ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation0 = new ImmunizationRecommendationRecommendation();
        immunizationRecommendationRecommendation0.setDate((DateTime) null);
        assertNull(immunizationRecommendationRecommendation0.getId());
    }
}
