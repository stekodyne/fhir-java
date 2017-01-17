/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:57:31 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

public class MarkdownTest {

    @Test
    public void test0() throws Throwable {
        Markdown markdown0 = new Markdown();
        markdown0.setId("");
        markdown0.id = "";
        markdown0.id = "6L2~";
        markdown0.setValue("");
        markdown0.getValue();
        Markdown markdown1 = new Markdown();
        Markdown markdown2 = new Markdown();
    }

    @Test
    public void test1() throws Throwable {
        Markdown markdown0 = new Markdown();
        markdown0.value = "zp.@BOK[e";
        markdown0.getValue();
        markdown0.setValue("zp.@BOK[e");
        markdown0.getValue();
        Markdown markdown1 = new Markdown();
        markdown0.setValue("zp.@BOK[e");
        markdown1.getExtension();
        markdown1.value = null;
        markdown1.setValue((java.lang.String) null);
        Markdown markdown2 = new Markdown();
        markdown0.setValue((java.lang.String) null);
        markdown0.value = "cW:&K";
        Markdown markdown3 = new Markdown();
        markdown1.value = "?~";
        java.lang.String string0 = markdown0.value;
        markdown3.setValue("cW:&K");
        markdown0.setValue((java.lang.String) null);
        markdown0.setValue("");
        markdown0.getValue();
        markdown0.getValue();
        Markdown markdown4 = new Markdown();
        markdown2.getValue();
    }
}
