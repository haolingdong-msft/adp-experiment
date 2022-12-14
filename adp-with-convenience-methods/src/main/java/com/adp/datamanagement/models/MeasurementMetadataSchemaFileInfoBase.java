// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Measurement metadata schema file information model. */
@Immutable
public final class MeasurementMetadataSchemaFileInfoBase {
    /*
     * Measurement schema file name.
     */
    @JsonProperty(value = "schemaFileName")
    private String schemaFileName;

    /*
     * SAS signed URI for downloading the measurement metadata schema file from Azure Storage.
     * This URI expires in 24 hours.
     */
    @JsonProperty(value = "schemaFileUri", required = true)
    private String schemaFileUri;

    /**
     * Creates an instance of MeasurementMetadataSchemaFileInfoBase class.
     *
     * @param schemaFileUri the schemaFileUri value to set.
     */
    @JsonCreator
    private MeasurementMetadataSchemaFileInfoBase(
            @JsonProperty(value = "schemaFileUri", required = true) String schemaFileUri) {
        this.schemaFileUri = schemaFileUri;
    }

    /**
     * Get the schemaFileName property: Measurement schema file name.
     *
     * @return the schemaFileName value.
     */
    public String getSchemaFileName() {
        return this.schemaFileName;
    }

    /**
     * Get the schemaFileUri property: SAS signed URI for downloading the measurement metadata schema file from Azure
     * Storage. This URI expires in 24 hours.
     *
     * @return the schemaFileUri value.
     */
    public String getSchemaFileUri() {
        return this.schemaFileUri;
    }
}
