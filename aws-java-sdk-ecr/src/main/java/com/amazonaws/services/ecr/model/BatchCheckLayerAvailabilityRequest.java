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

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class BatchCheckLayerAvailabilityRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the image
     * layers to check. If you do not specify a registry, the default registry
     * is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository that is associated with the image layers to
     * check.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The digests of the image layers to check.
     * </p>
     */
    private java.util.List<String> layerDigests;

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the image
     * layers to check. If you do not specify a registry, the default registry
     * is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the
     *        image layers to check. If you do not specify a registry, the
     *        default registry is assumed.
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the image
     * layers to check. If you do not specify a registry, the default registry
     * is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the registry that contains the
     *         image layers to check. If you do not specify a registry, the
     *         default registry is assumed.
     */
    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the image
     * layers to check. If you do not specify a registry, the default registry
     * is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry that contains the
     *        image layers to check. If you do not specify a registry, the
     *        default registry is assumed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchCheckLayerAvailabilityRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository that is associated with the image layers to
     * check.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that is associated with the image
     *        layers to check.
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that is associated with the image layers to
     * check.
     * </p>
     * 
     * @return The name of the repository that is associated with the image
     *         layers to check.
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that is associated with the image layers to
     * check.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that is associated with the image
     *        layers to check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchCheckLayerAvailabilityRequest withRepositoryName(
            String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The digests of the image layers to check.
     * </p>
     * 
     * @return The digests of the image layers to check.
     */
    public java.util.List<String> getLayerDigests() {
        return layerDigests;
    }

    /**
     * <p>
     * The digests of the image layers to check.
     * </p>
     * 
     * @param layerDigests
     *        The digests of the image layers to check.
     */
    public void setLayerDigests(java.util.Collection<String> layerDigests) {
        if (layerDigests == null) {
            this.layerDigests = null;
            return;
        }

        this.layerDigests = new java.util.ArrayList<String>(layerDigests);
    }

    /**
     * <p>
     * The digests of the image layers to check.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLayerDigests(java.util.Collection)} or
     * {@link #withLayerDigests(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param layerDigests
     *        The digests of the image layers to check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchCheckLayerAvailabilityRequest withLayerDigests(
            String... layerDigests) {
        if (this.layerDigests == null) {
            setLayerDigests(new java.util.ArrayList<String>(layerDigests.length));
        }
        for (String ele : layerDigests) {
            this.layerDigests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The digests of the image layers to check.
     * </p>
     * 
     * @param layerDigests
     *        The digests of the image layers to check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BatchCheckLayerAvailabilityRequest withLayerDigests(
            java.util.Collection<String> layerDigests) {
        setLayerDigests(layerDigests);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegistryId() != null)
            sb.append("RegistryId: " + getRegistryId() + ",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: " + getRepositoryName() + ",");
        if (getLayerDigests() != null)
            sb.append("LayerDigests: " + getLayerDigests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCheckLayerAvailabilityRequest == false)
            return false;
        BatchCheckLayerAvailabilityRequest other = (BatchCheckLayerAvailabilityRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null
                && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null
                ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getLayerDigests() == null ^ this.getLayerDigests() == null)
            return false;
        if (other.getLayerDigests() != null
                && other.getLayerDigests().equals(this.getLayerDigests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLayerDigests() == null) ? 0 : getLayerDigests()
                        .hashCode());
        return hashCode;
    }

    @Override
    public BatchCheckLayerAvailabilityRequest clone() {
        return (BatchCheckLayerAvailabilityRequest) super.clone();
    }
}