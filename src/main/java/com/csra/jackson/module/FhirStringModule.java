package com.csra.jackson.module;

import com.csra.jackson.serializer.FhirStringSerializer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirStringModule extends SimpleModule {
    private static final String NAME = "FhirStringModule";
    private static final VersionUtil VERSION_UTIL = new VersionUtil() {};

    public FhirStringModule() {
        super(NAME, VERSION_UTIL.version());
        addSerializer(com.csra.fhir.String.class, new FhirStringSerializer());
    }
}
