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

package com.groupdocs.assembly.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Save options data which is using for specifying additional save options, like save format and etc.
 */
@ApiModel(description = "Save options data which is using for specifying additional save options, like save format and etc.")

public class ReportOptionsData {
  @SerializedName("SaveFormat")
  private String saveFormat = null;

  @SerializedName("ReportData")
  private String reportData = null;

  public ReportOptionsData saveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
    return this;
  }

   /**
   * Save format for assembled document
   * @return saveFormat
  **/
  @ApiModelProperty(value = "Save format for assembled document")
  public String getSaveFormat() {
    return saveFormat;
  }

  public void setSaveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
  }

  public ReportOptionsData reportData(String reportData) {
    this.reportData = reportData;
    return this;
  }

   /**
   * Data for report
   * @return reportData
  **/
  @ApiModelProperty(value = "Data for report")
  public String getReportData() {
    return reportData;
  }

  public void setReportData(String reportData) {
    this.reportData = reportData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportOptionsData reportOptionsData = (ReportOptionsData) o;
    return Objects.equals(this.saveFormat, reportOptionsData.saveFormat) &&
        Objects.equals(this.reportData, reportOptionsData.reportData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saveFormat, reportData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportOptionsData {\n");
    
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    reportData: ").append(toIndentedString(reportData)).append("\n");
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

