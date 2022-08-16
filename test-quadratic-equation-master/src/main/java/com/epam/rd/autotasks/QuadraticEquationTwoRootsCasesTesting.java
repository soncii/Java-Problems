package com.epam.rd.autotasks;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    private double a;
    private double b;
    private double c;
    private String expected;
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    @Parameterized.Parameters
    public static Collection<Object[]> Param() {
        return Arrays.asList(new Object[][]{ {1, 5,4,"-1.0 -4.0"},
                {1,3,2,"-1.0 -2.0"},
                {2,6,4,"-1.0 -2.0"},{2,10,8,"-1.0 -4.0"} });
    }
    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.expected=expected;
    }
    @Test
    public void testTwoRootsRootsCases() {
        String reversed = expected.substring(expected.indexOf(' ')+1, expected.length()) + " " + expected.substring(0,expected.indexOf(' '))
                ;
        String result = quadraticEquation.solve(a,b,c);
        boolean res =expected.equals(result) || reversed.equals(result);
        System.out.printf("Expected: %s Actual:%s Reversed:%s\n", expected,result,reversed);
        assertTrue(res);
    }

}
