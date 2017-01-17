/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:37:29 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AccountTest {

    @Test
    public void test00() throws Throwable {
        Account account0 = new Account();
        java.util.List<Identifier> list0 = account0.getIdentifier();
        java.util.List<Identifier> list1 = account0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        Account account0 = new Account();
        Reference reference0 = account0.getOwner();
        assertNull(reference0);
    }

    @Test
    public void test02() throws Throwable {
        Account account0 = new Account();
        String string0 = account0.getName();
        assertNull(string0);
    }

    @Test
    public void test03() throws Throwable {
        Account account0 = new Account();
        account0.setDescription((String) null);
    }

    @Test
    public void test04() throws Throwable {
        Account account0 = new Account();
        AccountStatus accountStatus0 = account0.getStatus();
        assertNull(accountStatus0);
    }

    @Test
    public void test05() throws Throwable {
        Account account0 = new Account();
        account0.setCoveragePeriod((Period) null);
    }

    @Test
    public void test06() throws Throwable {
        Account account0 = new Account();
        account0.setStatus((AccountStatus) null);
    }

    @Test
    public void test07() throws Throwable {
        Account account0 = new Account();
        Money money0 = account0.getBalance();
        assertNull(money0);
    }

    @Test
    public void test08() throws Throwable {
        Account account0 = new Account();
        account0.setBalance((Money) null);
    }

    @Test
    public void test09() throws Throwable {
        Account account0 = new Account();
        account0.setOwner((Reference) null);
    }

    @Test
    public void test10() throws Throwable {
        Account account0 = new Account();
        Period period0 = account0.getActivePeriod();
        assertNull(period0);
    }

    @Test
    public void test11() throws Throwable {
        Account account0 = new Account();
        CodeableConcept codeableConcept0 = account0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test12() throws Throwable {
        Account account0 = new Account();
        Period period0 = account0.getCoveragePeriod();
        assertNull(period0);
    }

    @Test
    public void test13() throws Throwable {
        Account account0 = new Account();
        account0.setType((CodeableConcept) null);
    }

    @Test
    public void test14() throws Throwable {
        Account account0 = new Account();
        account0.setCurrency((Coding) null);
    }

    @Test
    public void test15() throws Throwable {
        Account account0 = new Account();
        Coding coding0 = account0.getCurrency();
        assertNull(coding0);
    }

    @Test
    public void test16() throws Throwable {
        Account account0 = new Account();
        account0.setActivePeriod((Period) null);
    }

    @Test
    public void test17() throws Throwable {
        Account account0 = new Account();
        String string0 = account0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test18() throws Throwable {
        Account account0 = new Account();
        account0.setSubject((Reference) null);
    }

    @Test
    public void test19() throws Throwable {
        Account account0 = new Account();
        Reference reference0 = account0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test20() throws Throwable {
        Account account0 = new Account();
        account0.setName((String) null);
    }
}
