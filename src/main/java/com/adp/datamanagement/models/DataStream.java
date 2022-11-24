// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A data-stream resource. */
@Immutable
public final class DataStream {
    /*
     * The data stream identifier
     */
    @JsonProperty(value = "dataStreamId", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String dataStreamId;

    /*
     * The endpoint uri of the owning resource
     */
    @JsonProperty(value = "resourceEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceEndpoint;

    /*
     * The data stream lineage information
     */
    @JsonProperty(value = "lineage", required = true)
    private DataStreamLineage lineage;

    /*
     * The data stream status
     */
    @JsonProperty(value = "status", required = true)
    private DataStreamStatus status;

    /*
     * The data stream type
     */
    @JsonProperty(value = "type", required = true)
    private DataStreamType type;

    /*
     * The entity tag for this resource.
     */
    @JsonProperty(value = "etag", required = true)
    private String etag;

    /**
     * Creates an instance of DataStream class.
     *
     * @param lineage the lineage value to set.
     * @param status the status value to set.
     * @param type the type value to set.
     * @param etag the etag value to set.
     */
    @JsonCreator
    private DataStream(
            @JsonProperty(value = "lineage", required = true) DataStreamLineage lineage,
            @JsonProperty(value = "status", required = true) DataStreamStatus status,
            @JsonProperty(value = "type", required = true) DataStreamType type,
            @JsonProperty(value = "etag", required = true) String etag) {
        this.lineage = lineage;
        this.status = status;
        this.type = type;
        this.etag = etag;
    }

    /**
     * Get the dataStreamId property: The data stream identifier.
     *
     * @return the dataStreamId value.
     */
    public String getDataStreamId() {
        return this.dataStreamId;
    }

    /**
     * Get the resourceEndpoint property: The endpoint uri of the owning resource.
     *
     * @return the resourceEndpoint value.
     */
    public String getResourceEndpoint() {
        return this.resourceEndpoint;
    }

    /**
     * Get the lineage property: The data stream lineage information.
     *
     * @return the lineage value.
     */
    public DataStreamLineage getLineage() {
        return this.lineage;
    }

    /**
     * Get the status property: The data stream status.
     *
     * @return the status value.
     */
    public DataStreamStatus getStatus() {
        return this.status;
    }

    /**
     * Get the type property: The data stream type.
     *
     * @return the type value.
     */
    public DataStreamType getType() {
        return this.type;
    }

    /**
     * Get the etag property: The entity tag for this resource.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }
}
