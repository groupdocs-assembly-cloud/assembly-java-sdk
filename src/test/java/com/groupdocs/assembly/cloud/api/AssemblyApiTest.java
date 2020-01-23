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

import com.groupdocs.assembly.cloud.ApiException;
import java.io.File;

import com.groupdocs.assembly.cloud.*;
import com.groupdocs.assembly.cloud.model.*;
import com.groupdocs.assembly.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Ignore;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssemblyApi
 */
public class AssemblyApiTest extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }
    
    /**
     * Builds a document using document template and XML or JSON data passed in request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    public void testPostAssembleDocument() throws ApiException {
        String name = "TestAllChartTypes.docx";

        File data = new File(Paths.get(TestInitializer.LocalTestFolder, "Teams.json").toString());
        LoadSaveOptionsData saveOptions = new LoadSaveOptionsData();
        saveOptions.setSaveFormat("docx");
        
        FileUploadFileRequest uploadFileRequest = new FileUploadFileRequest(
                new File(TestInitializer.LocalTestFolder, name),
                Paths.get("Temp/SdkTests/TestData/GroupDocs.Assembly", name).toString(),
                null);

        FilesUploadResult uploadFileResponse = TestInitializer.assemblyApi.fileUploadFile(uploadFileRequest);
        assertTrue(uploadFileResponse.getErrors().size() == 0);
        assertTrue(uploadFileResponse.getUploaded().size() == 1);
        
        PostAssembleDocumentRequest request = new PostAssembleDocumentRequest(name, data, saveOptions, null, null);
        File response = TestInitializer.assemblyApi.postAssembleDocument(request);
        assertTrue(response.length() > 0);
    }
    
}
