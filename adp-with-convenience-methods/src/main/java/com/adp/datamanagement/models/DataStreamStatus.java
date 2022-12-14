// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataStreamStatus. */
public final class DataStreamStatus extends ExpandableStringEnum<DataStreamStatus> {
    /** Static value Created for DataStreamStatus. */
    public static final DataStreamStatus CREATED = fromString("Created");

    /** Static value Completing for DataStreamStatus. */
    public static final DataStreamStatus COMPLETING = fromString("Completing");

    /** Static value Completed for DataStreamStatus. */
    public static final DataStreamStatus COMPLETED = fromString("Completed");

    /** Static value Failed for DataStreamStatus. */
    public static final DataStreamStatus FAILED = fromString("Failed");

    /** Static value Failing for DataStreamStatus. */
    public static final DataStreamStatus FAILING = fromString("Failing");

    /** Static value Clearing for DataStreamStatus. */
    public static final DataStreamStatus CLEARING = fromString("Clearing");

    /** Static value Cleared for DataStreamStatus. */
    public static final DataStreamStatus CLEARED = fromString("Cleared");

    /**
     * Creates or finds a DataStreamStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataStreamStatus.
     */
    @JsonCreator
    public static DataStreamStatus fromString(String name) {
        return fromString(name, DataStreamStatus.class);
    }

    /**
     * Gets known DataStreamStatus values.
     *
     * @return known DataStreamStatus values.
     */
    public static Collection<DataStreamStatus> values() {
        return values(DataStreamStatus.class);
    }
}
