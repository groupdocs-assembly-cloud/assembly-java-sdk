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

package com.groupdocs.assembly;
import com.groupdocs.assembly.api.AssemblyApi;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Map;

public final class TestInitializer {
    public static AssemblyApi assemblyApi;
    public static String LocalTestFolder = "TestData";


    public static void Initialize() throws FileNotFoundException, ApiException {
        Map<String, String> creds = new Gson().fromJson(new JsonReader(new FileReader("Settings/servercreds.json")), Map.class);
        if (creds == null) {
            throw new FileNotFoundException("Please put your credentials into Settings/servercreds.json file");
        }

        assemblyApi = new AssemblyApi(new ApiClient());
        ApiClient client = assemblyApi.getApiClient();
        client.setBaseUrl(creds.get("BaseUrl")).setAppKey(creds.get("AppKey")).setAppSid(creds.get("AppSid"));
    }
}
