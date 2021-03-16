package resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.util.Properties;

public class Utils {
    public static RequestSpecification requestSpecification;

    public RequestSpecification getRequestSpecification() throws FileNotFoundException {
        if(requestSpecification==null) {
            PrintStream logs = new PrintStream(new FileOutputStream("logs.text"));
            requestSpecification = new RequestSpecBuilder().setBaseUri("http://localhost:8080/api/v3").addHeader("Content-Type", "application/json")
                    .addFilter(RequestLoggingFilter.logRequestTo(logs))
                    .addFilter(ResponseLoggingFilter.logResponseTo(logs)).build();
            return requestSpecification;
        }
        return requestSpecification;
    }

    public String getGlobalValue(String key) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("resources/global.properties");
        properties.load(fileInputStream);
        return properties.getProperty(key);

    }

    public String getJsonPath (Response response, String key)
    {
        String responseString = response.asString();
        JsonPath jsonPath = new JsonPath(responseString);
        return jsonPath.get(key).toString();


    }
}
