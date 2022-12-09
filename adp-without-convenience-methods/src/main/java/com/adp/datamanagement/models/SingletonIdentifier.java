// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SingletonIdentifier. */
public final class SingletonIdentifier extends ExpandableStringEnum<SingletonIdentifier> {
    /** Static value current for SingletonIdentifier. */
    public static final SingletonIdentifier CURRENT = fromString("current");

    /**
     * Creates or finds a SingletonIdentifier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SingletonIdentifier.
     */
    @JsonCreator
    public static SingletonIdentifier fromString(String name) {
        return fromString(name, SingletonIdentifier.class);
    }

    /**
     * Gets known SingletonIdentifier values.
     *
     * @return known SingletonIdentifier values.
     */
    public static Collection<SingletonIdentifier> values() {
        return values(SingletonIdentifier.class);
    }
}
