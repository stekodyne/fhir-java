/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:19:55 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ElementDefinitionTest {

    @Test
    public void test00() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionBinding elementDefinitionBinding0 = new ElementDefinitionBinding();
        elementDefinition0.setBinding(elementDefinitionBinding0);
        assertNull(elementDefinitionBinding0.getId());
    }

    @Test
    public void test01() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Boolean boolean0 = new Boolean();
        elementDefinition0.setMustSupport(boolean0);
        Boolean boolean1 = elementDefinition0.getIsSummary();
        assertNull(boolean1);
    }

    @Test
    public void test02() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Boolean boolean0 = new Boolean();
        elementDefinition0.setIsModifier(boolean0);
        assertNull(elementDefinition0.getId());
    }

    @Test
    public void test03() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Boolean boolean0 = new Boolean();
        elementDefinition0.setExampleBooleanOrExampleIntegerOrExampleDecimal(boolean0);
        Boolean boolean1 = (Boolean) elementDefinition0.getMinValueBooleanOrMinValueIntegerOrMinValueDecimal();
        assertNull(boolean1);
    }

    @Test
    public void test04() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionConstraint elementDefinitionConstraint0 = new ElementDefinitionConstraint();
        elementDefinition0.patternBooleanOrPatternIntegerOrPatternDecimal = (Element) elementDefinitionConstraint0;
        ElementDefinitionConstraint elementDefinitionConstraint1 = (ElementDefinitionConstraint) elementDefinition0.getMinValueBooleanOrMinValueIntegerOrMinValueDecimal();
        assertNull(elementDefinitionConstraint1);
    }

    @Test
    public void test05() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionBinding elementDefinitionBinding0 = new ElementDefinitionBinding();
        elementDefinition0.setDefaultValueBooleanOrDefaultValueIntegerOrDefaultValueDecimal(elementDefinitionBinding0);
        ElementDefinitionBinding elementDefinitionBinding1 = (ElementDefinitionBinding) elementDefinition0.getMinValueBooleanOrMinValueIntegerOrMinValueDecimal();
        assertNull(elementDefinitionBinding1);
    }

    @Test
    public void test06() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        elementDefinition0.setPatternBooleanOrPatternIntegerOrPatternDecimal(elementDefinition0);
        ElementDefinition elementDefinition1 = (ElementDefinition) elementDefinition0.getExampleBooleanOrExampleIntegerOrExampleDecimal();
        assertNull(elementDefinition1);
    }

    @Test
    public void test07() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionBinding elementDefinitionBinding0 = new ElementDefinitionBinding();
        elementDefinition0.setDefaultValueBooleanOrDefaultValueIntegerOrDefaultValueDecimal(elementDefinitionBinding0);
        ElementDefinitionBinding elementDefinitionBinding1 = (ElementDefinitionBinding) elementDefinition0.getExampleBooleanOrExampleIntegerOrExampleDecimal();
        assertNull(elementDefinitionBinding1);
    }

    @Test
    public void test08() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionSlicing elementDefinitionSlicing0 = new ElementDefinitionSlicing();
        elementDefinition0.setMinValueBooleanOrMinValueIntegerOrMinValueDecimal(elementDefinitionSlicing0);
        ElementDefinitionSlicing elementDefinitionSlicing1 = (ElementDefinitionSlicing) elementDefinition0.getFixedBooleanOrFixedIntegerOrFixedDecimal();
        assertNull(elementDefinitionSlicing1);
    }

    @Test
    public void test09() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Boolean boolean0 = new Boolean();
        elementDefinition0.setMaxValueBooleanOrMaxValueIntegerOrMaxValueDecimal(boolean0);
        Boolean boolean1 = (Boolean) elementDefinition0.getFixedBooleanOrFixedIntegerOrFixedDecimal();
        assertNull(boolean1);
    }

    @Test
    public void test10() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = new String();
        elementDefinition0.path = string0;
        String string1 = elementDefinition0.getNameReference();
        assertNull(string1);
    }

    @Test
    public void test11() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionMapping elementDefinitionMapping0 = new ElementDefinitionMapping();
        String string0 = new String();
        elementDefinitionMapping0.map = string0;
        elementDefinition0.setName(elementDefinitionMapping0.map);
        String string1 = elementDefinition0.getNameReference();
        assertNull(string1);
    }

    @Test
    public void test12() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionBase elementDefinitionBase0 = new ElementDefinitionBase();
        elementDefinition0.setBase(elementDefinitionBase0);
        assertNull(elementDefinitionBase0.getId());
    }

    @Test
    public void test13() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = new String();
        elementDefinition0.nameReference = string0;
        String string1 = elementDefinition0.getMax();
        assertNull(string1);
    }

    @Test
    public void test14() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Markdown markdown0 = new Markdown();
        elementDefinition0.setRequirements(markdown0);
        Markdown markdown1 = elementDefinition0.getDefinition();
        assertNull(markdown1);
    }

    @Test
    public void test15() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionSlicing elementDefinitionSlicing0 = new ElementDefinitionSlicing();
        elementDefinition0.setSlicing(elementDefinitionSlicing0);
        assertNull(elementDefinitionSlicing0.getId());
    }

    @Test
    public void test16() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = new String();
        elementDefinition0.path = string0;
        String string1 = elementDefinition0.getLabel();
        assertNull(string1);
    }

    @Test
    public void test17() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionMapping elementDefinitionMapping0 = new ElementDefinitionMapping();
        String string0 = new String();
        elementDefinitionMapping0.map = string0;
        elementDefinition0.setName(elementDefinitionMapping0.map);
        String string1 = elementDefinition0.getLabel();
        assertNull(string1);
    }

    @Test
    public void test18() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = new String();
        elementDefinition0.setPath(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test19() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionSlicing elementDefinitionSlicing0 = new ElementDefinitionSlicing();
        elementDefinition0.slicing = elementDefinitionSlicing0;
        ElementDefinitionSlicing elementDefinitionSlicing1 = elementDefinition0.getSlicing();
        assertNull(elementDefinitionSlicing1.getId());
    }

    @Test
    public void test20() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        LinkedList<PropertyRepresentation> linkedList0 = new LinkedList<PropertyRepresentation>();
        elementDefinition0.representation = (java.util.List<PropertyRepresentation>) linkedList0;
        linkedList0.add((PropertyRepresentation) null);
        java.util.List<PropertyRepresentation> list0 = elementDefinition0.getRepresentation();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test21() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionType elementDefinitionType0 = new ElementDefinitionType();
        elementDefinition0.patternBooleanOrPatternIntegerOrPatternDecimal = (Element) elementDefinitionType0;
        ElementDefinitionType elementDefinitionType1 = (ElementDefinitionType) elementDefinition0.getPatternBooleanOrPatternIntegerOrPatternDecimal();
        assertNull(elementDefinitionType1.getId());
    }

    @Test
    public void test22() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionMapping elementDefinitionMapping0 = new ElementDefinitionMapping();
        String string0 = new String();
        elementDefinitionMapping0.map = string0;
        elementDefinition0.path = elementDefinitionMapping0.map;
        String string1 = elementDefinition0.getPath();
        assertSame(string1, string0);
    }

    @Test
    public void test23() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = new String();
        elementDefinition0.setName(string0);
        String string1 = elementDefinition0.getName();
        assertNull(string1.getValue());
    }

    @Test
    public void test24() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionBase elementDefinitionBase0 = new ElementDefinitionBase();
        elementDefinition0.maxValueBooleanOrMaxValueIntegerOrMaxValueDecimal = (Element) elementDefinitionBase0;
        ElementDefinitionBase elementDefinitionBase1 = (ElementDefinitionBase) elementDefinition0.getMaxValueBooleanOrMaxValueIntegerOrMaxValueDecimal();
        assertSame(elementDefinitionBase1, elementDefinitionBase0);
    }

    @Test
    public void test25() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ConstraintSeverity constraintSeverity0 = new ConstraintSeverity();
        elementDefinition0.setDefaultValueBooleanOrDefaultValueIntegerOrDefaultValueDecimal(constraintSeverity0);
        ConstraintSeverity constraintSeverity1 = (ConstraintSeverity) elementDefinition0.getDefaultValueBooleanOrDefaultValueIntegerOrDefaultValueDecimal();
        assertSame(constraintSeverity1, constraintSeverity0);
    }

    @Test
    public void test26() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        LinkedList<Id> linkedList0 = new LinkedList<Id>();
        elementDefinition0.condition = (java.util.List<Id>) linkedList0;
        Id id0 = new Id();
        linkedList0.add(id0);
        java.util.List<Id> list0 = elementDefinition0.getCondition();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test27() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionBinding elementDefinitionBinding0 = new ElementDefinitionBinding();
        elementDefinition0.binding = elementDefinitionBinding0;
        ElementDefinitionBinding elementDefinitionBinding1 = elementDefinition0.getBinding();
        assertNull(elementDefinitionBinding1.getId());
    }

    @Test
    public void test28() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        java.util.List<ElementDefinitionMapping> list0 = elementDefinition0.getMapping();
        java.util.List<ElementDefinitionMapping> list1 = elementDefinition0.getMapping();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test29() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        java.util.List<ElementDefinitionConstraint> list0 = elementDefinition0.getConstraint();
        java.util.List<ElementDefinitionConstraint> list1 = elementDefinition0.getConstraint();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test30() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        java.util.List<Id> list0 = elementDefinition0.getCondition();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test31() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        java.util.List<ElementDefinitionType> list0 = elementDefinition0.getType();
        java.util.List<ElementDefinitionType> list1 = elementDefinition0.getType();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test32() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        java.util.List<String> list0 = elementDefinition0.getAlias();
        java.util.List<String> list1 = elementDefinition0.getAlias();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test33() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        java.util.List<Coding> list0 = elementDefinition0.getCode();
        java.util.List<Coding> list1 = elementDefinition0.getCode();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test34() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        java.util.List<PropertyRepresentation> list0 = elementDefinition0.getRepresentation();
        assertEquals(0, list0.size());
    }

    @Test
    public void test35() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Markdown markdown0 = new Markdown();
        elementDefinition0.setMinValueBooleanOrMinValueIntegerOrMinValueDecimal(markdown0);
        Markdown markdown1 = (Markdown) elementDefinition0.getExampleBooleanOrExampleIntegerOrExampleDecimal();
        assertNull(markdown1);
    }

    @Test
    public void test36() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Markdown markdown0 = new Markdown();
        elementDefinition0.setRequirements(markdown0);
        Markdown markdown1 = elementDefinition0.getRequirements();
        assertNull(markdown1.getId());
    }

    @Test
    public void test37() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Integer integer0 = elementDefinition0.getMaxLength();
        assertNull(integer0);
    }

    @Test
    public void test38() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = new String();
        elementDefinition0.setNameReference(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test39() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Markdown markdown0 = new Markdown();
        elementDefinition0.setMeaningWhenMissing(markdown0);
        Markdown markdown1 = elementDefinition0.getMeaningWhenMissing();
        assertSame(markdown1, markdown0);
    }

    @Test
    public void test40() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Boolean boolean0 = new Boolean();
        elementDefinition0.setExampleBooleanOrExampleIntegerOrExampleDecimal(boolean0);
        Boolean boolean1 = (Boolean) elementDefinition0.getFixedBooleanOrFixedIntegerOrFixedDecimal();
        assertNull(boolean1);
    }

    @Test
    public void test41() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Element element0 = elementDefinition0.getMaxValueBooleanOrMaxValueIntegerOrMaxValueDecimal();
        assertNull(element0);
    }

    @Test
    public void test42() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = elementDefinition0.getName();
        assertNull(string0);
    }

    @Test
    public void test43() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Integer integer0 = elementDefinition0.getMin();
        assertNull(integer0);
    }

    @Test
    public void test44() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Boolean boolean0 = elementDefinition0.getMustSupport();
        assertNull(boolean0);
    }

    @Test
    public void test45() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Integer integer0 = new Integer();
        elementDefinition0.setMin(integer0);
        assertNull(integer0.getId());
    }

    @Test
    public void test46() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionConstraint elementDefinitionConstraint0 = new ElementDefinitionConstraint();
        elementDefinition0.setFixedBooleanOrFixedIntegerOrFixedDecimal(elementDefinitionConstraint0);
        ElementDefinitionConstraint elementDefinitionConstraint1 = (ElementDefinitionConstraint) elementDefinition0.getExampleBooleanOrExampleIntegerOrExampleDecimal();
        assertNull(elementDefinitionConstraint1);
    }

    @Test
    public void test47() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Markdown markdown0 = new Markdown();
        elementDefinition0.setComments(markdown0);
        Markdown markdown1 = elementDefinition0.getComments();
        assertSame(markdown1, markdown0);
    }

    @Test
    public void test48() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Markdown markdown0 = new Markdown();
        elementDefinition0.setDefinition(markdown0);
        assertNull(markdown0.getValue());
    }

    @Test
    public void test49() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionBinding elementDefinitionBinding0 = new ElementDefinitionBinding();
        elementDefinition0.setDefaultValueBooleanOrDefaultValueIntegerOrDefaultValueDecimal(elementDefinitionBinding0);
        ElementDefinitionBinding elementDefinitionBinding1 = (ElementDefinitionBinding) elementDefinition0.getFixedBooleanOrFixedIntegerOrFixedDecimal();
        assertNull(elementDefinitionBinding1);
    }

    @Test
    public void test50() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Markdown markdown0 = new Markdown();
        elementDefinition0.setPatternBooleanOrPatternIntegerOrPatternDecimal(markdown0);
        Markdown markdown1 = (Markdown) elementDefinition0.getFixedBooleanOrFixedIntegerOrFixedDecimal();
        assertNull(markdown1);
    }

    @Test
    public void test51() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Markdown markdown0 = elementDefinition0.getComments();
        assertNull(markdown0);
    }

    @Test
    public void test52() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Boolean boolean0 = new Boolean();
        elementDefinition0.setMustSupport(boolean0);
        Boolean boolean1 = elementDefinition0.getIsModifier();
        assertNull(boolean1);
    }

    @Test
    public void test53() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionType elementDefinitionType0 = (ElementDefinitionType) elementDefinition0.getPatternBooleanOrPatternIntegerOrPatternDecimal();
        assertNull(elementDefinitionType0);
    }

    @Test
    public void test54() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Markdown markdown0 = elementDefinition0.getRequirements();
        assertNull(markdown0);
    }

    @Test
    public void test55() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = new String();
        elementDefinition0.setShort(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test56() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        elementDefinition0.setMaxValueBooleanOrMaxValueIntegerOrMaxValueDecimal(elementDefinition0);
        ElementDefinition elementDefinition1 = (ElementDefinition) elementDefinition0.getMinValueBooleanOrMinValueIntegerOrMinValueDecimal();
        assertNull(elementDefinition1);
    }

    @Test
    public void test57() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = elementDefinition0.getPath();
        assertNull(string0);
    }

    @Test
    public void test58() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = elementDefinition0.getShort();
        assertNull(string0);
    }

    @Test
    public void test59() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Boolean boolean0 = new Boolean();
        elementDefinition0.setIsSummary(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test60() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = new String();
        elementDefinition0.setMax(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test61() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionBinding elementDefinitionBinding0 = elementDefinition0.getBinding();
        assertNull(elementDefinitionBinding0);
    }

    @Test
    public void test62() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Markdown markdown0 = elementDefinition0.getMeaningWhenMissing();
        assertNull(markdown0);
    }

    @Test
    public void test63() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionSlicing elementDefinitionSlicing0 = elementDefinition0.getSlicing();
        assertNull(elementDefinitionSlicing0);
    }

    @Test
    public void test64() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        String string0 = new String();
        elementDefinition0.setLabel(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test65() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        Integer integer0 = new Integer();
        elementDefinition0.setMaxLength(integer0);
        assertNull(integer0.getId());
    }

    @Test
    public void test66() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ConstraintSeverity constraintSeverity0 = (ConstraintSeverity) elementDefinition0.getDefaultValueBooleanOrDefaultValueIntegerOrDefaultValueDecimal();
        assertNull(constraintSeverity0);
    }

    @Test
    public void test67() throws Throwable {
        ElementDefinition elementDefinition0 = new ElementDefinition();
        ElementDefinitionBase elementDefinitionBase0 = elementDefinition0.getBase();
        assertNull(elementDefinitionBase0);
    }
}
