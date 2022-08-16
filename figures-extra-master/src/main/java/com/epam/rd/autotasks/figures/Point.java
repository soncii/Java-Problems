package com.epam.rd.autotasks.figures;

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }
    public Point mid(Point end) {
        return new Point((this.getX()+end.getX())/2, (this.getY()+end.getY())/2 );
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean Equals(Point a) {
        if (Math.abs(a.getY()-this.getY())<=0.001 && Math.abs(a.getX()-this.getX())<=0.001) {
            return true;
        }
        return false;
    }
    public boolean coline(Point a, Point b) {
        if (Math.abs(((this.getY()-a.getY())/(this.getX()-a.getX()))-((this.getY()-b.getY())/(this.getX()-b.getX())))<0.01) {
            return true;
        }
        return false;
    }

}
