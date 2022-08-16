package com.epam.rd.autotasks;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();
    @Test
    public void RegularInputTest() {
        Assertions.assertTrue(factorial.factorial("14").equals("3628800"));
        Assertions.assertTrue(factorial.factorial("6").equals("720"));
    }
}
