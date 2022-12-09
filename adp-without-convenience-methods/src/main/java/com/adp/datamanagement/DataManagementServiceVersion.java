// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement;

import com.azure.core.util.ServiceVersion;

/** Service version of DataManagementClient. */
public enum DataManagementServiceVersion implements ServiceVersion {
    /** Enum value 2022-11-30-preview. */
    V2022_11_30_PREVIEW("2022-11-30-preview");

    private final String version;

    DataManagementServiceVersion(String version) {
        this.version = version;
    }

    /** {@inheritDoc} */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link DataManagementServiceVersion}.
     */
    public static DataManagementServiceVersion getLatest() {
        return V2022_11_30_PREVIEW;
    }
}
