# FHIR Java

Java classes based off of the HL7 FHIR DSTU2 specification

## Java Classes Generation

```
cd <project-root>/src/main/resources/fhir-all-xsd
xjc.exe -XautoNameResolution -d ../../java -p com.csra.fhir -b binding.xjb fhir-all.xsd
```

## Local Install

Will compile and install the .jar into you local Maven repository.

```
cd <project-root>
mvn clean install
```
