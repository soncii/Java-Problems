package com.epam.rd.autotasks.triangle;

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

    public boolean Equals(Point another) {
        if (this.x== another.getX() && this.y== another.getY()) return true;
        return false;
    }
}
