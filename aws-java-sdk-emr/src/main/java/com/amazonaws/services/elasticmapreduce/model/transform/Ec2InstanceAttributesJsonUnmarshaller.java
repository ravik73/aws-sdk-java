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

package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Ec2InstanceAttributes JSON Unmarshaller
 */
public class Ec2InstanceAttributesJsonUnmarshaller implements
        Unmarshaller<Ec2InstanceAttributes, JsonUnmarshallerContext> {

    public Ec2InstanceAttributes unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        Ec2InstanceAttributes ec2InstanceAttributes = new Ec2InstanceAttributes();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Ec2KeyName", targetDepth)) {
                    context.nextToken();
                    ec2InstanceAttributes.setEc2KeyName(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Ec2SubnetId", targetDepth)) {
                    context.nextToken();
                    ec2InstanceAttributes.setEc2SubnetId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Ec2AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    ec2InstanceAttributes
                            .setEc2AvailabilityZone(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("IamInstanceProfile", targetDepth)) {
                    context.nextToken();
                    ec2InstanceAttributes
                            .setIamInstanceProfile(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("EmrManagedMasterSecurityGroup",
                        targetDepth)) {
                    context.nextToken();
                    ec2InstanceAttributes
                            .setEmrManagedMasterSecurityGroup(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("EmrManagedSlaveSecurityGroup",
                        targetDepth)) {
                    context.nextToken();
                    ec2InstanceAttributes
                            .setEmrManagedSlaveSecurityGroup(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceAccessSecurityGroup",
                        targetDepth)) {
                    context.nextToken();
                    ec2InstanceAttributes
                            .setServiceAccessSecurityGroup(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("AdditionalMasterSecurityGroups",
                        targetDepth)) {
                    context.nextToken();
                    ec2InstanceAttributes
                            .setAdditionalMasterSecurityGroups(new ListUnmarshaller<String>(
                                    StringJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("AdditionalSlaveSecurityGroups",
                        targetDepth)) {
                    context.nextToken();
                    ec2InstanceAttributes
                            .setAdditionalSlaveSecurityGroups(new ListUnmarshaller<String>(
                                    StringJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ec2InstanceAttributes;
    }

    private static Ec2InstanceAttributesJsonUnmarshaller instance;

    public static Ec2InstanceAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ec2InstanceAttributesJsonUnmarshaller();
        return instance;
    }
}
