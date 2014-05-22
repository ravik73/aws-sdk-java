/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#deregisterRdsDbInstance(DeregisterRdsDbInstanceRequest) DeregisterRdsDbInstance operation}.
 * <p>
 * Deregisters an Amazon RDS instance.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#deregisterRdsDbInstance(DeregisterRdsDbInstanceRequest)
 */
public class DeregisterRdsDbInstanceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon RDS instance's ARN.
     */
    private String rdsDbInstanceArn;

    /**
     * The Amazon RDS instance's ARN.
     *
     * @return The Amazon RDS instance's ARN.
     */
    public String getRdsDbInstanceArn() {
        return rdsDbInstanceArn;
    }
    
    /**
     * The Amazon RDS instance's ARN.
     *
     * @param rdsDbInstanceArn The Amazon RDS instance's ARN.
     */
    public void setRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
    }
    
    /**
     * The Amazon RDS instance's ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rdsDbInstanceArn The Amazon RDS instance's ARN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeregisterRdsDbInstanceRequest withRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
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
        if (getRdsDbInstanceArn() != null) sb.append("RdsDbInstanceArn: " + getRdsDbInstanceArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRdsDbInstanceArn() == null) ? 0 : getRdsDbInstanceArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeregisterRdsDbInstanceRequest == false) return false;
        DeregisterRdsDbInstanceRequest other = (DeregisterRdsDbInstanceRequest)obj;
        
        if (other.getRdsDbInstanceArn() == null ^ this.getRdsDbInstanceArn() == null) return false;
        if (other.getRdsDbInstanceArn() != null && other.getRdsDbInstanceArn().equals(this.getRdsDbInstanceArn()) == false) return false; 
        return true;
    }
    
}
    