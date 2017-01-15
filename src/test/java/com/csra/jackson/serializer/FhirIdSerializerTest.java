package com.csra.jackson.serializer;

import com.csra.fhir.Id;
import com.csra.jackson.module.FhirIdModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirIdSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new FhirIdModule());
    }

    @Test
    public void serialize() throws Exception {
        Id input = new Id();
        input.setValue("true");

        assertEquals("\"true\"", objectMapper.writeValueAsString(input));
    }

}