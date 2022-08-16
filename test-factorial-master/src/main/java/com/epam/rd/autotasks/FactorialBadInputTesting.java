package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput(){
        String temp = null;
        Assertions.assertThrows(IllegalArgumentException.class, ()->factorial.factorial(temp));
    }

    @Test
    void testNegativeInput(){
        String temp = "-123";
        Assertions.assertThrows(IllegalArgumentException.class, ()->factorial.factorial(temp));
    }

    @Test
    void testFractionalInput(){
        String temp = "-123.5";
        Assertions.assertThrows(IllegalArgumentException.class, ()->factorial.factorial(temp));
    }

    @Test
    void testNonDigitalInput(){
        String temp = "-fds";
        Assertions.assertThrows(IllegalArgumentException.class, ()->factorial.factorial(temp));
    }


}
