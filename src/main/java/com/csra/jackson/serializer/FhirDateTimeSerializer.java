package com.csra.jackson.serializer;

import com.csra.fhir.DateTime;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirDateTimeSerializer extends StdSerializer<DateTime> {

    public FhirDateTimeSerializer() {
        this(null);
    }

    public FhirDateTimeSerializer(Class<DateTime> input) {
        super(input);
    }

    @Override
    public void serialize(DateTime input, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(input.getValue());
    }
}
