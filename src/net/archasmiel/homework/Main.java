package net.archasmiel.homework;

import net.archasmiel.homework.shapes.*;
import net.archasmiel.homework.shapes.basic.Point;
import net.archasmiel.homework.shapes.basic.Shape;
import net.archasmiel.homework.util.PrintHelper;

public class Main {

    public static final String EXCEPTION_MSG = "EXCEPTION RETRIEVED: ";

    public static void main(String[] args) {
        Point p1 = new Point(3, 3);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(5, 5);
        Point p4 = new Point(6, 6);

        PrintHelper printHelper = new PrintHelper();

        try {
            Shape circle = new Circle(p1, 10);
            printHelper.printName(circle);
            printHelper.printComponents(circle);
        } catch (IllegalStateException e) {
            System.out.println(EXCEPTION_MSG + e.getMessage());
        } finally {
            System.out.println();
        }


        try {
            Shape line = new Line(p1, p2);
            printHelper.printName(line);
            // throws exception
            printHelper.printComponents(line);
        } catch (IllegalStateException e) {
            System.out.println(EXCEPTION_MSG + e.getMessage());
        } finally {
            System.out.println();
        }


        try {
            Shape triangle = new Triangle(p1, p2, p3);
            printHelper.printName(triangle);
            printHelper.printComponents(triangle);
        } catch (IllegalStateException e) {
            System.out.println(EXCEPTION_MSG + e.getMessage());
        } finally {
            System.out.println();
        }


        try {
            Shape quad = new Quad(p1, p2, p3, p4);
            printHelper.printName(quad);
            printHelper.printComponents(quad);
        } catch (IllegalStateException e) {
            System.out.println(EXCEPTION_MSG + e.getMessage());
        } finally {
            System.out.println();
        }


        try {
            Shape polyline = new Polyline(p1, p2, p3, p4);
            printHelper.printName(polyline);
            // throws exception
            printHelper.printComponents(polyline);
        } catch (IllegalStateException e) {
            System.out.println(EXCEPTION_MSG + e.getMessage());
        } finally {
            System.out.println();
        }

    }

}
