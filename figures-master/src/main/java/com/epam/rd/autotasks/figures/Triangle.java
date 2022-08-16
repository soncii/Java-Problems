package com.epam.rd.autotasks.figures;

import java.text.Format;

class Triangle extends Figure{
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point A, Point B, Point C) {
        this.A=A;
        this.B=B;
        this.C=C;
    }
    @Override
    public double area() {
            return Math.abs(this.A.getX()*this.B.getY()-this.A.getX()*this.C.getY()+this.B.getX()*this.C.getY()-
                    this.B.getX()*this.A.getY()+this.C.getX()*this.A.getY()-this.C.getX()*this.B.getY())/2;
    }

    @Override
    public String pointsToString() {
        return A.toString()+B.toString()+C.toString();

    }

    @Override
    public Point leftmostPoint() {
        if (this.A.getX()<=this.B.getX() && this.A.getX()<=this.C.getX()) {
            return this.A;
        } else if (this.B.getX()<=this.A.getX() && this.B.getX()<=this.C.getX()) {
            return this.B;
        }
        return  this.C;
    }

    @Override
    public String toString() {
        return "Triangle["+A.toString()+B.toString()+C.toString()+"]";
    }
}
