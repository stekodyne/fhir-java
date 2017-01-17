/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:54:43 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class ImmunizationExplanationTest {

    @Test
    public void test0() throws Throwable {
        ImmunizationExplanation immunizationExplanation0 = new ImmunizationExplanation();
        java.util.List<CodeableConcept> list0 = immunizationExplanation0.getReasonNotGiven();
        java.util.List<CodeableConcept> list1 = immunizationExplanation0.getReasonNotGiven();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ImmunizationExplanation immunizationExplanation0 = new ImmunizationExplanation();
        immunizationExplanation0.getReason();
        immunizationExplanation0.getReason();
    }
}
