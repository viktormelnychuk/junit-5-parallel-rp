package com.example;

import com.epam.reportportal.annotations.Step;
import com.epam.reportportal.junit5.ReportPortalExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith ( ReportPortalExtension.class )
class ExampleTest

{
    public static Stream<Arguments> params( )
    {
        String v = ApiClient.post( "https://example.org",
                                   "somestring" );
        return Stream.of( Arguments.of( v ) );
    }

    @ParameterizedTest
    @MethodSource ( "params" )
    void exampleTest( String param )
    {
        someWork( );
        assertThat( true,
                    equalTo( true ) );
    }

    @Step ( "Doing some work" )
    private void someWork( )
    {
        System.out.println( "asd" );
    }
}
