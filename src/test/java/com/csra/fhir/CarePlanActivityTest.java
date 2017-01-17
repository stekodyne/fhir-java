/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:18:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class CarePlanActivityTest {

    @Test
    public void test0() throws Throwable {
        CarePlanActivity carePlanActivity0 = new CarePlanActivity();
        java.util.List<Annotation> list0 = carePlanActivity0.getProgress();
        java.util.List<Annotation> list1 = carePlanActivity0.getProgress();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        CarePlanActivity carePlanActivity0 = new CarePlanActivity();
        java.util.List<Reference> list0 = carePlanActivity0.getActionResulting();
        java.util.List<Reference> list1 = carePlanActivity0.getActionResulting();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        CarePlanActivity carePlanActivity0 = new CarePlanActivity();
        CarePlanDetail carePlanDetail0 = carePlanActivity0.getDetail();
        assertNull(carePlanDetail0);
    }

    @Test
    public void test3() throws Throwable {
        CarePlanActivity carePlanActivity0 = new CarePlanActivity();
        carePlanActivity0.setDetail((CarePlanDetail) null);
        assertNull(carePlanActivity0.getId());
    }

    @Test
    public void test4() throws Throwable {
        CarePlanActivity carePlanActivity0 = new CarePlanActivity();
        carePlanActivity0.setReference((Reference) null);
        assertNull(carePlanActivity0.getId());
    }

    @Test
    public void test5() throws Throwable {
        CarePlanActivity carePlanActivity0 = new CarePlanActivity();
        carePlanActivity0.getReference();
    }
}
