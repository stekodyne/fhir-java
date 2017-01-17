/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:44:18 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class StructureDefinitionKindListTest {

    @Test
    public void test0() throws Throwable {
        StructureDefinitionKindList[] structureDefinitionKindListArray0 = StructureDefinitionKindList.values();
        assertNotNull(structureDefinitionKindListArray0);
    }

    @Test
    public void test1() throws Throwable {
        StructureDefinitionKindList structureDefinitionKindList0 = StructureDefinitionKindList.valueOf("DATATYPE");
        assertEquals("datatype", structureDefinitionKindList0.value());
    }

    @Test
    public void test2() throws Throwable {
        StructureDefinitionKindList structureDefinitionKindList0 = StructureDefinitionKindList.valueOf("LOGICAL");
        assertEquals("LOGICAL", structureDefinitionKindList0.name());
    }

    @Test
    public void test3() throws Throwable {
        StructureDefinitionKindList structureDefinitionKindList0 = StructureDefinitionKindList.fromValue("datatype");
        assertEquals(0, structureDefinitionKindList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            StructureDefinitionKindList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            StructureDefinitionKindList.valueOf("datatype");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.StructureDefinitionKindList.datatype
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        StructureDefinitionKindList structureDefinitionKindList0 = StructureDefinitionKindList.fromValue("resource");
        assertEquals("RESOURCE", structureDefinitionKindList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            StructureDefinitionKindList.fromValue("06zYOxq[/");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // 06zYOxq[/
            //
            assertThrownBy("com.csra.fhir.StructureDefinitionKindList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        StructureDefinitionKindList structureDefinitionKindList0 = StructureDefinitionKindList.RESOURCE;
        java.lang.String string0 = structureDefinitionKindList0.value();
        assertEquals("resource", string0);
    }
}
