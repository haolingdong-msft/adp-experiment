// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The state of the upload. */
public final class UploadStatus extends ExpandableStringEnum<UploadStatus> {
    /** Static value Created for UploadStatus. */
    public static final UploadStatus CREATED = fromString("Created");

    /** Static value GeneratingSpecialFilesUploadInfo for UploadStatus. */
    public static final UploadStatus GENERATING_SPECIAL_FILES_UPLOAD_INFO =
            fromString("GeneratingSpecialFilesUploadInfo");

    /** Static value GeneratedSpecialFilesUploadInfo for UploadStatus. */
    public static final UploadStatus GENERATED_SPECIAL_FILES_UPLOAD_INFO =
            fromString("GeneratedSpecialFilesUploadInfo");

    /** Static value GeneratingDataFilesUploadInfo for UploadStatus. */
    public static final UploadStatus GENERATING_DATA_FILES_UPLOAD_INFO = fromString("GeneratingDataFilesUploadInfo");

    /** Static value GeneratedDataFilesUploadInfo for UploadStatus. */
    public static final UploadStatus GENERATED_DATA_FILES_UPLOAD_INFO = fromString("GeneratedDataFilesUploadInfo");

    /** Static value Completing for UploadStatus. */
    public static final UploadStatus COMPLETING = fromString("Completing");

    /** Static value Completed for UploadStatus. */
    public static final UploadStatus COMPLETED = fromString("Completed");

    /** Static value Aborting for UploadStatus. */
    public static final UploadStatus ABORTING = fromString("Aborting");

    /** Static value Aborted for UploadStatus. */
    public static final UploadStatus ABORTED = fromString("Aborted");

    /** Static value Failed for UploadStatus. */
    public static final UploadStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a UploadStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UploadStatus.
     */
    @JsonCreator
    public static UploadStatus fromString(String name) {
        return fromString(name, UploadStatus.class);
    }

    /**
     * Gets known UploadStatus values.
     *
     * @return known UploadStatus values.
     */
    public static Collection<UploadStatus> values() {
        return values(UploadStatus.class);
    }
}
