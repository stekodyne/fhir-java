/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:18:22 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class CompositionAttesterTest {

    @Test
    public void test0() throws Throwable {
        CompositionAttester compositionAttester0 = new CompositionAttester();
        java.util.List<CompositionAttestationMode> list0 = compositionAttester0.getMode();
        java.util.List<CompositionAttestationMode> list1 = compositionAttester0.getMode();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        CompositionAttester compositionAttester0 = new CompositionAttester();
        compositionAttester0.setTime((DateTime) null);
        assertNull(compositionAttester0.getId());
    }

    @Test
    public void test2() throws Throwable {
        CompositionAttester compositionAttester0 = new CompositionAttester();
        Reference reference0 = compositionAttester0.getParty();
        assertNull(reference0);
    }

    @Test
    public void test3() throws Throwable {
        CompositionAttester compositionAttester0 = new CompositionAttester();
        compositionAttester0.setParty((Reference) null);
        assertNull(compositionAttester0.getId());
    }

    @Test
    public void test4() throws Throwable {
        CompositionAttester compositionAttester0 = new CompositionAttester();
        DateTime dateTime0 = compositionAttester0.getTime();
        assertNull(dateTime0);
    }
}
