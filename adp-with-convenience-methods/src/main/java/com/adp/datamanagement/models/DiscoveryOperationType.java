// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The supported actions on discovery. */
public final class DiscoveryOperationType extends ExpandableStringEnum<DiscoveryOperationType> {
    /** Static value CompleteDiscovery for DiscoveryOperationType. */
    public static final DiscoveryOperationType COMPLETE_DISCOVERY = fromString("CompleteDiscovery");

    /** Static value FinalizeFileList for DiscoveryOperationType. */
    public static final DiscoveryOperationType FINALIZE_FILE_LIST = fromString("FinalizeFileList");

    /** Static value AbortDiscovery for DiscoveryOperationType. */
    public static final DiscoveryOperationType ABORT_DISCOVERY = fromString("AbortDiscovery");

    /**
     * Creates or finds a DiscoveryOperationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiscoveryOperationType.
     */
    @JsonCreator
    public static DiscoveryOperationType fromString(String name) {
        return fromString(name, DiscoveryOperationType.class);
    }

    /**
     * Gets known DiscoveryOperationType values.
     *
     * @return known DiscoveryOperationType values.
     */
    public static Collection<DiscoveryOperationType> values() {
        return values(DiscoveryOperationType.class);
    }
}
