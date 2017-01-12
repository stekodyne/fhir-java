package com.csra.jackson.module;

import com.csra.jackson.serializer.FhirCodeSerializer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirCodeModule extends SimpleModule {
    private static final String NAME = "FhirStringModule";
    private static final VersionUtil VERSION_UTIL = new VersionUtil() {};

    public FhirCodeModule() {
        super(NAME, VERSION_UTIL.version());
        addSerializer(com.csra.fhir.Code.class, new FhirCodeSerializer());
    }
}
