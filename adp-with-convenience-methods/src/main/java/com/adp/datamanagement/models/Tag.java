// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tag element. */
@Immutable
public final class Tag {
    /*
     * Tag identifier
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /*
     * Tag value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Creates an instance of Tag class.
     *
     * @param key the key value to set.
     * @param value the value value to set.
     */
    @JsonCreator
    public Tag(
            @JsonProperty(value = "key", required = true) String key,
            @JsonProperty(value = "value", required = true) String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Get the key property: Tag identifier.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Get the value property: Tag value.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }
}
