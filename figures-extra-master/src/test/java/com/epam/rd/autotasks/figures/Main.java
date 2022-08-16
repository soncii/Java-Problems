package com.epam.rd.autotasks.figures;

public class Main {
    public static void main(String[] args) {
        Figure a = new Triangle(new Point(1,2), new Point(5,3), new Point(6,4));
        Figure b = new Circle(new Point(5,4),2);
        Figure c= new Triangle(new Point(1,2), new Point(5,3), new Point(6,4));
        System.out.println(c.isTheSame(b));
        System.out.println(c.isTheSame(a));


    }
}
