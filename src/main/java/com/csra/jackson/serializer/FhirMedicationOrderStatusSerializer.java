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

    public FhirMedicationOrderStatusSerializer(Class<MedicationOrderStatus> status) {
        super(status);
    }

    @Override
    public void serialize(MedicationOrderStatus status, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (status.getValue() != null) {
            jsonGenerator.writeString(status.getValue().value());
        } else {
            jsonGenerator.writeNull();
        }
    }
}
