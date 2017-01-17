/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:52:04 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class BodySiteTest {

    @Test
    public void test0() throws Throwable {
        BodySite bodySite0 = new BodySite();
        java.util.List<Attachment> list0 = bodySite0.getImage();
        java.util.List<Attachment> list1 = bodySite0.getImage();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        BodySite bodySite0 = new BodySite();
        java.util.List<CodeableConcept> list0 = bodySite0.getModifier();
        java.util.List<CodeableConcept> list1 = bodySite0.getModifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        BodySite bodySite0 = new BodySite();
        java.util.List<Identifier> list0 = bodySite0.getIdentifier();
        java.util.List<Identifier> list1 = bodySite0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test3() throws Throwable {
        BodySite bodySite0 = new BodySite();
        CodeableConcept codeableConcept0 = bodySite0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test4() throws Throwable {
        BodySite bodySite0 = new BodySite();
        bodySite0.setDescription((String) null);
    }

    @Test
    public void test5() throws Throwable {
        BodySite bodySite0 = new BodySite();
        bodySite0.setPatient((Reference) null);
    }

    @Test
    public void test6() throws Throwable {
        BodySite bodySite0 = new BodySite();
        Reference reference0 = bodySite0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test7() throws Throwable {
        BodySite bodySite0 = new BodySite();
        bodySite0.setCode((CodeableConcept) null);
    }

    @Test
    public void test8() throws Throwable {
        BodySite bodySite0 = new BodySite();
        String string0 = bodySite0.getDescription();
        assertNull(string0);
    }
}
