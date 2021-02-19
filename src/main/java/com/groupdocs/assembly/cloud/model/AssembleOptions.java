/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2021 GroupDocs.Assembly for Cloud
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

package com.groupdocs.assembly.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.assembly.cloud.model.TemplateFileInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Assemble options data which is using for specifying assemble options, like template name, save format, report data and etc.
 */
@ApiModel(description = "Assemble options data which is using for specifying assemble options, like template name, save format, report data and etc.")

public class AssembleOptions {
  @SerializedName("TemplateFileInfo")
  private TemplateFileInfo templateFileInfo = null;

  @SerializedName("SaveFormat")
  private String saveFormat = null;

  @SerializedName("ReportData")
  private String reportData = null;

  @SerializedName("OutputPath")
  private String outputPath = null;

  public AssembleOptions templateFileInfo(TemplateFileInfo templateFileInfo) {
    this.templateFileInfo = templateFileInfo;
    return this;
  }

   /**
   * Gets or sets the template name which is located on storage.
   * @return templateFileInfo
  **/
  @ApiModelProperty(value = "Gets or sets the template name which is located on storage.")
  public TemplateFileInfo getTemplateFileInfo() {
    return templateFileInfo;
  }

  public void setTemplateFileInfo(TemplateFileInfo templateFileInfo) {
    this.templateFileInfo = templateFileInfo;
  }

  public AssembleOptions saveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
    return this;
  }

   /**
   * Gets or sets a save format for assembled document.
   * @return saveFormat
  **/
  @ApiModelProperty(value = "Gets or sets a save format for assembled document.")
  public String getSaveFormat() {
    return saveFormat;
  }

  public void setSaveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
  }

  public AssembleOptions reportData(String reportData) {
    this.reportData = reportData;
    return this;
  }

   /**
   * Gets or sets a data for report.
   * @return reportData
  **/
  @ApiModelProperty(value = "Gets or sets a data for report.")
  public String getReportData() {
    return reportData;
  }

  public void setReportData(String reportData) {
    this.reportData = reportData;
  }

  public AssembleOptions outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * Gets or sets result path of a built document.
   * @return outputPath
  **/
  @ApiModelProperty(value = "Gets or sets result path of a built document.")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssembleOptions assembleOptions = (AssembleOptions) o;
    return Objects.equals(this.templateFileInfo, assembleOptions.templateFileInfo) &&
        Objects.equals(this.saveFormat, assembleOptions.saveFormat) &&
        Objects.equals(this.reportData, assembleOptions.reportData) &&
        Objects.equals(this.outputPath, assembleOptions.outputPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateFileInfo, saveFormat, reportData, outputPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssembleOptions {\n");
    
    sb.append("    templateFileInfo: ").append(toIndentedString(templateFileInfo)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    reportData: ").append(toIndentedString(reportData)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

