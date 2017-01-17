/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:51:16 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class TimingTest {

    @Test
    public void test0() throws Throwable {
        Timing timing0 = new Timing();
        java.util.List<DateTime> list0 = timing0.getEvent();
        java.util.List<DateTime> list1 = timing0.getEvent();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        Timing timing0 = new Timing();
        timing0.setRepeat((TimingRepeat) null);
        assertNull(timing0.getId());
    }

    @Test
    public void test2() throws Throwable {
        Timing timing0 = new Timing();
        CodeableConcept codeableConcept0 = timing0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test3() throws Throwable {
        Timing timing0 = new Timing();
        TimingRepeat timingRepeat0 = timing0.getRepeat();
        assertNull(timingRepeat0);
    }

    @Test
    public void test4() throws Throwable {
        Timing timing0 = new Timing();
        timing0.setCode((CodeableConcept) null);
        assertNull(timing0.getId());
    }
}
