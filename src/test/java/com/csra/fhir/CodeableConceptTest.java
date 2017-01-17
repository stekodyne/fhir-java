/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:15:06 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class CodeableConceptTest {

    @Test
    public void test0() throws Throwable {
        CodeableConcept codeableConcept0 = new CodeableConcept();
        java.util.List<Coding> list0 = codeableConcept0.getCoding();
        java.util.List<Coding> list1 = codeableConcept0.getCoding();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        CodeableConcept codeableConcept0 = new CodeableConcept();
        String string0 = codeableConcept0.getText();
        assertNull(string0);
    }

    @Test
    public void test2() throws Throwable {
        CodeableConcept codeableConcept0 = new CodeableConcept();
        codeableConcept0.setText((String) null);
        assertNull(codeableConcept0.getId());
    }
}
