// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Data stream search by tags parameters. */
@Immutable
public final class FindDataStreamByTagsRequestParameters {
    /*
     * The list of tags to search for
     */
    @JsonProperty(value = "tags", required = true)
    private Map<String, String> tags;

    /**
     * Creates an instance of FindDataStreamByTagsRequestParameters class.
     *
     * @param tags the tags value to set.
     */
    @JsonCreator
    public FindDataStreamByTagsRequestParameters(
            @JsonProperty(value = "tags", required = true) Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * Get the tags property: The list of tags to search for.
     *
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }
}
