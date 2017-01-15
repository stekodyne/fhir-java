package com.csra.jackson.serializer;

import com.csra.fhir.HumanName;
import com.csra.fhir.Patient;
import com.csra.fhir.ResourceContainer;
import com.csra.fhir.String;
import com.csra.jackson.module.FhirResourceContainerModule;
import com.csra.jackson.module.FhirStringModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirResourceContainerSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new FhirStringModule());
        this.objectMapper.registerModule(new FhirResourceContainerModule());
    }

    @Test
    public void serialize() throws Exception {
        ResourceContainer input = new ResourceContainer();
        Patient patient = new Patient();
        HumanName name = new HumanName();
        String first = new String();
        String last = new String();

        first.setValue("Tester");
        last.setValue("McTesterson");
        name.getFamily().add(last);
        name.getGiven().add(first);
        patient.getName().add(name);
        input.setSpecificResource(patient);

        assertEquals("{\"contained\":[],\"extension\":[],\"modifierExtension\":[],\"identifier\":[],\"name\":[{\"extension\":[],\"id\":null,\"use\":null,\"text\":null,\"family\":[\"McTesterson\"],\"given\":[\"Tester\"],\"prefix\":[],\"suffix\":[],\"period\":null}],\"telecom\":[],\"address\":[],\"photo\":[],\"contact\":[],\"communication\":[],\"careProvider\":[],\"link\":[],\"resourceType\":\"class com.csra.fhir.Patient\"}", objectMapper.writeValueAsString(input));
    }

}