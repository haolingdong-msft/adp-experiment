// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DefaultLroType. */
public final class DefaultLroType extends ExpandableStringEnum<DefaultLroType> {
    /** Static value default for DefaultLroType. */
    public static final DefaultLroType DEFAULT = fromString("default");

    /**
     * Creates or finds a DefaultLroType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DefaultLroType.
     */
    @JsonCreator
    public static DefaultLroType fromString(String name) {
        return fromString(name, DefaultLroType.class);
    }

    /**
     * Gets known DefaultLroType values.
     *
     * @return known DefaultLroType values.
     */
    public static Collection<DefaultLroType> values() {
        return values(DefaultLroType.class);
    }
}
