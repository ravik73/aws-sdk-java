/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ecr.model;

/**
 * 
 */
public enum ImageFailureCode {

    InvalidImageDigest("InvalidImageDigest"),
    InvalidImageTag("InvalidImageTag"),
    ImageTagDoesNotMatchDigest("ImageTagDoesNotMatchDigest"),
    ImageNotFound("ImageNotFound"),
    MissingDigestAndTag("MissingDigestAndTag");

    private String value;

    private ImageFailureCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ImageFailureCode corresponding to the value
     */
    public static ImageFailureCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("InvalidImageDigest".equals(value)) {
            return InvalidImageDigest;
        } else if ("InvalidImageTag".equals(value)) {
            return InvalidImageTag;
        } else if ("ImageTagDoesNotMatchDigest".equals(value)) {
            return ImageTagDoesNotMatchDigest;
        } else if ("ImageNotFound".equals(value)) {
            return ImageNotFound;
        } else if ("MissingDigestAndTag".equals(value)) {
            return MissingDigestAndTag;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}