/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:43:13 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ScheduleTest {

    @Test
    public void test0() throws Throwable {
        Schedule schedule0 = new Schedule();
        java.util.List<CodeableConcept> list0 = schedule0.getType();
        java.util.List<CodeableConcept> list1 = schedule0.getType();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        Schedule schedule0 = new Schedule();
        java.util.List<Identifier> list0 = schedule0.getIdentifier();
        java.util.List<Identifier> list1 = schedule0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        Schedule schedule0 = new Schedule();
        String string0 = schedule0.getComment();
        assertNull(string0);
    }

    @Test
    public void test3() throws Throwable {
        Schedule schedule0 = new Schedule();
        Period period0 = schedule0.getPlanningHorizon();
        assertNull(period0);
    }

    @Test
    public void test4() throws Throwable {
        Schedule schedule0 = new Schedule();
        Reference reference0 = schedule0.getActor();
        assertNull(reference0);
    }

    @Test
    public void test5() throws Throwable {
        Schedule schedule0 = new Schedule();
        schedule0.setActor((Reference) null);
    }

    @Test
    public void test6() throws Throwable {
        Schedule schedule0 = new Schedule();
        schedule0.setComment((String) null);
    }

    @Test
    public void test7() throws Throwable {
        Schedule schedule0 = new Schedule();
        schedule0.setPlanningHorizon((Period) null);
    }
}
