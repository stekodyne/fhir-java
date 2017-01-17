/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:20:12 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class CompositionEventTest {

    @Test
    public void test0() throws Throwable {
        CompositionEvent compositionEvent0 = new CompositionEvent();
        java.util.List<Reference> list0 = compositionEvent0.getDetail();
        java.util.List<Reference> list1 = compositionEvent0.getDetail();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        CompositionEvent compositionEvent0 = new CompositionEvent();
        java.util.List<CodeableConcept> list0 = compositionEvent0.getCode();
        java.util.List<CodeableConcept> list1 = compositionEvent0.getCode();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        CompositionEvent compositionEvent0 = new CompositionEvent();
        Period period0 = compositionEvent0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test3() throws Throwable {
        CompositionEvent compositionEvent0 = new CompositionEvent();
        compositionEvent0.setPeriod((Period) null);
        assertNull(compositionEvent0.getId());
    }
}
