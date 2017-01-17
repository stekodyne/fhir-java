/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:07:38 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class StructureDefinitionContactTest {

    @Test
    public void test0() throws Throwable {
        StructureDefinitionContact structureDefinitionContact0 = new StructureDefinitionContact();
        java.util.List<ContactPoint> list0 = structureDefinitionContact0.getTelecom();
        java.util.List<ContactPoint> list1 = structureDefinitionContact0.getTelecom();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        StructureDefinitionContact structureDefinitionContact0 = new StructureDefinitionContact();
        String string0 = structureDefinitionContact0.getName();
        assertNull(string0);
    }

    @Test
    public void test2() throws Throwable {
        StructureDefinitionContact structureDefinitionContact0 = new StructureDefinitionContact();
        structureDefinitionContact0.setName((String) null);
        assertNull(structureDefinitionContact0.getId());
    }
}
