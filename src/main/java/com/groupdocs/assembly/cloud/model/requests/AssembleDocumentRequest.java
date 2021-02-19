/*
 * --------------------------------------------------------------------------------------
 * <copyright company="GroupDocs" file="AssembleDocumentRequest.java">
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
 * --------------------------------------------------------------------------------------
 */
package com.groupdocs.assembly.cloud.model.requests;
import com.groupdocs.assembly.cloud.model.*;
import java.io.File;

/*
 * Request model for assembleDocument operation.
 */
public class AssembleDocumentRequest {
    /*
     * Assemble Options. It should be JSON or XML with TemplateFileInfo, SaveFormat, ReportData and etc.             
     */
    private AssembleOptions AssembleOptions;
    
    /*
     * Initializes a new instance of the assembleDocumentRequest class.
     *  
     * @param AssembleOptions assembleOptions Assemble Options. It should be JSON or XML with TemplateFileInfo, SaveFormat, ReportData and etc.             
     */
    public AssembleDocumentRequest(AssembleOptions assembleOptions) {
        AssembleOptions = assembleOptions;
    }

    /*
     *  Gets Assemble Options. It should be JSON or XML with TemplateFileInfo, SaveFormat, ReportData and etc.             
     */
    public AssembleOptions getAssembleOptions() {
        return AssembleOptions;
    }

    /*
     * Sets Assemble Options. It should be JSON or XML with TemplateFileInfo, SaveFormat, ReportData and etc.             
     */
    public void setAssembleOptions(AssembleOptions value) {
        AssembleOptions = value;
    }
}
