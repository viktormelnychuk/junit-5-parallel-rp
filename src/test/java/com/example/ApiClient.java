package com.example;

import com.epam.reportportal.annotations.Step;
import io.restassured.RestAssured;
import io.restassured.http.Method;

public class ApiClient
{

    @Step ( "Sending {body} to {url}" )
    public static String post( String url,
                               Object body )
    {
        RestAssured
            .given( )
            .with( )
            .body( body )
            .request( Method.POST,
                      url );
        return "Something";
    }
}
