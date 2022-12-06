// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.models.ResponseError;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LRO of DiscoveryOperationType type. */
@Immutable
public final class DiscoveryLroResponse {
    /*
     * The operation Id.
     */
    @JsonProperty(value = "operationId", required = true)
    private String operationId;

    /*
     * The operation status.
     */
    @JsonProperty(value = "status", required = true)
    private LongRunningOperationStatus status;

    /*
     * The operation type.
     */
    @JsonProperty(value = "operationType")
    private DiscoveryOperationType operationType;

    /*
     * The operation error.
     */
    @JsonProperty(value = "error")
    private ResponseError error;

    /*
     * The identifier of the service that was last to modify the operation status.
     */
    @JsonProperty(value = "lastModifiedBy", required = true)
    private String lastModifiedBy;

    /*
     * The result resource location (URI).
     */
    @JsonProperty(value = "resultLocation")
    private String resultLocation;

    /*
     * The entity tag for this resource.
     */
    @JsonProperty(value = "etag", required = true)
    private String etag;

    /**
     * Creates an instance of DiscoveryLroResponse class.
     *
     * @param operationId the operationId value to set.
     * @param status the status value to set.
     * @param lastModifiedBy the lastModifiedBy value to set.
     * @param etag the etag value to set.
     */
    @JsonCreator
    private DiscoveryLroResponse(
            @JsonProperty(value = "operationId", required = true) String operationId,
            @JsonProperty(value = "status", required = true) LongRunningOperationStatus status,
            @JsonProperty(value = "lastModifiedBy", required = true) String lastModifiedBy,
            @JsonProperty(value = "etag", required = true) String etag) {
        this.operationId = operationId;
        this.status = status;
        this.lastModifiedBy = lastModifiedBy;
        this.etag = etag;
    }

    /**
     * Get the operationId property: The operation Id.
     *
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Get the status property: The operation status.
     *
     * @return the status value.
     */
    public LongRunningOperationStatus getStatus() {
        return this.status;
    }

    /**
     * Get the operationType property: The operation type.
     *
     * @return the operationType value.
     */
    public DiscoveryOperationType getOperationType() {
        return this.operationType;
    }

    /**
     * Get the error property: The operation error.
     *
     * @return the error value.
     */
    public ResponseError getError() {
        return this.error;
    }

    /**
     * Get the lastModifiedBy property: The identifier of the service that was last to modify the operation status.
     *
     * @return the lastModifiedBy value.
     */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Get the resultLocation property: The result resource location (URI).
     *
     * @return the resultLocation value.
     */
    public String getResultLocation() {
        return this.resultLocation;
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
