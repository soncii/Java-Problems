package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FactorialCsvParametrizedTesting {

    Factorial factorial = new Factorial();

    @ParameterizedTest
    @CsvFileSource(resources = "/csvCases.csv")
    void testFactorial(String input, String output){
        Assertions.assertNotNull(input);
        Assertions.assertTrue(factorial.factorial(input).equals(output));
    }
}
