# fhir-java

Java classes based off of the HL7 FHIR DSTU2 specification

## Getting Started

### Java Classes Generation

```
cd <project-root>
xjc -XautoNameResolution -d src/main/java -p com.csra.fhir -b src/main/resources/fhir-all-xsd/binding.xjb src/main/resources/fhir-all-xsd/fhir-all.xsd
```

### Testing

```
mvn test
```

### Installing

Will compile and install the .jar into you local Maven repository.

```
cd <project-root>
mvn clean install
```

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags).

## Authors

* **Steffen Kory** - *Initial work* - [Stekodyne](https://github.com/Stekodyne)
