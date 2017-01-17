/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:20:40 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ElementDefinitionTypeTest {

    @Test
    public void test0() throws Throwable {
        ElementDefinitionType elementDefinitionType0 = new ElementDefinitionType();
        java.util.List<AggregationMode> list0 = elementDefinitionType0.getAggregation();
        java.util.List<AggregationMode> list1 = elementDefinitionType0.getAggregation();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ElementDefinitionType elementDefinitionType0 = new ElementDefinitionType();
        java.util.List<Uri> list0 = elementDefinitionType0.getProfile();
        java.util.List<Uri> list1 = elementDefinitionType0.getProfile();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        ElementDefinitionType elementDefinitionType0 = new ElementDefinitionType();
        Code code0 = elementDefinitionType0.getCode();
        assertNull(code0);
    }

    @Test
    public void test3() throws Throwable {
        ElementDefinitionType elementDefinitionType0 = new ElementDefinitionType();
        elementDefinitionType0.setCode((Code) null);
        assertNull(elementDefinitionType0.getId());
    }
}
