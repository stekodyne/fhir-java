/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:18:02 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class HealthcareServiceAvailableTimeTest {

    @Test
    public void test0() throws Throwable {
        HealthcareServiceAvailableTime healthcareServiceAvailableTime0 = new HealthcareServiceAvailableTime();
        java.util.List<DaysOfWeek> list0 = healthcareServiceAvailableTime0.getDaysOfWeek();
        java.util.List<DaysOfWeek> list1 = healthcareServiceAvailableTime0.getDaysOfWeek();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        HealthcareServiceAvailableTime healthcareServiceAvailableTime0 = new HealthcareServiceAvailableTime();
        healthcareServiceAvailableTime0.setAvailableStartTime((Time) null);
        assertNull(healthcareServiceAvailableTime0.getId());
    }

    @Test
    public void test2() throws Throwable {
        HealthcareServiceAvailableTime healthcareServiceAvailableTime0 = new HealthcareServiceAvailableTime();
        healthcareServiceAvailableTime0.setAllDay((Boolean) null);
        assertNull(healthcareServiceAvailableTime0.getId());
    }

    @Test
    public void test3() throws Throwable {
        HealthcareServiceAvailableTime healthcareServiceAvailableTime0 = new HealthcareServiceAvailableTime();
        Boolean boolean0 = healthcareServiceAvailableTime0.getAllDay();
        assertNull(boolean0);
    }

    @Test
    public void test4() throws Throwable {
        HealthcareServiceAvailableTime healthcareServiceAvailableTime0 = new HealthcareServiceAvailableTime();
        Time time0 = healthcareServiceAvailableTime0.getAvailableStartTime();
        assertNull(time0);
    }

    @Test
    public void test5() throws Throwable {
        HealthcareServiceAvailableTime healthcareServiceAvailableTime0 = new HealthcareServiceAvailableTime();
        Time time0 = healthcareServiceAvailableTime0.getAvailableEndTime();
        assertNull(time0);
    }

    @Test
    public void test6() throws Throwable {
        HealthcareServiceAvailableTime healthcareServiceAvailableTime0 = new HealthcareServiceAvailableTime();
        healthcareServiceAvailableTime0.setAvailableEndTime((Time) null);
    }
}
