package com.epam.rd.autotasks.figures;

class Quadrilateral extends  Figure{
    private Point A;
    private Point B;
    private Point C;

    private Point D;

    public Quadrilateral(Point A, Point B, Point C, Point D) {
        this.A=A;
        this.B=B;
        this.C=C;
        this.D=D;
    }
    @Override
    public double area() {
       Triangle a = new Triangle(A,B,C);
       Triangle b = new Triangle(A,C,D);

       return a.area()+ b.area();

    }

    @Override
    public String pointsToString() {
        return A.toString()+B.toString()+C.toString()+D.toString();

    }

    @Override
    public Point leftmostPoint() {
        if (this.A.getX()<=this.B.getX() && this.A.getX()<=this.C.getX() && this.A.getX()<=this.D.getX()) {
            return this.A;
        } else if (this.B.getX()<=this.A.getX() && this.B.getX()<=this.C.getX() && this.B.getX()<=this.D.getX()) {
            return this.B;
        } else if (this.C.getX()<=this.A.getX() && this.C.getX()<=this.B.getX() && this.C.getX()<=this.D.getX()) {
            return this.C;
        }
        return  D;
    }

    @Override
    public String toString() {
        return "Quadrilateral["+A.toString()+B.toString()+C.toString()+D.toString()+"]";
    }
}
