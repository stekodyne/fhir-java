/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:03:12 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class PropertyRepresentationListTest {

    @Test
    public void test0() throws Throwable {
        PropertyRepresentationList[] propertyRepresentationListArray0 = PropertyRepresentationList.values();
        assertNotNull(propertyRepresentationListArray0);
    }

    @Test
    public void test1() throws Throwable {
        PropertyRepresentationList propertyRepresentationList0 = PropertyRepresentationList.valueOf("XML_ATTR");
        assertEquals("XML_ATTR", propertyRepresentationList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        // Undeclared exception!
        try {
            PropertyRepresentationList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            PropertyRepresentationList.valueOf("xmlAttr");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.PropertyRepresentationList.xmlAttr
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            PropertyRepresentationList.fromValue("vmlAttr");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // vmlAttr
            //
            assertThrownBy("com.csra.fhir.PropertyRepresentationList", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        PropertyRepresentationList propertyRepresentationList0 = PropertyRepresentationList.fromValue("xmlAttr");
        assertEquals("XML_ATTR", propertyRepresentationList0.toString());
    }

    @Test
    public void test6() throws Throwable {
        PropertyRepresentationList propertyRepresentationList0 = PropertyRepresentationList.XML_ATTR;
        java.lang.String string0 = propertyRepresentationList0.value();
        assertEquals("xmlAttr", string0);
    }
}
