/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:24:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImmunizationTest {

    @Test
    public void test00() throws Throwable {
        Immunization immunization0 = new Immunization();
        java.util.List<ImmunizationVaccinationProtocol> list0 = immunization0.getVaccinationProtocol();
        java.util.List<ImmunizationVaccinationProtocol> list1 = immunization0.getVaccinationProtocol();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        Immunization immunization0 = new Immunization();
        java.util.List<ImmunizationReaction> list0 = immunization0.getReaction();
        java.util.List<ImmunizationReaction> list1 = immunization0.getReaction();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        Immunization immunization0 = new Immunization();
        java.util.List<Annotation> list0 = immunization0.getNote();
        java.util.List<Annotation> list1 = immunization0.getNote();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        Immunization immunization0 = new Immunization();
        java.util.List<Identifier> list0 = immunization0.getIdentifier();
        java.util.List<Identifier> list1 = immunization0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test04() throws Throwable {
        Immunization immunization0 = new Immunization();
        Reference reference0 = immunization0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test05() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setExplanation((ImmunizationExplanation) null);
    }

    @Test
    public void test06() throws Throwable {
        Immunization immunization0 = new Immunization();
        Reference reference0 = immunization0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test07() throws Throwable {
        Immunization immunization0 = new Immunization();
        Reference reference0 = immunization0.getRequester();
        assertNull(reference0);
    }

    @Test
    public void test08() throws Throwable {
        Immunization immunization0 = new Immunization();
        Boolean boolean0 = immunization0.getWasNotGiven();
        assertNull(boolean0);
    }

    @Test
    public void test09() throws Throwable {
        Immunization immunization0 = new Immunization();
        Reference reference0 = immunization0.getManufacturer();
        assertNull(reference0);
    }

    @Test
    public void test10() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setEncounter((Reference) null);
    }

    @Test
    public void test11() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setExpirationDate((Date) null);
    }

    @Test
    public void test12() throws Throwable {
        Immunization immunization0 = new Immunization();
        ImmunizationExplanation immunizationExplanation0 = immunization0.getExplanation();
        assertNull(immunizationExplanation0);
    }

    @Test
    public void test13() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setLocation((Reference) null);
    }

    @Test
    public void test14() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setVaccineCode((CodeableConcept) null);
    }

    @Test
    public void test15() throws Throwable {
        Immunization immunization0 = new Immunization();
        CodeableConcept codeableConcept0 = immunization0.getVaccineCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test16() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setDoseQuantity((SimpleQuantity) null);
    }

    @Test
    public void test17() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setRequester((Reference) null);
    }

    @Test
    public void test18() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setPerformer((Reference) null);
    }

    @Test
    public void test19() throws Throwable {
        Immunization immunization0 = new Immunization();
        CodeableConcept codeableConcept0 = immunization0.getSite();
        assertNull(codeableConcept0);
    }

    @Test
    public void test20() throws Throwable {
        Immunization immunization0 = new Immunization();
        SimpleQuantity simpleQuantity0 = immunization0.getDoseQuantity();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test21() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setLotNumber((String) null);
    }

    @Test
    public void test22() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setManufacturer((Reference) null);
    }

    @Test
    public void test23() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setWasNotGiven((Boolean) null);
    }

    @Test
    public void test24() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setDate((DateTime) null);
    }

    @Test
    public void test25() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setPatient((Reference) null);
    }

    @Test
    public void test26() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setStatus((Code) null);
    }

    @Test
    public void test27() throws Throwable {
        Immunization immunization0 = new Immunization();
        Reference reference0 = immunization0.getLocation();
        assertNull(reference0);
    }

    @Test
    public void test28() throws Throwable {
        Immunization immunization0 = new Immunization();
        String string0 = immunization0.getLotNumber();
        assertNull(string0);
    }

    @Test
    public void test29() throws Throwable {
        Immunization immunization0 = new Immunization();
        Date date0 = immunization0.getExpirationDate();
        assertNull(date0);
    }

    @Test
    public void test30() throws Throwable {
        Immunization immunization0 = new Immunization();
        Boolean boolean0 = immunization0.getReported();
        assertNull(boolean0);
    }

    @Test
    public void test31() throws Throwable {
        Immunization immunization0 = new Immunization();
        DateTime dateTime0 = immunization0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test32() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setSite((CodeableConcept) null);
    }

    @Test
    public void test33() throws Throwable {
        Immunization immunization0 = new Immunization();
        Reference reference0 = immunization0.getPerformer();
        assertNull(reference0);
    }

    @Test
    public void test34() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setReported((Boolean) null);
    }

    @Test
    public void test35() throws Throwable {
        Immunization immunization0 = new Immunization();
        Code code0 = immunization0.getStatus();
        assertNull(code0);
    }

    @Test
    public void test36() throws Throwable {
        Immunization immunization0 = new Immunization();
        immunization0.setRoute((CodeableConcept) null);
    }

    @Test
    public void test37() throws Throwable {
        Immunization immunization0 = new Immunization();
        CodeableConcept codeableConcept0 = immunization0.getRoute();
        assertNull(codeableConcept0);
    }
}
