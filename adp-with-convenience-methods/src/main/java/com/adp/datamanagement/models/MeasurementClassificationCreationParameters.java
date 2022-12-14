// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MeasurementClassification resource creation parameters. */
@Immutable
public final class MeasurementClassificationCreationParameters {
    /*
     * Classification schema name.
     */
    @JsonProperty(value = "schemaName", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String schemaName;

    /*
     * Classification object model (JSON as string)
     */
    @JsonProperty(value = "classificationObject", required = true)
    private String classificationObject;

    /**
     * Creates an instance of MeasurementClassificationCreationParameters class.
     *
     * @param classificationObject the classificationObject value to set.
     */
    @JsonCreator
    public MeasurementClassificationCreationParameters(
            @JsonProperty(value = "classificationObject", required = true) String classificationObject) {
        this.classificationObject = classificationObject;
    }

    /**
     * Get the schemaName property: Classification schema name.
     *
     * @return the schemaName value.
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * Get the classificationObject property: Classification object model (JSON as string).
     *
     * @return the classificationObject value.
     */
    public String getClassificationObject() {
        return this.classificationObject;
    }
}
