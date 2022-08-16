package com.epam.rd.autotasks.figures;

import java.util.HashSet;

class Quadrilateral extends Figure {
    private final Point A;
    private final Point B;
    private final Point C;

    private final Point D;

    public Quadrilateral(Point A, Point B, Point C, Point D) throws IllegalArgumentException {
        if (A==null || B==null || C==null || D==null) {
            throw new IllegalArgumentException();
        }
        if (A.coline(B,C) || A.coline(B,D) || B.coline(C,D) || D.coline(B,C)){
            throw new IllegalArgumentException();
        }
        this.A=A;
        this.B=B;
        this.C=C;
        this.D=D;
        Segment d1 = new Segment(A,C);
        Segment d2 = new Segment(B,D);
        Point d = d1.intersection(d2);
        Triangle a = new Triangle(A,d,D);
        Triangle b = new Triangle(A,d,B);
        Triangle c = new Triangle(B,d,C);
        Triangle last = new Triangle(C,d,D);
        if (area()<=0) {
            throw new IllegalArgumentException();
        }
    }
    public double area() {
        Triangle a = new Triangle(A,B,C);
        Triangle b = new Triangle(A,C,D);

        return a.area()+ b.area();

    }

    @Override
    public Point centroid() {
        Triangle a = new Triangle(B,C,D);
        Triangle b = new Triangle(A,C,D);
        Triangle c = new Triangle(A,B,D);
        Triangle d = new Triangle(A,B,C);
        Segment ac= new Segment(a.centroid(),c.centroid());
        Segment bd= new Segment(b.centroid(),d.centroid());
        return ac.intersection(bd);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure.getClass()== Quadrilateral.class) {
            double[][] temp = new double[][]{{A.getX(),A.getY()},{B.getX(),B.getY()},{C.getX(),C.getY()},
                    {D.getX(),D.getY()}};
            if (check(temp, ((Quadrilateral) figure).A)) return false;
            if (check(temp, ((Quadrilateral) figure).B)) return false;
            if (check(temp, ((Quadrilateral) figure).C)) return false;
            if (check(temp, ((Quadrilateral) figure).D)) return false;
            return true;

//            Segment[] these = {new Segment(A,B),new Segment(A,D),new Segment(C,B),new Segment(C,D)};
//            Segment[] other = {new Segment(((Quadrilateral) figure).A,((Quadrilateral) figure).B),
//                    new Segment(((Quadrilateral) figure).A,((Quadrilateral) figure).D),
//                    new Segment(((Quadrilateral) figure).C,((Quadrilateral) figure).B),
//                    new Segment(((Quadrilateral) figure).C,((Quadrilateral) figure).A)};
//            HashSet<Double> res = new HashSet<Double>();
//            for (int i = 0; i < 4; i++) {
//                res.add(these[i].length());
//                res.add(other[i].length());
//            }
//            System.out.println(res);
//            if (res.size()<=4) return true;
        }
        return false;
    }
    public static boolean check(double[][]temp, Point a) {
        for (double[] doubles : temp) {
            if (Math.abs(a.getX() - doubles[0])<0.01 && Math.abs(a.getY() - doubles[1])<0.01) {
                return false;
            }
        }
        return true;
    }
}
