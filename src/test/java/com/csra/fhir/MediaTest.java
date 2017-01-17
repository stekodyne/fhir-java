/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:04:30 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class MediaTest {

    @Test
    public void test00() throws Throwable {
        Media media0 = new Media();
        java.util.List<Identifier> list0 = media0.getIdentifier();
        java.util.List<Identifier> list1 = media0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        Media media0 = new Media();
        media0.setSubject((Reference) null);
    }

    @Test
    public void test02() throws Throwable {
        Media media0 = new Media();
        UnsignedInt unsignedInt0 = media0.getDuration();
        assertNull(unsignedInt0);
    }

    @Test
    public void test03() throws Throwable {
        Media media0 = new Media();
        DigitalMediaType digitalMediaType0 = media0.getType();
        assertNull(digitalMediaType0);
    }

    @Test
    public void test04() throws Throwable {
        Media media0 = new Media();
        media0.setContent((Attachment) null);
    }

    @Test
    public void test05() throws Throwable {
        Media media0 = new Media();
        media0.setWidth((PositiveInt) null);
    }

    @Test
    public void test06() throws Throwable {
        Media media0 = new Media();
        PositiveInt positiveInt0 = media0.getWidth();
        assertNull(positiveInt0);
    }

    @Test
    public void test07() throws Throwable {
        Media media0 = new Media();
        CodeableConcept codeableConcept0 = media0.getSubtype();
        assertNull(codeableConcept0);
    }

    @Test
    public void test08() throws Throwable {
        Media media0 = new Media();
        media0.setDeviceName((String) null);
    }

    @Test
    public void test09() throws Throwable {
        Media media0 = new Media();
        Reference reference0 = media0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test10() throws Throwable {
        Media media0 = new Media();
        Attachment attachment0 = media0.getContent();
        assertNull(attachment0);
    }

    @Test
    public void test11() throws Throwable {
        Media media0 = new Media();
        String string0 = media0.getDeviceName();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        Media media0 = new Media();
        media0.setType((DigitalMediaType) null);
    }

    @Test
    public void test13() throws Throwable {
        Media media0 = new Media();
        PositiveInt positiveInt0 = media0.getFrames();
        assertNull(positiveInt0);
    }

    @Test
    public void test14() throws Throwable {
        Media media0 = new Media();
        media0.setOperator((Reference) null);
    }

    @Test
    public void test15() throws Throwable {
        Media media0 = new Media();
        media0.setFrames((PositiveInt) null);
    }

    @Test
    public void test16() throws Throwable {
        Media media0 = new Media();
        media0.setView((CodeableConcept) null);
    }

    @Test
    public void test17() throws Throwable {
        Media media0 = new Media();
        media0.setSubtype((CodeableConcept) null);
    }

    @Test
    public void test18() throws Throwable {
        Media media0 = new Media();
        media0.setHeight((PositiveInt) null);
    }

    @Test
    public void test19() throws Throwable {
        Media media0 = new Media();
        Reference reference0 = media0.getOperator();
        assertNull(reference0);
    }

    @Test
    public void test20() throws Throwable {
        Media media0 = new Media();
        PositiveInt positiveInt0 = media0.getHeight();
        assertNull(positiveInt0);
    }

    @Test
    public void test21() throws Throwable {
        Media media0 = new Media();
        CodeableConcept codeableConcept0 = media0.getView();
        assertNull(codeableConcept0);
    }

    @Test
    public void test22() throws Throwable {
        Media media0 = new Media();
        media0.setDuration((UnsignedInt) null);
    }
}
