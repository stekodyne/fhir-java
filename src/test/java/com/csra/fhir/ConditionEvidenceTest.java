/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:49:17 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConditionEvidenceTest {

    @Test
    public void test0() throws Throwable {
        ConditionEvidence conditionEvidence0 = new ConditionEvidence();
        java.util.List<Reference> list0 = conditionEvidence0.getDetail();
        java.util.List<Reference> list1 = conditionEvidence0.getDetail();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ConditionEvidence conditionEvidence0 = new ConditionEvidence();
        CodeableConcept codeableConcept0 = conditionEvidence0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test2() throws Throwable {
        ConditionEvidence conditionEvidence0 = new ConditionEvidence();
        conditionEvidence0.setCode((CodeableConcept) null);
        assertNull(conditionEvidence0.getId());
    }
}
