package com.example;

import com.epam.reportportal.annotations.Step;
import com.epam.reportportal.junit5.ReportPortalExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

@ExtendWith ( ReportPortalExtension.class )
class BasicTest
{

    static Stream<Arguments> allParams( )
    {
        return Stream
            .<Arguments>builder( )
            .add( Arguments.of( "param1" ) )
            .add( Arguments.of( "param2" ) )
            .add( Arguments.of( "param3" ) )
            .build( );
    }

    @Step ( "Doing work for {param}" )
    void someWork( String param )
    {
        System.out.println( param );
    }
}
