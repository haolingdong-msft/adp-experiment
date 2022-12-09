// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The access information to the data stream shard. */
@Immutable
public final class DataStreamShardAccessInformation {
    /*
     * SAS signed URI for reading the shard folder content from Azure Storage.
     * This URI expires in 24 hours.
     */
    @JsonProperty(value = "shardFolderUri", required = true)
    private String shardFolderUri;

    /*
     * SAS signed URI for reading the shard manifest file from Azure Storage.
     * This URI expires in 24 hours.
     */
    @JsonProperty(value = "manifestFileUri", required = true)
    private String manifestFileUri;

    /**
     * Creates an instance of DataStreamShardAccessInformation class.
     *
     * @param shardFolderUri the shardFolderUri value to set.
     * @param manifestFileUri the manifestFileUri value to set.
     */
    @JsonCreator
    private DataStreamShardAccessInformation(
            @JsonProperty(value = "shardFolderUri", required = true) String shardFolderUri,
            @JsonProperty(value = "manifestFileUri", required = true) String manifestFileUri) {
        this.shardFolderUri = shardFolderUri;
        this.manifestFileUri = manifestFileUri;
    }

    /**
     * Get the shardFolderUri property: SAS signed URI for reading the shard folder content from Azure Storage. This URI
     * expires in 24 hours.
     *
     * @return the shardFolderUri value.
     */
    public String getShardFolderUri() {
        return this.shardFolderUri;
    }

    /**
     * Get the manifestFileUri property: SAS signed URI for reading the shard manifest file from Azure Storage. This URI
     * expires in 24 hours.
     *
     * @return the manifestFileUri value.
     */
    public String getManifestFileUri() {
        return this.manifestFileUri;
    }
}
