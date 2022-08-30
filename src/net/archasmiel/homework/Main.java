package net.archasmiel.homework;

import net.archasmiel.homework.shapes.basic.Point;
import net.archasmiel.homework.shapes.basic.Shape;
import net.archasmiel.homework.shapes.*;
import net.archasmiel.homework.util.ShapeHelper;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(3, 3);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(5, 5);
        Point p4 = new Point(6, 6);


        Shape circle = new Circle(p1, 10);
        ShapeHelper.printName(circle);
        ShapeHelper.paintShape(circle);
        System.out.println();



        Shape line = new Line(p1, p2);
        ShapeHelper.printName(line);
        ShapeHelper.paintShape(line);
        System.out.println();



        Shape triangle = new Triangle(p1, p2, p3);
        ShapeHelper.printName(triangle);
        ShapeHelper.paintShape(triangle);
        System.out.println();



        Shape quad = new Quad(p1, p2, p3, p4);
        ShapeHelper.printName(quad);
        ShapeHelper.paintShape(quad);
        System.out.println();



        Shape polyline = new Polyline(p1, p2, p3, p4);
        ShapeHelper.printName(polyline);
        ShapeHelper.paintShape(polyline);
        System.out.println();
    }

}
