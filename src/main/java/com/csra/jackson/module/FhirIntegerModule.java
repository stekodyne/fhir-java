package com.csra.jackson.module;

import com.csra.jackson.serializer.FhirIntegerSerializer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirIntegerModule extends SimpleModule {
    private static final String NAME = "FhirIntegerModule";
    private static final VersionUtil VERSION_UTIL = new VersionUtil() {};

    public FhirIntegerModule() {
        super(NAME, VERSION_UTIL.version());
        addSerializer(com.csra.fhir.Integer.class, new FhirIntegerSerializer());
    }
}
