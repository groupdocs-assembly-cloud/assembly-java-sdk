/*
 * --------------------------------------------------------------------------------------
 * <copyright company="GroupDocs" file="PostAssembleDocumentRequest.java">
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
 * Request model for postAssembleDocument operation.
 */
public class PostAssembleDocumentRequest {
    /*
     * File name of template, which is located on a storage
     */
    private String Name;

    /*
     * Report data in JSON or XML format
     */
    private File Data;

    /*
     * Save options in json format
     */
    private LoadSaveOptionsData SaveOptions;

    /*
     * Folder path where template file is located(on a storage)
     */
    private String Folder;

    /*
     * Result name of built document
     */
    private String DestFileName;
    
    /*
     * Initializes a new instance of the postAssembleDocumentRequest class.
     *  
     * @param String name File name of template, which is located on a storage
     * @param File data Report data in JSON or XML format
     * @param LoadSaveOptionsData saveOptions Save options in json format
     * @param String folder Folder path where template file is located(on a storage)
     * @param String destFileName Result name of built document
     */
    public PostAssembleDocumentRequest(String name,  File data,  LoadSaveOptionsData saveOptions,  String folder,  String destFileName) {
        Name = name;
        Data = data;
        SaveOptions = saveOptions;
        Folder = folder;
        DestFileName = destFileName;
    }

    /*
     *  Gets File name of template, which is located on a storage
     */
    public String getName() {
        return Name;
    }

    /*
     * Sets File name of template, which is located on a storage
     */
    public void setName(String value) {
        Name = value;
    }

    /*
     *  Gets Report data in JSON or XML format
     */
    public File getData() {
        return Data;
    }

    /*
     * Sets Report data in JSON or XML format
     */
    public void setData(File value) {
        Data = value;
    }

    /*
     *  Gets Save options in json format
     */
    public LoadSaveOptionsData getSaveOptions() {
        return SaveOptions;
    }

    /*
     * Sets Save options in json format
     */
    public void setSaveOptions(LoadSaveOptionsData value) {
        SaveOptions = value;
    }

    /*
     *  Gets Folder path where template file is located(on a storage)
     */
    public String getFolder() {
        return Folder;
    }

    /*
     * Sets Folder path where template file is located(on a storage)
     */
    public void setFolder(String value) {
        Folder = value;
    }

    /*
     *  Gets Result name of built document
     */
    public String getDestFileName() {
        return DestFileName;
    }

    /*
     * Sets Result name of built document
     */
    public void setDestFileName(String value) {
        DestFileName = value;
    }
}
