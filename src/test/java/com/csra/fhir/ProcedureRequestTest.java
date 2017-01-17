/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:35:33 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ProcedureRequestTest {

    @Test
    public void test00() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        java.util.List<Annotation> list0 = procedureRequest0.getNotes();
        java.util.List<Annotation> list1 = procedureRequest0.getNotes();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        java.util.List<CodeableConcept> list0 = procedureRequest0.getBodySite();
        java.util.List<CodeableConcept> list1 = procedureRequest0.getBodySite();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        java.util.List<Identifier> list0 = procedureRequest0.getIdentifier();
        java.util.List<Identifier> list1 = procedureRequest0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setEncounter((Reference) null);
    }

    @Test
    public void test04() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setPriority((ProcedureRequestPriority) null);
    }

    @Test
    public void test05() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        Reference reference0 = procedureRequest0.getOrderer();
        assertNull(reference0);
    }

    @Test
    public void test06() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setOrderedOn((DateTime) null);
    }

    @Test
    public void test07() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        Reference reference0 = procedureRequest0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test08() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        CodeableConcept codeableConcept0 = procedureRequest0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test09() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setOrderer((Reference) null);
    }

    @Test
    public void test10() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        Element element0 = procedureRequest0.getAsNeededBooleanOrAsNeededCodeableConcept();
        assertNull(element0);
    }

    @Test
    public void test11() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        ProcedureRequestStatus procedureRequestStatus0 = procedureRequest0.getStatus();
        assertNull(procedureRequestStatus0);
    }

    @Test
    public void test12() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        Element element0 = procedureRequest0.getScheduledDateTimeOrScheduledPeriodOrScheduledTiming();
        assertNull(element0);
    }

    @Test
    public void test13() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        ProcedureRequestPriority procedureRequestPriority0 = procedureRequest0.getPriority();
        assertNull(procedureRequestPriority0);
    }

    @Test
    public void test14() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setReasonCodeableConceptOrReasonReference((Element) null);
    }

    @Test
    public void test15() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setSubject((Reference) null);
    }

    @Test
    public void test16() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setAsNeededBooleanOrAsNeededCodeableConcept((Element) null);
    }

    @Test
    public void test17() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        Element element0 = procedureRequest0.getReasonCodeableConceptOrReasonReference();
        assertNull(element0);
    }

    @Test
    public void test18() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setScheduledDateTimeOrScheduledPeriodOrScheduledTiming((Element) null);
    }

    @Test
    public void test19() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setCode((CodeableConcept) null);
    }

    @Test
    public void test20() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        Reference reference0 = procedureRequest0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setPerformer((Reference) null);
    }

    @Test
    public void test22() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        DateTime dateTime0 = procedureRequest0.getOrderedOn();
        assertNull(dateTime0);
    }

    @Test
    public void test23() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.setStatus((ProcedureRequestStatus) null);
    }

    @Test
    public void test24() throws Throwable {
        ProcedureRequest procedureRequest0 = new ProcedureRequest();
        procedureRequest0.getPerformer();
    }
}
