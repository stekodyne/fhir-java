/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:51:06 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class BasicTest {

    @Test
    public void test0() throws Throwable {
        Basic basic0 = new Basic();
        java.util.List<Identifier> list0 = basic0.getIdentifier();
        java.util.List<Identifier> list1 = basic0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        Basic basic0 = new Basic();
        Date date0 = basic0.getCreated();
        assertNull(date0);
    }

    @Test
    public void test2() throws Throwable {
        Basic basic0 = new Basic();
        basic0.setSubject((Reference) null);
    }

    @Test
    public void test3() throws Throwable {
        Basic basic0 = new Basic();
        basic0.setCode((CodeableConcept) null);
    }

    @Test
    public void test4() throws Throwable {
        Basic basic0 = new Basic();
        Reference reference0 = basic0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test5() throws Throwable {
        Basic basic0 = new Basic();
        CodeableConcept codeableConcept0 = basic0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test6() throws Throwable {
        Basic basic0 = new Basic();
        basic0.setAuthor((Reference) null);
    }

    @Test
    public void test7() throws Throwable {
        Basic basic0 = new Basic();
        basic0.setCreated((Date) null);
    }

    @Test
    public void test8() throws Throwable {
        Basic basic0 = new Basic();
        Reference reference0 = basic0.getAuthor();
        assertNull(reference0);
    }
}
