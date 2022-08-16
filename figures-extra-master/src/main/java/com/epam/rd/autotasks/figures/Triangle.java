package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
    private Point A;
    private Point B;
    private Point C;
    public Triangle(Point a, Point b, Point c) throws IllegalArgumentException {
        if ( a==null || b==null || c==null ) {
            throw new IllegalArgumentException();
        }
         if (a.Equals(b) || b.Equals(c) || c.Equals(a) ) {
             throw new IllegalArgumentException();
         }
        this.A=a;
        this.B=b;
        this.C=c;
        if (area()<=0) {
            throw new IllegalArgumentException();
        }


    }

    public double area() {
        return Math.abs(this.A.getX()*this.B.getY()-this.A.getX()*this.C.getY()+this.B.getX()*this.C.getY()-
                this.B.getX()*this.A.getY()+this.C.getX()*this.A.getY()-this.C.getX()*this.B.getY())/2;
    }

    @Override
    public Point centroid() {
        return new Point((A.getX()+B.getX()+ C.getX())/3, (A.getY()+ B.getY()+ C.getY())/3);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure.getClass()== Triangle.class) {
            return ((Triangle) figure).A.Equals(this.A) &&((Triangle) figure).B.Equals(this.B) && ((Triangle) figure).C.Equals(this.C);
        }
        return false;
    }
}
