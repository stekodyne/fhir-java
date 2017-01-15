package com.csra.jackson.serializer;

import com.csra.fhir.Boolean;
import com.csra.jackson.module.FhirBooleanModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirBooleanSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new FhirBooleanModule());
    }

    @Test
    public void serialize() throws Exception {
        Boolean input = new Boolean();
        input.setValue(true);

        assertEquals("true", objectMapper.writeValueAsString(input));
    }

}