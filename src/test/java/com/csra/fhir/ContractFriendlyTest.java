/*
 * This file was created by Steffen Kory
 * Tue Jan 17 01:00:41 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ContractFriendlyTest {

    @Test
    public void test0() throws Throwable {
        ContractFriendly contractFriendly0 = new ContractFriendly();
        contractFriendly0.setContentAttachmentOrContentReference(contractFriendly0);
        ContractFriendly contractFriendly1 = (ContractFriendly) contractFriendly0.getContentAttachmentOrContentReference();
        assertSame(contractFriendly1, contractFriendly0);
    }

    @Test
    public void test1() throws Throwable {
        ContractFriendly contractFriendly0 = new ContractFriendly();
        Element element0 = contractFriendly0.getContentAttachmentOrContentReference();
        assertNull(element0);
    }
}
