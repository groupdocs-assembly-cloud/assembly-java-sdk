/*
 * --------------------------------------------------------------------------------
 * <copyright company="GroupDocs">
 *   Copyright (c) 2019 GroupDocs.Assembly for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.groupdocs.assembly.cloud.api;

import com.groupdocs.assembly.cloud.*;
import com.groupdocs.assembly.cloud.model.*;
import com.groupdocs.assembly.cloud.model.requests.*;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.File;
import java.lang.reflect.Type;
import java.util.*;


public class AssemblyApi {
    private Integer NotAuth = 401;
    private Integer BadRequest = 400;
    private ApiClient apiClient;

    public AssemblyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AssemblyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for postAssembleDocument
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private com.squareup.okhttp.Call postAssembleDocumentCall(PostAssembleDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/assembly/{name}/build"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "folder", request.getFolder());
        localVarPath = addParameterToQuery(localVarQueryParams, localVarPath, "destFileName", request.getDestFileName());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        Map<String, Object> localVarFormParams = new LinkedHashMap<String, Object>();
        if (request.getSaveOptions() != null) {
            localVarFormParams.put("SaveOptions", new JSON().serialize(request.getSaveOptions()));
        }
        
        if (request.getData() != null) {
            localVarFormParams.put("Data", request.getData());
        }

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postAssembleDocumentValidateBeforeCall(PostAssembleDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'Name' is set
        if (request.getName() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Name' when calling postAssembleDocument");
        }
        
        // verify the required parameter 'Data' is set
        if (request.getData() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'Data' when calling postAssembleDocument");
        }
        
        // verify the required parameter 'SaveOptions' is set
        if (request.getSaveOptions() == null) {
          throw new ApiException(BadRequest, "Missing the required parameter 'SaveOptions' when calling postAssembleDocument");
        }
        

        com.squareup.okhttp.Call call = postAssembleDocumentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Builds a document using document template and XML or JSON data passed in request
     * 
     * @param request Request object
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postAssembleDocument(PostAssembleDocumentRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postAssembleDocumentWithHttpInfo(request);
            return resp.getData();
        }
        catch (ApiException ex) {
            if (ex.getCode() == NotAuth) {
                apiClient.requestToken();
                ApiResponse<File> resp = postAssembleDocumentWithHttpInfo(request);
                return resp.getData();
            }
            throw ex;
        }
    }

    /**
     * Builds a document using document template and XML or JSON data passed in request
     * 
     * @param request Request object
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<File> postAssembleDocumentWithHttpInfo(PostAssembleDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postAssembleDocumentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Builds a document using document template and XML or JSON data passed in request (asynchronously)
     * 
     * @param request Request object
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAssembleDocumentAsync(PostAssembleDocumentRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postAssembleDocumentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() { }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    private String addParameterToQuery(List<Pair> queryParams, String path, String paramName, Object paramValue) {
        if (path.contains("{" + paramName + "}")) {
            if (paramValue == null || paramValue.equals("")) {
                return path.replace("{" + paramName + "}", "");
            } 
            else {
                return path.replace("{" + paramName + "}", paramValue.toString());
            }
        }

        queryParams.addAll(apiClient.parameterToPair(paramName, paramValue));
        return path;
    }
}
