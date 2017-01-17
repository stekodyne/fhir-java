/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:15:24 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ClinicalImpressionInvestigationsTest {

    @Test
    public void test0() throws Throwable {
        ClinicalImpressionInvestigations clinicalImpressionInvestigations0 = new ClinicalImpressionInvestigations();
        java.util.List<Reference> list0 = clinicalImpressionInvestigations0.getItem();
        java.util.List<Reference> list1 = clinicalImpressionInvestigations0.getItem();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ClinicalImpressionInvestigations clinicalImpressionInvestigations0 = new ClinicalImpressionInvestigations();
        CodeableConcept codeableConcept0 = clinicalImpressionInvestigations0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test2() throws Throwable {
        ClinicalImpressionInvestigations clinicalImpressionInvestigations0 = new ClinicalImpressionInvestigations();
        clinicalImpressionInvestigations0.setCode((CodeableConcept) null);
        assertNull(clinicalImpressionInvestigations0.getId());
    }
}
