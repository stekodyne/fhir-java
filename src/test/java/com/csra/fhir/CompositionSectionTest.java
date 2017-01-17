/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:35:41 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class CompositionSectionTest {

    @Test
    public void test00() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        java.util.List<CompositionSection> list0 = compositionSection0.getSection();
        java.util.List<CompositionSection> list1 = compositionSection0.getSection();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        java.util.List<Reference> list0 = compositionSection0.getEntry();
        java.util.List<Reference> list1 = compositionSection0.getEntry();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        CodeableConcept codeableConcept0 = compositionSection0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test03() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        String string0 = compositionSection0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test04() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        compositionSection0.setTitle((String) null);
        assertNull(compositionSection0.getId());
    }

    @Test
    public void test05() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        compositionSection0.setEmptyReason((CodeableConcept) null);
        assertNull(compositionSection0.getId());
    }

    @Test
    public void test06() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        compositionSection0.setText((Narrative) null);
        assertNull(compositionSection0.getId());
    }

    @Test
    public void test07() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        CodeableConcept codeableConcept0 = compositionSection0.getEmptyReason();
        assertNull(codeableConcept0);
    }

    @Test
    public void test08() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        compositionSection0.setCode((CodeableConcept) null);
        assertNull(compositionSection0.getId());
    }

    @Test
    public void test09() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        compositionSection0.setMode((Code) null);
        assertNull(compositionSection0.getId());
    }

    @Test
    public void test10() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        compositionSection0.setOrderedBy((CodeableConcept) null);
        assertNull(compositionSection0.getId());
    }

    @Test
    public void test11() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        Narrative narrative0 = compositionSection0.getText();
        assertNull(narrative0);
    }

    @Test
    public void test12() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        CodeableConcept codeableConcept0 = compositionSection0.getOrderedBy();
        assertNull(codeableConcept0);
    }

    @Test
    public void test13() throws Throwable {
        CompositionSection compositionSection0 = new CompositionSection();
        compositionSection0.getMode();
    }
}
