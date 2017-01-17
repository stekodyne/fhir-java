/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:57:06 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ImagingStudyTest {

    @Test
    public void test00() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Reference reference0 = new Reference();
        imagingStudy0.patient = reference0;
        Reference reference1 = imagingStudy0.getReferrer();
        assertNull(reference1);
    }

    @Test
    public void test01() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Oid oid0 = new Oid();
        imagingStudy0.uid = oid0;
        Oid oid1 = imagingStudy0.getUid();
        assertSame(oid1, oid0);
    }

    @Test
    public void test02() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        LinkedList<ImagingStudySeries> linkedList0 = new LinkedList<ImagingStudySeries>();
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        linkedList0.add(imagingStudySeries0);
        imagingStudy0.series = (java.util.List<ImagingStudySeries>) linkedList0;
        java.util.List<ImagingStudySeries> list0 = imagingStudy0.getSeries();
        assertFalse(list0.isEmpty());
        assertNotNull(list0);
    }

    @Test
    public void test03() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        linkedList0.add(imagingStudy0.interpreter);
        imagingStudy0.procedure = (java.util.List<Reference>) linkedList0;
        java.util.List<Reference> list0 = imagingStudy0.getProcedure();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test04() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Reference reference0 = new Reference();
        imagingStudy0.patient = reference0;
        Reference reference1 = imagingStudy0.getPatient();
        assertSame(reference1, reference0);
    }

    @Test
    public void test05() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        UnsignedInt unsignedInt0 = new UnsignedInt();
        imagingStudy0.numberOfSeries = unsignedInt0;
        UnsignedInt unsignedInt1 = imagingStudy0.getNumberOfSeries();
        assertSame(unsignedInt1, unsignedInt0);
    }

    @Test
    public void test06() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Reference reference0 = new Reference();
        imagingStudy0.interpreter = reference0;
        Reference reference1 = imagingStudy0.getInterpreter();
        assertSame(reference1, reference0);
    }

    @Test
    public void test07() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Identifier identifier0 = new Identifier();
        imagingStudy0.accession = identifier0;
        Identifier identifier1 = imagingStudy0.getAccession();
        assertSame(identifier1, identifier0);
    }

    @Test
    public void test08() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        java.util.List<ImagingStudySeries> list0 = imagingStudy0.getSeries();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test09() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        java.util.List<Reference> list0 = imagingStudy0.getProcedure();
        java.util.List<Reference> list1 = imagingStudy0.getProcedure();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test10() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        java.util.List<Coding> list0 = imagingStudy0.getModalityList();
        java.util.List<Coding> list1 = imagingStudy0.getModalityList();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test11() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        java.util.List<Reference> list0 = imagingStudy0.getOrder();
        java.util.List<Reference> list1 = imagingStudy0.getOrder();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test12() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        java.util.List<Identifier> list0 = imagingStudy0.getIdentifier();
        java.util.List<Identifier> list1 = imagingStudy0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test13() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        UnsignedInt unsignedInt0 = imagingStudy0.getNumberOfInstances();
        assertNull(unsignedInt0);
    }

    @Test
    public void test14() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Reference reference0 = new Reference();
        imagingStudy0.setPatient(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test15() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Reference reference0 = imagingStudy0.getInterpreter();
        assertNull(reference0);
    }

    @Test
    public void test16() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Uri uri0 = new Uri();
        imagingStudy0.setUrl(uri0);
        assertNull(uri0.getValue());
    }

    @Test
    public void test17() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        UnsignedInt unsignedInt0 = imagingStudy0.getNumberOfSeries();
        assertNull(unsignedInt0);
    }

    @Test
    public void test18() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Reference reference0 = new Reference();
        imagingStudy0.setReferrer(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test19() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        DateTime dateTime0 = new DateTime();
        imagingStudy0.setStarted(dateTime0);
        assertNull(dateTime0.getValue());
    }

    @Test
    public void test20() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Identifier identifier0 = new Identifier();
        imagingStudy0.setAccession(identifier0);
        assertNull(identifier0.getId());
    }

    @Test
    public void test21() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Oid oid0 = imagingStudy0.getUid();
        assertNull(oid0);
    }

    @Test
    public void test22() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        DateTime dateTime0 = imagingStudy0.getStarted();
        assertNull(dateTime0);
    }

    @Test
    public void test23() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        UnsignedInt unsignedInt0 = new UnsignedInt();
        imagingStudy0.setNumberOfSeries(unsignedInt0);
        UnsignedInt unsignedInt1 = imagingStudy0.getNumberOfInstances();
        assertNull(unsignedInt1);
    }

    @Test
    public void test24() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Oid oid0 = new Oid();
        imagingStudy0.setUid(oid0);
        assertNull(oid0.getId());
    }

    @Test
    public void test25() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        String string0 = new String();
        imagingStudy0.setDescription(string0);
        String string1 = imagingStudy0.getDescription();
        assertSame(string1, string0);
    }

    @Test
    public void test26() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Reference reference0 = imagingStudy0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test27() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        InstanceAvailability instanceAvailability0 = imagingStudy0.getAvailability();
        assertNull(instanceAvailability0);
    }

    @Test
    public void test28() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        String string0 = imagingStudy0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test29() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Uri uri0 = imagingStudy0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test30() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Identifier identifier0 = imagingStudy0.getAccession();
        assertNull(identifier0);
    }

    @Test
    public void test31() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        UnsignedInt unsignedInt0 = new UnsignedInt();
        imagingStudy0.setNumberOfInstances(unsignedInt0);
        assertNull(unsignedInt0.getId());
    }

    @Test
    public void test32() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        InstanceAvailability instanceAvailability0 = new InstanceAvailability();
        imagingStudy0.setAvailability(instanceAvailability0);
        assertNull(instanceAvailability0.getId());
    }

    @Test
    public void test33() throws Throwable {
        ImagingStudy imagingStudy0 = new ImagingStudy();
        Reference reference0 = new Reference();
        imagingStudy0.setInterpreter(reference0);
        assertNull(reference0.getId());
    }
}
