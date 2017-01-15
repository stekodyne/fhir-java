package com.csra.jackson.module;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirStringModuleTest {

    private ObjectMapper objectMapper;

    @Test
    public void testRegisteringModule() {
        this.objectMapper = new ObjectMapper();
        FhirStringModule module = new FhirStringModule();
        assertNotNull(module);
        objectMapper.registerModule(module);
    }

}