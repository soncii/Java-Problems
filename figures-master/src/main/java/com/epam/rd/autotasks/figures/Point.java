package com.epam.rd.autotasks.figures;

import java.text.Format;

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        String X = String.valueOf(x);
        String.format(X, "%.1d");
        String Y = String.valueOf(y);
        String.format(Y, "%.1d");
        return "("+X+","+Y+")";
    }
}
