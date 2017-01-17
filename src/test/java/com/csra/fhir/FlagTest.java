/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:36:00 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class FlagTest {

    @Test
    public void test00() throws Throwable {
        Flag flag0 = new Flag();
        java.util.List<Identifier> list0 = flag0.getIdentifier();
        java.util.List<Identifier> list1 = flag0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        Flag flag0 = new Flag();
        CodeableConcept codeableConcept0 = flag0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test02() throws Throwable {
        Flag flag0 = new Flag();
        flag0.setAuthor((Reference) null);
    }

    @Test
    public void test03() throws Throwable {
        Flag flag0 = new Flag();
        Period period0 = flag0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test04() throws Throwable {
        Flag flag0 = new Flag();
        CodeableConcept codeableConcept0 = flag0.getCategory();
        assertNull(codeableConcept0);
    }

    @Test
    public void test05() throws Throwable {
        Flag flag0 = new Flag();
        FlagStatus flagStatus0 = flag0.getStatus();
        assertNull(flagStatus0);
    }

    @Test
    public void test06() throws Throwable {
        Flag flag0 = new Flag();
        flag0.setSubject((Reference) null);
    }

    @Test
    public void test07() throws Throwable {
        Flag flag0 = new Flag();
        Reference reference0 = flag0.getAuthor();
        assertNull(reference0);
    }

    @Test
    public void test08() throws Throwable {
        Flag flag0 = new Flag();
        Reference reference0 = flag0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test09() throws Throwable {
        Flag flag0 = new Flag();
        flag0.setStatus((FlagStatus) null);
    }

    @Test
    public void test10() throws Throwable {
        Flag flag0 = new Flag();
        flag0.setEncounter((Reference) null);
    }

    @Test
    public void test11() throws Throwable {
        Flag flag0 = new Flag();
        Reference reference0 = flag0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test12() throws Throwable {
        Flag flag0 = new Flag();
        flag0.setPeriod((Period) null);
    }

    @Test
    public void test13() throws Throwable {
        Flag flag0 = new Flag();
        flag0.setCode((CodeableConcept) null);
    }

    @Test
    public void test14() throws Throwable {
        Flag flag0 = new Flag();
        flag0.setCategory((CodeableConcept) null);
    }
}
