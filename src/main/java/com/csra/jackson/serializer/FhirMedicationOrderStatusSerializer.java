package com.csra.jackson.serializer;

import com.csra.fhir.MedicationOrderStatus;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirMedicationOrderStatusSerializer extends StdSerializer<MedicationOrderStatus> {

    public FhirMedicationOrderStatusSerializer() {
        this(null);
    }

    public FhirMedicationOrderStatusSerializer(Class<MedicationOrderStatus> input) {
        super(input);
    }

    @Override
    public void serialize(MedicationOrderStatus input, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (input.getValue() != null) {
            jsonGenerator.writeString(input.getValue().value());
        } else {
            jsonGenerator.writeNull();
        }
    }
}
