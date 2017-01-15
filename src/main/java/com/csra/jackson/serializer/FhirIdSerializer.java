package com.csra.jackson.serializer;

import com.csra.fhir.Id;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirIdSerializer extends StdSerializer<Id> {

    public FhirIdSerializer() {
        this(null);
    }

    public FhirIdSerializer(Class<Id> input) {
        super(input);
    }

    @Override
    public void serialize(Id input, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(input.getValue());
    }
}
