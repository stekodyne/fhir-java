/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:26:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class StructureDefinitionTest {

    @Test
    public void test00() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        StructureDefinitionDifferential structureDefinitionDifferential0 = new StructureDefinitionDifferential();
        structureDefinition0.setDifferential(structureDefinitionDifferential0);
        assertNull(structureDefinitionDifferential0.getId());
    }

    @Test
    public void test01() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        StructureDefinitionSnapshot structureDefinitionSnapshot0 = new StructureDefinitionSnapshot();
        structureDefinition0.setSnapshot(structureDefinitionSnapshot0);
        assertNull(structureDefinitionSnapshot0.getId());
    }

    @Test
    public void test02() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Uri uri0 = new Uri();
        structureDefinition0.setBase(uri0);
        assertNull(uri0.getId());
    }

    @Test
    public void test03() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Boolean boolean0 = new Boolean();
        structureDefinition0.setAbstract(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test04() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Boolean boolean0 = new Boolean();
        structureDefinition0.experimental = boolean0;
        Boolean boolean1 = structureDefinition0.getAbstract();
        assertNull(boolean1);
    }

    @Test
    public void test05() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Code code0 = new Code();
        structureDefinition0.setLanguage(code0);
        Code code1 = structureDefinition0.getConstrainedType();
        assertNull(code1);
    }

    @Test
    public void test06() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = new String();
        structureDefinition0.publisher = string0;
        String string1 = structureDefinition0.getDescription();
        assertNull(string1);
    }

    @Test
    public void test07() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        DateTime dateTime0 = new DateTime();
        structureDefinition0.setDate(dateTime0);
        assertNull(dateTime0.getValue());
    }

    @Test
    public void test08() throws Throwable {
        String string0 = new String();
        StructureDefinition structureDefinition0 = new StructureDefinition();
        structureDefinition0.setVersion(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test09() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Uri uri0 = new Uri();
        structureDefinition0.setUrl(uri0);
        assertNull(uri0.getValue());
    }

    @Test
    public void test10() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        StructureDefinitionKind structureDefinitionKind0 = new StructureDefinitionKind();
        structureDefinition0.kind = structureDefinitionKind0;
        StructureDefinitionKind structureDefinitionKind1 = structureDefinition0.getKind();
        assertSame(structureDefinitionKind1, structureDefinitionKind0);
    }

    @Test
    public void test11() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Id id0 = new Id();
        structureDefinition0.setFhirVersion(id0);
        Id id1 = structureDefinition0.getFhirVersion();
        assertSame(id1, id0);
    }

    @Test
    public void test12() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Boolean boolean0 = new Boolean();
        structureDefinition0.experimental = boolean0;
        Boolean boolean1 = structureDefinition0.getExperimental();
        assertSame(boolean1, boolean0);
    }

    @Test
    public void test13() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        LinkedList<StructureDefinitionContact> linkedList0 = new LinkedList<StructureDefinitionContact>();
        structureDefinition0.contact = (java.util.List<StructureDefinitionContact>) linkedList0;
        StructureDefinitionContact structureDefinitionContact0 = new StructureDefinitionContact();
        linkedList0.add(structureDefinitionContact0);
        java.util.List<StructureDefinitionContact> list0 = structureDefinition0.getContact();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test14() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        java.util.List<String> list0 = structureDefinition0.getContext();
        java.util.List<String> list1 = structureDefinition0.getContext();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test15() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        java.util.List<StructureDefinitionMapping> list0 = structureDefinition0.getMapping();
        java.util.List<StructureDefinitionMapping> list1 = structureDefinition0.getMapping();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test16() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        java.util.List<Coding> list0 = structureDefinition0.getCode();
        java.util.List<Coding> list1 = structureDefinition0.getCode();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test17() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        java.util.List<CodeableConcept> list0 = structureDefinition0.getUseContext();
        java.util.List<CodeableConcept> list1 = structureDefinition0.getUseContext();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test18() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        java.util.List<StructureDefinitionContact> list0 = structureDefinition0.getContact();
        assertEquals(0, list0.size());
    }

    @Test
    public void test19() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        java.util.List<Identifier> list0 = structureDefinition0.getIdentifier();
        java.util.List<Identifier> list1 = structureDefinition0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test20() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        StructureDefinitionDifferential structureDefinitionDifferential0 = structureDefinition0.getDifferential();
        assertNull(structureDefinitionDifferential0);
    }

    @Test
    public void test21() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = structureDefinition0.getPublisher();
        assertNull(string0);
    }

    @Test
    public void test22() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        StructureDefinitionKind structureDefinitionKind0 = new StructureDefinitionKind();
        structureDefinition0.setKind(structureDefinitionKind0);
        assertNull(structureDefinitionKind0.getValue());
    }

    @Test
    public void test23() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = new String();
        structureDefinition0.setDescription(string0);
        String string1 = structureDefinition0.getVersion();
        assertNull(string1);
    }

    @Test
    public void test24() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Uri uri0 = structureDefinition0.getBase();
        assertNull(uri0);
    }

    @Test
    public void test25() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Boolean boolean0 = new Boolean();
        structureDefinition0.setExperimental(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test26() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = new String();
        structureDefinition0.setDisplay(string0);
        String string1 = structureDefinition0.getVersion();
        assertNull(string1);
    }

    @Test
    public void test27() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = structureDefinition0.getDisplay();
        assertNull(string0);
    }

    @Test
    public void test28() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        StructureDefinitionKind structureDefinitionKind0 = structureDefinition0.getKind();
        assertNull(structureDefinitionKind0);
    }

    @Test
    public void test29() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        ExtensionContext extensionContext0 = structureDefinition0.getContextType();
        assertNull(extensionContext0);
    }

    @Test
    public void test30() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = new String();
        structureDefinition0.setPublisher(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test31() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = new String();
        structureDefinition0.setName(string0);
        String string1 = structureDefinition0.getName();
        assertNull(string1.getId());
    }

    @Test
    public void test32() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        StructureDefinitionSnapshot structureDefinitionSnapshot0 = structureDefinition0.getSnapshot();
        assertNull(structureDefinitionSnapshot0);
    }

    @Test
    public void test33() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Code code0 = structureDefinition0.getStatus();
        assertNull(code0);
    }

    @Test
    public void test34() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        DateTime dateTime0 = structureDefinition0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test35() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Code code0 = new Code();
        structureDefinition0.setStatus(code0);
        Code code1 = structureDefinition0.getStatus();
        assertNull(code1.getId());
    }

    @Test
    public void test36() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Code code0 = new Code();
        structureDefinition0.setConstrainedType(code0);
        assertNull(code0.getValue());
    }

    @Test
    public void test37() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = structureDefinition0.getCopyright();
        assertNull(string0);
    }

    @Test
    public void test38() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = structureDefinition0.getRequirements();
        assertNull(string0);
    }

    @Test
    public void test39() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = structureDefinition0.getName();
        assertNull(string0);
    }

    @Test
    public void test40() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Uri uri0 = structureDefinition0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test41() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        ExtensionContext extensionContext0 = new ExtensionContext();
        structureDefinition0.setContextType(extensionContext0);
        ExtensionContext extensionContext1 = structureDefinition0.getContextType();
        assertNull(extensionContext1.getValue());
    }

    @Test
    public void test42() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Boolean boolean0 = structureDefinition0.getExperimental();
        assertNull(boolean0);
    }

    @Test
    public void test43() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = new String();
        structureDefinition0.setCopyright(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test44() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        Id id0 = structureDefinition0.getFhirVersion();
        assertNull(id0);
    }

    @Test
    public void test45() throws Throwable {
        StructureDefinition structureDefinition0 = new StructureDefinition();
        String string0 = new String();
        structureDefinition0.setRequirements(string0);
        assertNull(string0.getId());
    }
}
