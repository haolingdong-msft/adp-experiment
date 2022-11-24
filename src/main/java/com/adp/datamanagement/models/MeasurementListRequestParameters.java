// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A wrapper for the List of measurements IDs. */
@Immutable
public final class MeasurementListRequestParameters {
    /*
     * The measurement IDs list
     */
    @JsonProperty(value = "measurementIds", required = true)
    private List<String> measurementIds;

    /**
     * Creates an instance of MeasurementListRequestParameters class.
     *
     * @param measurementIds the measurementIds value to set.
     */
    @JsonCreator
    public MeasurementListRequestParameters(
            @JsonProperty(value = "measurementIds", required = true) List<String> measurementIds) {
        this.measurementIds = measurementIds;
    }

    /**
     * Get the measurementIds property: The measurement IDs list.
     *
     * @return the measurementIds value.
     */
    public List<String> getMeasurementIds() {
        return this.measurementIds;
    }
}