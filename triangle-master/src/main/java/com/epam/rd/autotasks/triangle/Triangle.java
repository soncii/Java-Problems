package com.epam.rd.autotasks.triangle;

class Triangle {
    private Point A;
    private Point B;
    private  Point C;

    private double lineLen(Point x, Point y) {
        return Math.sqrt(Math.pow(x.getX()-y.getX(),2) + Math.pow(x.getY()-y.getY(),2));
    }
    public Triangle(Point a, Point b, Point c) {
        //TODO
        if (a.Equals(b) || a.Equals(c) || b.Equals(c)) {
            throw new RuntimeException();
        }
        if (lineLen(a,b)>=lineLen(b,c)+lineLen(a,c) || lineLen(a,c)>=lineLen(a,b)+lineLen(b,c) ||
                lineLen(b,c)>=lineLen(a,b)+lineLen(a,c)) {
            throw new RuntimeException();
        }
        A=a;
        B=b;
        C=c;
    }

    public double area() {
        //TODO
        return Math.abs(this.A.getX()*this.B.getY()-this.A.getX()*this.C.getY()+this.B.getX()*this.C.getY()-
                this.B.getX()*this.A.getY()+this.C.getX()*this.A.getY()-this.C.getX()*this.B.getY())/2;
    }

    public Point centroid(){
        //TODO
        return new Point((A.getX()+B.getX()+ C.getX())/3, (A.getY()+ B.getY()+ C.getY())/3);
    }

}
