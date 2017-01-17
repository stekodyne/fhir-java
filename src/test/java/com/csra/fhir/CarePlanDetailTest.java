/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:59:45 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class CarePlanDetailTest {

    @Test
    public void test00() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        Boolean boolean0 = new Boolean();
        carePlanDetail0.setProhibited(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test01() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        carePlanDetail0.setStatusReason(codeableConcept0);
        assertNull(carePlanDetail0.getId());
    }

    @Test
    public void test02() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        carePlanDetail0.setCode(codeableConcept0);
        CodeableConcept codeableConcept1 = carePlanDetail0.getStatusReason();
        assertNull(codeableConcept1);
    }

    @Test
    public void test03() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        carePlanDetail0.category = codeableConcept0;
        CodeableConcept codeableConcept1 = carePlanDetail0.getStatusReason();
        assertNull(codeableConcept1);
    }

    @Test
    public void test04() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CarePlanActivityStatus carePlanActivityStatus0 = new CarePlanActivityStatus();
        carePlanDetail0.setStatus(carePlanActivityStatus0);
        CarePlanActivityStatus carePlanActivityStatus1 = carePlanDetail0.getStatus();
        assertNull(carePlanActivityStatus1.getValue());
    }

    @Test
    public void test05() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        carePlanDetail0.scheduledTimingOrScheduledPeriodOrScheduledString = (Element) codeableConcept0;
        CodeableConcept codeableConcept1 = (CodeableConcept) carePlanDetail0.getScheduledTimingOrScheduledPeriodOrScheduledString();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test06() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        Reference reference0 = new Reference();
        linkedList0.add(reference0);
        carePlanDetail0.reasonReference = (java.util.List<Reference>) linkedList0;
        java.util.List<Reference> list0 = carePlanDetail0.getReasonReference();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test07() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        LinkedList<CodeableConcept> linkedList0 = new LinkedList<CodeableConcept>();
        carePlanDetail0.reasonCode = (java.util.List<CodeableConcept>) linkedList0;
        linkedList0.add((CodeableConcept) null);
        java.util.List<CodeableConcept> list0 = carePlanDetail0.getReasonCode();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test08() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        Boolean boolean0 = new Boolean();
        carePlanDetail0.prohibited = boolean0;
        Boolean boolean1 = carePlanDetail0.getProhibited();
        assertSame(boolean1, boolean0);
    }

    @Test
    public void test09() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        Reference reference0 = new Reference();
        carePlanDetail0.location = reference0;
        Reference reference1 = carePlanDetail0.getLocation();
        assertNull(reference1.getId());
    }

    @Test
    public void test10() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        carePlanDetail0.category = codeableConcept0;
        CodeableConcept codeableConcept1 = carePlanDetail0.getCategory();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test11() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        java.util.List<Reference> list0 = carePlanDetail0.getPerformer();
        java.util.List<Reference> list1 = carePlanDetail0.getPerformer();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test12() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        java.util.List<Reference> list0 = carePlanDetail0.getGoal();
        java.util.List<Reference> list1 = carePlanDetail0.getGoal();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test13() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        java.util.List<Reference> list0 = carePlanDetail0.getReasonReference();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test14() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        java.util.List<CodeableConcept> list0 = carePlanDetail0.getReasonCode();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test15() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        SimpleQuantity simpleQuantity0 = carePlanDetail0.getQuantity();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test16() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        Boolean boolean0 = carePlanDetail0.getProhibited();
        assertNull(boolean0);
    }

    @Test
    public void test17() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        Reference reference0 = new Reference();
        carePlanDetail0.setLocation(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test18() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        Boolean boolean0 = new Boolean();
        carePlanDetail0.setProductCodeableConceptOrProductReference(boolean0);
        Boolean boolean1 = (Boolean) carePlanDetail0.getProductCodeableConceptOrProductReference();
        assertSame(boolean1, boolean0);
    }

    @Test
    public void test19() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CodeableConcept codeableConcept0 = carePlanDetail0.getCategory();
        assertNull(codeableConcept0);
    }

    @Test
    public void test20() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        String string0 = new String();
        carePlanDetail0.setScheduledTimingOrScheduledPeriodOrScheduledString(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test21() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        SimpleQuantity simpleQuantity0 = new SimpleQuantity();
        carePlanDetail0.setDailyAmount(simpleQuantity0);
        SimpleQuantity simpleQuantity1 = carePlanDetail0.getDailyAmount();
        assertNull(simpleQuantity1.getId());
    }

    @Test
    public void test22() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        Boolean boolean0 = (Boolean) carePlanDetail0.getProductCodeableConceptOrProductReference();
        assertNull(boolean0);
    }

    @Test
    public void test23() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        carePlanDetail0.setCategory(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test24() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        String string0 = new String();
        carePlanDetail0.setDescription(string0);
        String string1 = carePlanDetail0.getDescription();
        assertNull(string1.getId());
    }

    @Test
    public void test25() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        carePlanDetail0.setCode(codeableConcept0);
        CodeableConcept codeableConcept1 = carePlanDetail0.getCode();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test26() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CodeableConcept codeableConcept0 = carePlanDetail0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test27() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        String string0 = carePlanDetail0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test28() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        SimpleQuantity simpleQuantity0 = new SimpleQuantity();
        carePlanDetail0.setQuantity(simpleQuantity0);
        SimpleQuantity simpleQuantity1 = carePlanDetail0.getQuantity();
        assertSame(simpleQuantity1, simpleQuantity0);
    }

    @Test
    public void test29() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        CarePlanActivityStatus carePlanActivityStatus0 = carePlanDetail0.getStatus();
        assertNull(carePlanActivityStatus0);
    }

    @Test
    public void test30() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        Reference reference0 = carePlanDetail0.getLocation();
        assertNull(reference0);
    }

    @Test
    public void test31() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        SimpleQuantity simpleQuantity0 = carePlanDetail0.getDailyAmount();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test32() throws Throwable {
        CarePlanDetail carePlanDetail0 = new CarePlanDetail();
        Element element0 = carePlanDetail0.getScheduledTimingOrScheduledPeriodOrScheduledString();
        assertNull(element0);
    }
}
