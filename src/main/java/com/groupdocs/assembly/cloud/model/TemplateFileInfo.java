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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TemplateFileInfo dto.             
 */
@ApiModel(description = "TemplateFileInfo dto.             ")

public class TemplateFileInfo {
  @SerializedName("FilePath")
  private String filePath = null;

  @SerializedName("StorageName")
  private String storageName = null;

  @SerializedName("VersionId")
  private String versionId = null;

  @SerializedName("Password")
  private String password = null;

  public TemplateFileInfo filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * Gets or sets path to file.             
   * @return filePath
  **/
  @ApiModelProperty(value = "Gets or sets path to file.             ")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public TemplateFileInfo storageName(String storageName) {
    this.storageName = storageName;
    return this;
  }

   /**
   * Gets or sets the name of storage.             
   * @return storageName
  **/
  @ApiModelProperty(value = "Gets or sets the name of storage.             ")
  public String getStorageName() {
    return storageName;
  }

  public void setStorageName(String storageName) {
    this.storageName = storageName;
  }

  public TemplateFileInfo versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Gets or sets the name of storage.             
   * @return versionId
  **/
  @ApiModelProperty(value = "Gets or sets the name of storage.             ")
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public TemplateFileInfo password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Gets or sets the password.             
   * @return password
  **/
  @ApiModelProperty(value = "Gets or sets the password.             ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateFileInfo templateFileInfo = (TemplateFileInfo) o;
    return Objects.equals(this.filePath, templateFileInfo.filePath) &&
        Objects.equals(this.storageName, templateFileInfo.storageName) &&
        Objects.equals(this.versionId, templateFileInfo.versionId) &&
        Objects.equals(this.password, templateFileInfo.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, storageName, versionId, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateFileInfo {\n");
    
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    storageName: ").append(toIndentedString(storageName)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

