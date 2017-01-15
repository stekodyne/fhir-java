package com.csra.jackson.serializer;

import com.csra.fhir.Boolean;
import com.csra.fhir.MedicationOrderStatus;
import com.csra.fhir.MedicationOrderStatusList;
import com.csra.jackson.module.FhirBooleanModule;
import com.csra.jackson.module.FhirMedicationOrderStatusModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirMedicationOrderStatusSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new FhirMedicationOrderStatusModule());
    }

    @Test
    public void serialize() throws Exception {
        MedicationOrderStatus input = new MedicationOrderStatus();

        input.setValue(MedicationOrderStatusList.COMPLETED);
        assertEquals("\"completed\"", objectMapper.writeValueAsString(input));
    }

}