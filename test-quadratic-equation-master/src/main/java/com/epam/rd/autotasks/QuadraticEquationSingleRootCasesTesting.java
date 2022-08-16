package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    private double exp;

    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.exp=expected;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> Param() {
        return Arrays.asList(new Object[][]{ {1, 4,4,-2}, {1,2,1,-1}, {3,6,3,-1},{-5,10,-5,1} });

    }

    @Test
    public void testSingleRootCase() {

        assertEquals(String.valueOf(exp), quadraticEquation.solve(a, b, c));
    }
}