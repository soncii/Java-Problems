package com.epam.rd.autotasks.figures;

import java.awt.image.CropImageFilter;

class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle (Point c,  double rad) {
        if (c==null) {
            throw new IllegalArgumentException();
        }
        if (rad<=0) {
            throw new IllegalArgumentException();
        }
        this.center=c;
        this.radius=rad;
    }

    @Override
    public Point centroid() {
        return center;
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure.getClass()== Circle.class) {
            return ((Circle) figure).center.Equals(this.center) && Math.abs(((Circle) figure).radius - this.radius)<=0.001;
        }
        return false;
    }
}
