module com.adp.datamanagement {
    requires transitive com.azure.core;

    exports com.adp.datamanagement;
    exports com.adp.datamanagement.models;

    opens com.adp.datamanagement.implementation.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
    opens com.adp.datamanagement.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
}
