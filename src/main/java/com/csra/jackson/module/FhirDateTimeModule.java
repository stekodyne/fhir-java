package com.csra.jackson.module;

import com.csra.jackson.serializer.FhirDateTimeSerializer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirDateTimeModule extends SimpleModule {
    private static final String NAME = "FhirDateTimeModule";
    private static final VersionUtil VERSION_UTIL = new VersionUtil() {};

    public FhirDateTimeModule() {
        super(NAME, VERSION_UTIL.version());
        addSerializer(com.csra.fhir.DateTime.class, new FhirDateTimeSerializer());
    }
}
