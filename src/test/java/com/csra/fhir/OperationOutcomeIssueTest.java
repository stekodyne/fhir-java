/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:03:22 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class OperationOutcomeIssueTest {

    @Test
    public void test0() throws Throwable {
        OperationOutcomeIssue operationOutcomeIssue0 = new OperationOutcomeIssue();
        java.util.List<String> list0 = operationOutcomeIssue0.getLocation();
        java.util.List<String> list1 = operationOutcomeIssue0.getLocation();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        OperationOutcomeIssue operationOutcomeIssue0 = new OperationOutcomeIssue();
        String string0 = operationOutcomeIssue0.getDiagnostics();
        assertNull(string0);
    }

    @Test
    public void test2() throws Throwable {
        OperationOutcomeIssue operationOutcomeIssue0 = new OperationOutcomeIssue();
        CodeableConcept codeableConcept0 = operationOutcomeIssue0.getDetails();
        assertNull(codeableConcept0);
    }

    @Test
    public void test3() throws Throwable {
        OperationOutcomeIssue operationOutcomeIssue0 = new OperationOutcomeIssue();
        operationOutcomeIssue0.setSeverity((IssueSeverity) null);
        assertNull(operationOutcomeIssue0.getId());
    }

    @Test
    public void test4() throws Throwable {
        OperationOutcomeIssue operationOutcomeIssue0 = new OperationOutcomeIssue();
        operationOutcomeIssue0.setDetails((CodeableConcept) null);
        assertNull(operationOutcomeIssue0.getId());
    }

    @Test
    public void test5() throws Throwable {
        OperationOutcomeIssue operationOutcomeIssue0 = new OperationOutcomeIssue();
        operationOutcomeIssue0.setDiagnostics((String) null);
        assertNull(operationOutcomeIssue0.getId());
    }

    @Test
    public void test6() throws Throwable {
        OperationOutcomeIssue operationOutcomeIssue0 = new OperationOutcomeIssue();
        operationOutcomeIssue0.setCode((IssueType) null);
        assertNull(operationOutcomeIssue0.getId());
    }

    @Test
    public void test7() throws Throwable {
        OperationOutcomeIssue operationOutcomeIssue0 = new OperationOutcomeIssue();
        IssueType issueType0 = operationOutcomeIssue0.getCode();
        assertNull(issueType0);
    }

    @Test
    public void test8() throws Throwable {
        OperationOutcomeIssue operationOutcomeIssue0 = new OperationOutcomeIssue();
        operationOutcomeIssue0.getSeverity();
    }
}
