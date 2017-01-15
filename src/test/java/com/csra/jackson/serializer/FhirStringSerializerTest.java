package com.csra.jackson.serializer;

import com.csra.fhir.String;
import com.csra.jackson.module.FhirStringModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirStringSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new FhirStringModule());
    }

    @Test
    public void serialize() throws Exception {
        String input = new String();
        input.setValue("true");

        assertEquals("\"true\"", objectMapper.writeValueAsString(input));
    }

}