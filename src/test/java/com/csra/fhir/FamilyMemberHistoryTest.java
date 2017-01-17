/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:10:21 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class FamilyMemberHistoryTest {

    @Test
    public void test00() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        java.util.List<FamilyMemberHistoryCondition> list0 = familyMemberHistory0.getCondition();
        java.util.List<FamilyMemberHistoryCondition> list1 = familyMemberHistory0.getCondition();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        java.util.List<Identifier> list0 = familyMemberHistory0.getIdentifier();
        java.util.List<Identifier> list1 = familyMemberHistory0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        familyMemberHistory0.setNote((Annotation) null);
    }

    @Test
    public void test03() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        Element element0 = familyMemberHistory0.getBornPeriodOrBornDateOrBornString();
        assertNull(element0);
    }

    @Test
    public void test04() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        Element element0 = familyMemberHistory0.getDeceasedBooleanOrDeceasedQuantityOrDeceasedRange();
        assertNull(element0);
    }

    @Test
    public void test05() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        Code code0 = familyMemberHistory0.getGender();
        assertNull(code0);
    }

    @Test
    public void test06() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        DateTime dateTime0 = familyMemberHistory0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test07() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        familyMemberHistory0.setPatient((Reference) null);
    }

    @Test
    public void test08() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        FamilyHistoryStatus familyHistoryStatus0 = familyMemberHistory0.getStatus();
        assertNull(familyHistoryStatus0);
    }

    @Test
    public void test09() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        familyMemberHistory0.setDeceasedBooleanOrDeceasedQuantityOrDeceasedRange((Element) null);
    }

    @Test
    public void test10() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        familyMemberHistory0.setAgeQuantityOrAgeRangeOrAgeString((Element) null);
    }

    @Test
    public void test11() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        CodeableConcept codeableConcept0 = familyMemberHistory0.getRelationship();
        assertNull(codeableConcept0);
    }

    @Test
    public void test12() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        Reference reference0 = familyMemberHistory0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test13() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        Annotation annotation0 = familyMemberHistory0.getNote();
        assertNull(annotation0);
    }

    @Test
    public void test14() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        familyMemberHistory0.setStatus((FamilyHistoryStatus) null);
    }

    @Test
    public void test15() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        familyMemberHistory0.setName((String) null);
    }

    @Test
    public void test16() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        familyMemberHistory0.setRelationship((CodeableConcept) null);
    }

    @Test
    public void test17() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        familyMemberHistory0.setDate((DateTime) null);
    }

    @Test
    public void test18() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        String string0 = familyMemberHistory0.getName();
        assertNull(string0);
    }

    @Test
    public void test19() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        familyMemberHistory0.setBornPeriodOrBornDateOrBornString((Element) null);
    }

    @Test
    public void test20() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        familyMemberHistory0.setGender((Code) null);
    }

    @Test
    public void test21() throws Throwable {
        FamilyMemberHistory familyMemberHistory0 = new FamilyMemberHistory();
        Element element0 = familyMemberHistory0.getAgeQuantityOrAgeRangeOrAgeString();
        assertNull(element0);
    }
}
