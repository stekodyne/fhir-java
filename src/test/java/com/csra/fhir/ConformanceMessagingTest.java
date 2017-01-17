/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:20:16 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConformanceMessagingTest {

    @Test
    public void test0() throws Throwable {
        ConformanceMessaging conformanceMessaging0 = new ConformanceMessaging();
        java.util.List<ConformanceEvent> list0 = conformanceMessaging0.getEvent();
        java.util.List<ConformanceEvent> list1 = conformanceMessaging0.getEvent();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ConformanceMessaging conformanceMessaging0 = new ConformanceMessaging();
        java.util.List<ConformanceEndpoint> list0 = conformanceMessaging0.getEndpoint();
        java.util.List<ConformanceEndpoint> list1 = conformanceMessaging0.getEndpoint();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        ConformanceMessaging conformanceMessaging0 = new ConformanceMessaging();
        conformanceMessaging0.setReliableCache((UnsignedInt) null);
        assertNull(conformanceMessaging0.getId());
    }

    @Test
    public void test3() throws Throwable {
        ConformanceMessaging conformanceMessaging0 = new ConformanceMessaging();
        UnsignedInt unsignedInt0 = conformanceMessaging0.getReliableCache();
        assertNull(unsignedInt0);
    }

    @Test
    public void test4() throws Throwable {
        ConformanceMessaging conformanceMessaging0 = new ConformanceMessaging();
        conformanceMessaging0.setDocumentation((String) null);
        assertNull(conformanceMessaging0.getId());
    }

    @Test
    public void test5() throws Throwable {
        ConformanceMessaging conformanceMessaging0 = new ConformanceMessaging();
        conformanceMessaging0.getDocumentation();
    }
}
