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

package com.amazonaws.services.ecr.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CompleteLayerUploadRequest Marshaller
 */
public class CompleteLayerUploadRequestMarshaller
        implements
        Marshaller<Request<CompleteLayerUploadRequest>, CompleteLayerUploadRequest> {

    public Request<CompleteLayerUploadRequest> marshall(
            CompleteLayerUploadRequest completeLayerUploadRequest) {

        if (completeLayerUploadRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CompleteLayerUploadRequest> request = new DefaultRequest<CompleteLayerUploadRequest>(
                completeLayerUploadRequest, "AmazonECR");
        request.addHeader("X-Amz-Target",
                "AmazonEC2ContainerRegistry_V20150921.CompleteLayerUpload");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (completeLayerUploadRequest.getRegistryId() != null) {
                jsonWriter.key("registryId").value(
                        completeLayerUploadRequest.getRegistryId());
            }

            if (completeLayerUploadRequest.getRepositoryName() != null) {
                jsonWriter.key("repositoryName").value(
                        completeLayerUploadRequest.getRepositoryName());
            }

            if (completeLayerUploadRequest.getUploadId() != null) {
                jsonWriter.key("uploadId").value(
                        completeLayerUploadRequest.getUploadId());
            }

            java.util.List<String> layerDigestsList = completeLayerUploadRequest
                    .getLayerDigests();
            if (layerDigestsList != null) {
                jsonWriter.key("layerDigests");
                jsonWriter.array();
                for (String layerDigestsListValue : layerDigestsList) {
                    if (layerDigestsListValue != null) {
                        jsonWriter.value(layerDigestsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
