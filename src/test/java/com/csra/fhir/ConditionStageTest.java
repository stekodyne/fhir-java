/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:23:57 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConditionStageTest {

    @Test
    public void test0() throws Throwable {
        ConditionStage conditionStage0 = new ConditionStage();
        java.util.List<Reference> list0 = conditionStage0.getAssessment();
        java.util.List<Reference> list1 = conditionStage0.getAssessment();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ConditionStage conditionStage0 = new ConditionStage();
        conditionStage0.setSummary((CodeableConcept) null);
        assertNull(conditionStage0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ConditionStage conditionStage0 = new ConditionStage();
        conditionStage0.getSummary();
    }
}
