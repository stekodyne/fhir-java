package com.csra.jackson.serializer;

import com.csra.fhir.Reference;
import com.csra.fhir.String;
import com.csra.jackson.module.FhirReferenceModule;
import com.csra.jackson.module.FhirStringModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirReferenceSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new FhirStringModule());
        this.objectMapper.registerModule(new FhirReferenceModule());
    }

    @Test
    public void serialize() throws Exception {
        Reference input = new Reference();
        String display = new String();
        String reference = new String();

        display.setValue("display");
        reference.setValue("reference");
        input.setDisplay(display);
        input.setReference(reference);

        assertEquals("{\"reference\":\"reference\",\"display\":\"display\"}", objectMapper.writeValueAsString(input));
    }

}