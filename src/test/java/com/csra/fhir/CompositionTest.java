/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:07:02 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class CompositionTest {

    @Test
    public void test00() throws Throwable {
        Composition composition0 = new Composition();
        Reference reference0 = new Reference();
        composition0.subject = reference0;
        Reference reference1 = composition0.getCustodian();
        assertNull(reference1);
    }

    @Test
    public void test01() throws Throwable {
        Composition composition0 = new Composition();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        composition0.type = codeableConcept0;
        CodeableConcept codeableConcept1 = composition0.getType();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test02() throws Throwable {
        Composition composition0 = new Composition();
        Reference reference0 = new Reference();
        composition0.subject = reference0;
        Reference reference1 = composition0.getSubject();
        assertSame(reference1, reference0);
    }

    @Test
    public void test03() throws Throwable {
        Composition composition0 = new Composition();
        Reference reference0 = new Reference();
        composition0.encounter = reference0;
        Reference reference1 = composition0.getEncounter();
        assertNull(reference1.getId());
    }

    @Test
    public void test04() throws Throwable {
        Composition composition0 = new Composition();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        composition0.clazz = codeableConcept0;
        CodeableConcept codeableConcept1 = composition0.getClazz();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test05() throws Throwable {
        Composition composition0 = new Composition();
        java.util.List<CompositionSection> list0 = composition0.getSection();
        java.util.List<CompositionSection> list1 = composition0.getSection();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test06() throws Throwable {
        Composition composition0 = new Composition();
        java.util.List<CompositionEvent> list0 = composition0.getEvent();
        java.util.List<CompositionEvent> list1 = composition0.getEvent();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test07() throws Throwable {
        Composition composition0 = new Composition();
        java.util.List<CompositionAttester> list0 = composition0.getAttester();
        java.util.List<CompositionAttester> list1 = composition0.getAttester();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test08() throws Throwable {
        Composition composition0 = new Composition();
        java.util.List<Reference> list0 = composition0.getAuthor();
        java.util.List<Reference> list1 = composition0.getAuthor();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        Composition composition0 = new Composition();
        CompositionStatus compositionStatus0 = composition0.getStatus();
        assertNull(compositionStatus0);
    }

    @Test
    public void test10() throws Throwable {
        Composition composition0 = new Composition();
        composition0.setTitle((String) null);
    }

    @Test
    public void test11() throws Throwable {
        Composition composition0 = new Composition();
        DateTime dateTime0 = composition0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test12() throws Throwable {
        Composition composition0 = new Composition();
        Reference reference0 = new Reference();
        composition0.setEncounter(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test13() throws Throwable {
        Composition composition0 = new Composition();
        Code code0 = composition0.getConfidentiality();
        assertNull(code0);
    }

    @Test
    public void test14() throws Throwable {
        Composition composition0 = new Composition();
        composition0.setDate((DateTime) null);
    }

    @Test
    public void test15() throws Throwable {
        Composition composition0 = new Composition();
        composition0.setStatus((CompositionStatus) null);
    }

    @Test
    public void test16() throws Throwable {
        Composition composition0 = new Composition();
        Reference reference0 = new Reference();
        composition0.setCustodian(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test17() throws Throwable {
        Composition composition0 = new Composition();
        composition0.setConfidentiality((Code) null);
    }

    @Test
    public void test18() throws Throwable {
        Composition composition0 = new Composition();
        Identifier identifier0 = composition0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test19() throws Throwable {
        Composition composition0 = new Composition();
        Reference reference0 = composition0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test20() throws Throwable {
        Composition composition0 = new Composition();
        String string0 = composition0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test21() throws Throwable {
        Composition composition0 = new Composition();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        composition0.setClazz(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test22() throws Throwable {
        Composition composition0 = new Composition();
        CodeableConcept codeableConcept0 = composition0.getClazz();
        assertNull(codeableConcept0);
    }

    @Test
    public void test23() throws Throwable {
        Composition composition0 = new Composition();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        composition0.setType(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test24() throws Throwable {
        Composition composition0 = new Composition();
        composition0.setIdentifier((Identifier) null);
    }

    @Test
    public void test25() throws Throwable {
        Composition composition0 = new Composition();
        Reference reference0 = new Reference();
        composition0.setSubject(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test26() throws Throwable {
        Composition composition0 = new Composition();
        CodeableConcept codeableConcept0 = composition0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test27() throws Throwable {
        Composition composition0 = new Composition();
        Reference reference0 = composition0.getEncounter();
        assertNull(reference0);
    }
}
