/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:32:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class GoalOutcomeTest {

    @Test
    public void test0() throws Throwable {
        GoalOutcome goalOutcome0 = new GoalOutcome();
        goalOutcome0.setResultCodeableConceptOrResultReference(goalOutcome0);
        GoalOutcome goalOutcome1 = (GoalOutcome) goalOutcome0.getResultCodeableConceptOrResultReference();
        assertNull(goalOutcome1.getId());
    }

    @Test
    public void test1() throws Throwable {
        GoalOutcome goalOutcome0 = new GoalOutcome();
        Element element0 = goalOutcome0.getResultCodeableConceptOrResultReference();
        assertNull(element0);
    }
}
