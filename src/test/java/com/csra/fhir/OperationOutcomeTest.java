/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:17:58 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class OperationOutcomeTest {

    @Test
    public void test0() throws Throwable {
        OperationOutcome operationOutcome0 = new OperationOutcome();
        java.util.List<OperationOutcomeIssue> list0 = operationOutcome0.getIssue();
        java.util.List<OperationOutcomeIssue> list1 = operationOutcome0.getIssue();
        assertNotNull(list1);
        assertSame(list1, list0);
    }
}
