package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class ExampleTest
    extends BasicTest
{
    @ParameterizedTest
    @MethodSource ( "allParams" )
    void exampleTest( String param )
    {
        someWork( param );
        assertThat( "param2",
                    equalTo( param ) );
    }
}
