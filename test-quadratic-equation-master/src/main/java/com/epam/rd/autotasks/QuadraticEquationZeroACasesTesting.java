package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {
    private double a;
    private double b;
    private double c;
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> Param() {
        return Arrays.asList(new Object[][]{ {0, 2, 3}, {0,4,5}, {0,6,9},{0,5,9} });

    }
    @Test(expected = IllegalArgumentException.class)
    public void testZeroACases() {
        quadraticEquation.solve(a,b,c);
    }

}
