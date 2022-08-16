package com.epam.rd.autotasks.figures;

class Circle extends Figure{
    private Point Center;
    private double radius;
    public Circle(Point Center, double radius) {
        this.Center=Center;
        this.radius=radius;
    }
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public String pointsToString() {
        return Center.toString();
    }

    @Override
    public Point leftmostPoint() {
        return new Point(this.Center.getX()-radius, this.Center.getY());
    }

    @Override
    public String toString() {
        return "Circle[" + Center.toString()+radius+"]";
    }
}
