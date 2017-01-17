/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:45:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SignatureTest {

    @Test
    public void test0() throws Throwable {
        Signature signature0 = new Signature();
        java.util.List<Coding> list0 = signature0.getType();
        java.util.List<Coding> list1 = signature0.getType();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        Signature signature0 = new Signature();
        signature0.setWhoUriOrWhoReference(signature0);
        Signature signature1 = (Signature) signature0.getWhoUriOrWhoReference();
        assertSame(signature0, signature1);
    }

    @Test
    public void test2() throws Throwable {
        Signature signature0 = new Signature();
        Instant instant0 = signature0.getWhen();
        assertNull(instant0);
    }

    @Test
    public void test3() throws Throwable {
        Signature signature0 = new Signature();
        Signature signature1 = (Signature) signature0.getWhoUriOrWhoReference();
        assertNull(signature1);
    }

    @Test
    public void test4() throws Throwable {
        Signature signature0 = new Signature();
        signature0.setWhen((Instant) null);
        assertNull(signature0.getId());
    }

    @Test
    public void test5() throws Throwable {
        Signature signature0 = new Signature();
        Code code0 = signature0.getContentType();
        assertNull(code0);
    }

    @Test
    public void test6() throws Throwable {
        Signature signature0 = new Signature();
        signature0.setContentType((Code) null);
        assertNull(signature0.getId());
    }

    @Test
    public void test7() throws Throwable {
        Signature signature0 = new Signature();
        Base64Binary base64Binary0 = signature0.getBlob();
        assertNull(base64Binary0);
    }

    @Test
    public void test8() throws Throwable {
        Signature signature0 = new Signature();
        signature0.setBlob((Base64Binary) null);
        assertNull(signature0.getId());
    }
}
