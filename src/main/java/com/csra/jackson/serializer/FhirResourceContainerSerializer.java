package com.csra.jackson.serializer;

import com.csra.fhir.DomainResource;
import com.csra.fhir.Resource;
import com.csra.fhir.ResourceContainer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirResourceContainerSerializer extends StdSerializer<ResourceContainer> {

    public FhirResourceContainerSerializer() {
        this(null);
    }

    public FhirResourceContainerSerializer(Class<ResourceContainer> input) {
        super(input);
    }

    @Override
    public void serialize(ResourceContainer input, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        DomainResource domainResource = null;

        if (input.getPatient() != null) {
            domainResource = input.getPatient();
        } else if (input.getMedicationOrder() != null) {
            domainResource = input.getMedicationOrder();
        } else {

        }

        if (domainResource != null) {
            jsonGenerator.writeStartObject();
            JavaType javaType = serializerProvider.constructType(domainResource.getClass());
            BeanDescription beanDescription = serializerProvider.getConfig().introspect(javaType);
            JsonSerializer<Object> serializer = BeanSerializerFactory.instance.findBeanSerializer(serializerProvider,
                    javaType,
                    beanDescription);
            serializer.unwrappingSerializer(null).serialize(domainResource, jsonGenerator, serializerProvider);
            jsonGenerator.writeStringField("resourceType", domainResource.getClass().getSimpleName());
            jsonGenerator.writeEndObject();

        } else {
            jsonGenerator.writeNull();
        }
    }
}
