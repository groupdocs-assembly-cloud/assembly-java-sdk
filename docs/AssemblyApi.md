# AssemblyApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAssembleDocument**](AssemblyApi.md#postAssembleDocument) | **POST** /assembly/{name}/build | Builds a document using document template and XML or JSON data passed in request


<a name="postAssembleDocument"></a>
# **postAssembleDocument**
> File postAssembleDocument(name, data, saveOptions, folder, destFileName)

Builds a document using document template and XML or JSON data passed in request

### Example
```java
// Import classes:
//import com.groupdocs.assembly.ApiException;
//import com.groupdocs.assembly.api.AssemblyApi;


AssemblyApi apiInstance = new AssemblyApi();
String name = "name_example"; // String | File name of template, which is located on a storage
File data = new File("/path/to/file.txt"); // File | Report data in JSON or XML format
LoadSaveOptionsData saveOptions = new LoadSaveOptionsData(); // LoadSaveOptionsData | Save options in json format
String folder = "folder_example"; // String | Folder path where template file is located(on a storage)
String destFileName = "destFileName_example"; // String | Result name of built document
try {
    File result = apiInstance.postAssembleDocument(name, data, saveOptions, folder, destFileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#postAssembleDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| File name of template, which is located on a storage |
 **data** | **File**| Report data in JSON or XML format |
 **saveOptions** | [**LoadSaveOptionsData**](LoadSaveOptionsData.md)| Save options in json format |
 **folder** | **String**| Folder path where template file is located(on a storage) | [optional]
 **destFileName** | **String**| Result name of built document | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

