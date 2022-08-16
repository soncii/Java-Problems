package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        double D = b * b - 4 * a * c;
        if (D < 0) {
            return "no roots";
        } else if (D == 0) {
            return String.valueOf((((-b + Math.sqrt(D)) / 2 / a)));
        }
        return String.valueOf((-b + Math.sqrt(D)) / (2 * a) + " " +
                (-b - Math.sqrt(D)) / (2 * a));


    }
}