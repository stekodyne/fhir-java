/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:52:05 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DetectedIssueTest {

    @Test
    public void test00() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        java.util.List<DetectedIssueMitigation> list0 = detectedIssue0.getMitigation();
        java.util.List<DetectedIssueMitigation> list1 = detectedIssue0.getMitigation();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        java.util.List<Reference> list0 = detectedIssue0.getImplicated();
        java.util.List<Reference> list1 = detectedIssue0.getImplicated();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        String string0 = detectedIssue0.getDetail();
        assertNull(string0);
    }

    @Test
    public void test03() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        DateTime dateTime0 = detectedIssue0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test04() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        detectedIssue0.setDate((DateTime) null);
    }

    @Test
    public void test05() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        detectedIssue0.setDetail((String) null);
    }

    @Test
    public void test06() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        Uri uri0 = detectedIssue0.getReference();
        assertNull(uri0);
    }

    @Test
    public void test07() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        Reference reference0 = detectedIssue0.getAuthor();
        assertNull(reference0);
    }

    @Test
    public void test08() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        detectedIssue0.setSeverity((DetectedIssueSeverity) null);
    }

    @Test
    public void test09() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        detectedIssue0.setReference((Uri) null);
    }

    @Test
    public void test10() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        Reference reference0 = detectedIssue0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test11() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        detectedIssue0.setIdentifier((Identifier) null);
    }

    @Test
    public void test12() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        detectedIssue0.setAuthor((Reference) null);
    }

    @Test
    public void test13() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        detectedIssue0.setPatient((Reference) null);
    }

    @Test
    public void test14() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        Identifier identifier0 = detectedIssue0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test15() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        DetectedIssueSeverity detectedIssueSeverity0 = detectedIssue0.getSeverity();
        assertNull(detectedIssueSeverity0);
    }

    @Test
    public void test16() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        CodeableConcept codeableConcept0 = detectedIssue0.getCategory();
        assertNull(codeableConcept0);
    }

    @Test
    public void test17() throws Throwable {
        DetectedIssue detectedIssue0 = new DetectedIssue();
        detectedIssue0.setCategory((CodeableConcept) null);
    }
}
