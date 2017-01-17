/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:05:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ObservationComponentTest {

    @Test
    public void test0() throws Throwable {
        ObservationComponent observationComponent0 = new ObservationComponent();
        java.util.List<ObservationReferenceRange> list0 = observationComponent0.getReferenceRange();
        java.util.List<ObservationReferenceRange> list1 = observationComponent0.getReferenceRange();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ObservationComponent observationComponent0 = new ObservationComponent();
        observationComponent0.setDataAbsentReason((CodeableConcept) null);
        assertNull(observationComponent0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ObservationComponent observationComponent0 = new ObservationComponent();
        observationComponent0.setCode((CodeableConcept) null);
        assertNull(observationComponent0.getId());
    }

    @Test
    public void test3() throws Throwable {
        ObservationComponent observationComponent0 = new ObservationComponent();
        observationComponent0.setValueQuantityOrValueCodeableConceptOrValueString(observationComponent0);
        ObservationComponent observationComponent1 = (ObservationComponent) observationComponent0.getValueQuantityOrValueCodeableConceptOrValueString();
        assertSame(observationComponent0, observationComponent1);
    }

    @Test
    public void test4() throws Throwable {
        ObservationComponent observationComponent0 = new ObservationComponent();
        ObservationComponent observationComponent1 = (ObservationComponent) observationComponent0.getValueQuantityOrValueCodeableConceptOrValueString();
        assertNull(observationComponent1);
    }

    @Test
    public void test5() throws Throwable {
        ObservationComponent observationComponent0 = new ObservationComponent();
        CodeableConcept codeableConcept0 = observationComponent0.getDataAbsentReason();
        assertNull(codeableConcept0);
    }

    @Test
    public void test6() throws Throwable {
        ObservationComponent observationComponent0 = new ObservationComponent();
        observationComponent0.getCode();
    }
}
