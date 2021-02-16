# GroupDocs.Assembly Cloud for Java
This repository contains GroupDocs.Assembly Cloud SDK for Java source code. This SDK allows you to work with GroupDocs.Assembly Cloud REST APIs in your Java applications quickly and easily, with zero initial cost.

See [API Reference](https://apireference.groupdocs.cloud/assembly) for full API specification.

## How to use the SDK?
The complete source code is available in this repository folder. You can either directly use it in your project via source code or get [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-assembly-cloud) (recommended).

### Prerequisites

To use GroupDocs.Assembly for Cloud Java SDK you need to register an account with [GroupDocs Cloud](https://www.groupdocs.cloud/) and lookup/create App Key and SID at [Cloud Dashboard](https://dashboard.groupdocs.cloud/applications). There is free quota available. For more details, see [GroupDocs Cloud Pricing](https://purchase.groupdocs.cloud/pricing).

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.groupdocs</groupId>
  <artifactId>GroupDocsAssemblyCloud</artifactId>
  <version>21.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.groupdocs:GroupDocsAssemblyCloud:21.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/GroupDocsAssemblyCloud-21.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.groupdocs.assembly.*;
import com.groupdocs.assembly.auth.*;
import com.groupdocs.assembly.model.*;
import com.groupdocs.assembly.api.AssemblyApi;

import java.io.File;
import java.util.*;

public class AssemblyApiExample {

    public static void main(String[] args) {
        
        AssemblyApi apiInstance = new AssemblyApi();
        AssembleOptions saveOptions = new AssembleOptions();
        saveOptions.setTemplateFileInfo(new TemplateFileInfo().filePath(Paths.get(pathtoFile).toString()));
        saveOptions.setSaveFormat("pdf");
        saveOptions.setReportData(new String(Files.readAllBytes(Paths.get(pathToData))));
        try {
            AssembleDocumentRequest request = new AssembleDocumentRequest(saveOptions);
            File response = TestInitializer.assemblyApi.assembleDocument(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssemblyApi#postAssembleDocument");
            e.printStackTrace();
        }
    }
}

```
## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Contact Us
[Product Page](https://products.groupdocs.cloud/assembly/java) | [Documentation](https://docs.groupdocs.cloud/display/assemblycloud/Home) | [API Reference](https://apireference.groupdocs.cloud/assembly/) | [Code Samples](https://github.com/groupdocs-assembly-cloud/groupdocs-assembly-cloud-java) | [Blog](https://blog.groupdocs.cloud/category/assembly/) | [Free Support](https://forum.groupdocs.cloud/c/assembly) | [Free Trial](https://dashboard.groupdocs.cloud/applications)