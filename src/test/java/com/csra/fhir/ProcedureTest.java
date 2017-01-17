/*
 * This file was created by Steffen Kory
 * Mon Jan 16 16:59:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ProcedureTest {

    @Test
    public void test00() throws Throwable {
        Procedure procedure0 = new Procedure();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        procedure0.setOutcome(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test01() throws Throwable {
        Procedure procedure0 = new Procedure();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        procedure0.category = codeableConcept0;
        CodeableConcept codeableConcept1 = procedure0.getOutcome();
        assertNull(codeableConcept1);
    }

    @Test
    public void test02() throws Throwable {
        Procedure procedure0 = new Procedure();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        procedure0.setCode(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test03() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = new Reference();
        procedure0.setSubject(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test04() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = new Reference();
        procedure0.subject = reference0;
        Reference reference1 = procedure0.getSubject();
        assertNull(reference1.getId());
    }

    @Test
    public void test05() throws Throwable {
        Procedure procedure0 = new Procedure();
        Id id0 = new Id();
        procedure0.reasonCodeableConceptOrReasonReference = (Element) id0;
        Id id1 = (Id) procedure0.getReasonCodeableConceptOrReasonReference();
        assertNull(id1.getValue());
    }

    @Test
    public void test06() throws Throwable {
        Procedure procedure0 = new Procedure();
        Boolean boolean0 = new Boolean();
        procedure0.notPerformed = boolean0;
        Boolean boolean1 = procedure0.getNotPerformed();
        assertSame(boolean1, boolean0);
    }

    @Test
    public void test07() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = new Reference();
        procedure0.location = reference0;
        Reference reference1 = procedure0.getLocation();
        assertSame(reference1, reference0);
    }

    @Test
    public void test08() throws Throwable {
        Procedure procedure0 = new Procedure();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        procedure0.code = codeableConcept0;
        CodeableConcept codeableConcept1 = procedure0.getCode();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test09() throws Throwable {
        Procedure procedure0 = new Procedure();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        procedure0.setCategory(codeableConcept0);
        CodeableConcept codeableConcept1 = procedure0.getCategory();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test10() throws Throwable {
        Procedure procedure0 = new Procedure();
        java.util.List<Reference> list0 = procedure0.getUsed();
        java.util.List<Reference> list1 = procedure0.getUsed();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test11() throws Throwable {
        Procedure procedure0 = new Procedure();
        java.util.List<ProcedureFocalDevice> list0 = procedure0.getFocalDevice();
        java.util.List<ProcedureFocalDevice> list1 = procedure0.getFocalDevice();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test12() throws Throwable {
        Procedure procedure0 = new Procedure();
        java.util.List<Annotation> list0 = procedure0.getNotes();
        java.util.List<Annotation> list1 = procedure0.getNotes();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test13() throws Throwable {
        Procedure procedure0 = new Procedure();
        java.util.List<CodeableConcept> list0 = procedure0.getFollowUp();
        java.util.List<CodeableConcept> list1 = procedure0.getFollowUp();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test14() throws Throwable {
        Procedure procedure0 = new Procedure();
        java.util.List<CodeableConcept> list0 = procedure0.getComplication();
        java.util.List<CodeableConcept> list1 = procedure0.getComplication();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test15() throws Throwable {
        Procedure procedure0 = new Procedure();
        java.util.List<Reference> list0 = procedure0.getReport();
        java.util.List<Reference> list1 = procedure0.getReport();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test16() throws Throwable {
        Procedure procedure0 = new Procedure();
        java.util.List<ProcedurePerformer> list0 = procedure0.getPerformer();
        java.util.List<ProcedurePerformer> list1 = procedure0.getPerformer();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test17() throws Throwable {
        Procedure procedure0 = new Procedure();
        java.util.List<CodeableConcept> list0 = procedure0.getBodySite();
        java.util.List<CodeableConcept> list1 = procedure0.getBodySite();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test18() throws Throwable {
        Procedure procedure0 = new Procedure();
        java.util.List<CodeableConcept> list0 = procedure0.getReasonNotPerformed();
        java.util.List<CodeableConcept> list1 = procedure0.getReasonNotPerformed();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test19() throws Throwable {
        Procedure procedure0 = new Procedure();
        java.util.List<Identifier> list0 = procedure0.getIdentifier();
        java.util.List<Identifier> list1 = procedure0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test20() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = procedure0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = procedure0.getRequest();
        assertNull(reference0);
    }

    @Test
    public void test22() throws Throwable {
        Procedure procedure0 = new Procedure();
        ProcedureStatus procedureStatus0 = new ProcedureStatus();
        procedure0.setStatus(procedureStatus0);
        ProcedureStatus procedureStatus1 = procedure0.getStatus();
        assertSame(procedureStatus1, procedureStatus0);
    }

    @Test
    public void test23() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = new Reference();
        procedure0.setReasonCodeableConceptOrReasonReference(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test24() throws Throwable {
        Procedure procedure0 = new Procedure();
        ProcedureStatus procedureStatus0 = procedure0.getStatus();
        assertNull(procedureStatus0);
    }

    @Test
    public void test25() throws Throwable {
        Procedure procedure0 = new Procedure();
        Boolean boolean0 = new Boolean();
        procedure0.setNotPerformed(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test26() throws Throwable {
        Procedure procedure0 = new Procedure();
        CodeableConcept codeableConcept0 = procedure0.getCategory();
        assertNull(codeableConcept0);
    }

    @Test
    public void test27() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = procedure0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test28() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = new Reference();
        procedure0.setEncounter(reference0);
        Reference reference1 = procedure0.getEncounter();
        assertSame(reference1, reference0);
    }

    @Test
    public void test29() throws Throwable {
        Procedure procedure0 = new Procedure();
        ProcedureStatus procedureStatus0 = (ProcedureStatus) procedure0.getPerformedDateTimeOrPerformedPeriod();
        assertNull(procedureStatus0);
    }

    @Test
    public void test30() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = new Reference();
        procedure0.setLocation(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test31() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = procedure0.getLocation();
        assertNull(reference0);
    }

    @Test
    public void test32() throws Throwable {
        Procedure procedure0 = new Procedure();
        Id id0 = (Id) procedure0.getReasonCodeableConceptOrReasonReference();
        assertNull(id0);
    }

    @Test
    public void test33() throws Throwable {
        Procedure procedure0 = new Procedure();
        Boolean boolean0 = procedure0.getNotPerformed();
        assertNull(boolean0);
    }

    @Test
    public void test34() throws Throwable {
        Procedure procedure0 = new Procedure();
        Reference reference0 = new Reference();
        procedure0.setRequest(reference0);
        Reference reference1 = procedure0.getRequest();
        assertSame(reference1, reference0);
    }

    @Test
    public void test35() throws Throwable {
        Procedure procedure0 = new Procedure();
        ProcedureStatus procedureStatus0 = new ProcedureStatus();
        procedure0.setPerformedDateTimeOrPerformedPeriod(procedureStatus0);
        ProcedureStatus procedureStatus1 = (ProcedureStatus) procedure0.getPerformedDateTimeOrPerformedPeriod();
        assertNull(procedureStatus1.getId());
    }

    @Test
    public void test36() throws Throwable {
        Procedure procedure0 = new Procedure();
        CodeableConcept codeableConcept0 = procedure0.getCode();
        assertNull(codeableConcept0);
    }
}
