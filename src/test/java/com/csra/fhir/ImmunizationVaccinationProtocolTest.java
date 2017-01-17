/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:52:19 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImmunizationVaccinationProtocolTest {

    @Test
    public void test00() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        java.util.List<CodeableConcept> list0 = immunizationVaccinationProtocol0.getTargetDisease();
        java.util.List<CodeableConcept> list1 = immunizationVaccinationProtocol0.getTargetDisease();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        PositiveInt positiveInt0 = immunizationVaccinationProtocol0.getSeriesDoses();
        assertNull(positiveInt0);
    }

    @Test
    public void test02() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        immunizationVaccinationProtocol0.setDoseSequence((PositiveInt) null);
        assertNull(immunizationVaccinationProtocol0.getId());
    }

    @Test
    public void test03() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        immunizationVaccinationProtocol0.setDoseStatusReason((CodeableConcept) null);
        assertNull(immunizationVaccinationProtocol0.getId());
    }

    @Test
    public void test04() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        Reference reference0 = immunizationVaccinationProtocol0.getAuthority();
        assertNull(reference0);
    }

    @Test
    public void test05() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        CodeableConcept codeableConcept0 = immunizationVaccinationProtocol0.getDoseStatusReason();
        assertNull(codeableConcept0);
    }

    @Test
    public void test06() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        CodeableConcept codeableConcept0 = immunizationVaccinationProtocol0.getDoseStatus();
        assertNull(codeableConcept0);
    }

    @Test
    public void test07() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        immunizationVaccinationProtocol0.setDoseStatus((CodeableConcept) null);
        assertNull(immunizationVaccinationProtocol0.getId());
    }

    @Test
    public void test08() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        immunizationVaccinationProtocol0.setSeries((String) null);
        assertNull(immunizationVaccinationProtocol0.getId());
    }

    @Test
    public void test09() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        PositiveInt positiveInt0 = immunizationVaccinationProtocol0.getDoseSequence();
        assertNull(positiveInt0);
    }

    @Test
    public void test10() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        String string0 = immunizationVaccinationProtocol0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test11() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        immunizationVaccinationProtocol0.setDescription((String) null);
        assertNull(immunizationVaccinationProtocol0.getId());
    }

    @Test
    public void test12() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        String string0 = immunizationVaccinationProtocol0.getSeries();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        immunizationVaccinationProtocol0.setSeriesDoses((PositiveInt) null);
        assertNull(immunizationVaccinationProtocol0.getId());
    }

    @Test
    public void test14() throws Throwable {
        ImmunizationVaccinationProtocol immunizationVaccinationProtocol0 = new ImmunizationVaccinationProtocol();
        immunizationVaccinationProtocol0.setAuthority((Reference) null);
    }
}
