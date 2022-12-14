// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Measurement metadata without resource identifier. */
@Immutable
public final class MeasurementMetadataBase {
    /*
     * The measurement metadata dictionary
     */
    @JsonProperty(value = "metadata", required = true)
    private Map<String, String> metadata;

    /**
     * Creates an instance of MeasurementMetadataBase class.
     *
     * @param metadata the metadata value to set.
     */
    @JsonCreator
    private MeasurementMetadataBase(@JsonProperty(value = "metadata", required = true) Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Get the metadata property: The measurement metadata dictionary.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }
}
