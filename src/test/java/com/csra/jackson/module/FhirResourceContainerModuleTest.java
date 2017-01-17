package com.csra.jackson.module;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirResourceContainerModuleTest {

    private ObjectMapper objectMapper;

    @Test
    public void registeringModule() {
        this.objectMapper = new ObjectMapper();
        FhirResourceContainerModule module = new FhirResourceContainerModule();
        assertNotNull(module);
        objectMapper.registerModule(module);
    }

}