/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:16:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class EpisodeOfCareStatusListTest {

    @Test
    public void test0() throws Throwable {
        EpisodeOfCareStatusList[] episodeOfCareStatusListArray0 = EpisodeOfCareStatusList.values();
        assertNotNull(episodeOfCareStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        EpisodeOfCareStatusList episodeOfCareStatusList0 = EpisodeOfCareStatusList.valueOf("PLANNED");
        assertEquals(EpisodeOfCareStatusList.PLANNED, episodeOfCareStatusList0);
    }

    @Test
    public void test2() throws Throwable {
        EpisodeOfCareStatusList episodeOfCareStatusList0 = EpisodeOfCareStatusList.valueOf("CANCELLED");
        assertEquals("CANCELLED", episodeOfCareStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        EpisodeOfCareStatusList episodeOfCareStatusList0 = EpisodeOfCareStatusList.fromValue("active");
        assertEquals("ACTIVE", episodeOfCareStatusList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            EpisodeOfCareStatusList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            EpisodeOfCareStatusList.valueOf(" 4N0*+Q2W!')");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.EpisodeOfCareStatusList. 4N0*+Q2W!')
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        EpisodeOfCareStatusList episodeOfCareStatusList0 = EpisodeOfCareStatusList.fromValue("planned");
        assertEquals(0, episodeOfCareStatusList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            EpisodeOfCareStatusList.fromValue("CANCELLED");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // CANCELLED
            //
            assertThrownBy("com.csra.fhir.EpisodeOfCareStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        EpisodeOfCareStatusList episodeOfCareStatusList0 = EpisodeOfCareStatusList.ACTIVE;
        java.lang.String string0 = episodeOfCareStatusList0.value();
        assertEquals("active", string0);
    }
}
