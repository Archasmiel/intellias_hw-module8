package net.archasmiel.homework;

import net.archasmiel.homework.shapes.basic.Point;
import net.archasmiel.homework.shapes.basic.Shape;
import net.archasmiel.homework.shapes.*;
import net.archasmiel.homework.util.PrintComponentsHelper;
import net.archasmiel.homework.util.PrintNameHelper;

public class Main {

    public static final String EXCEPTION_MSG = "EXCEPTION RETRIEVED: ";

    public static void main(String[] args) {
        Point p1 = new Point(3, 3);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(5, 5);
        Point p4 = new Point(6, 6);

        PrintComponentsHelper printComponentsHelper = new PrintComponentsHelper();
        PrintNameHelper printNameHelper = new PrintNameHelper();

        try {
            Shape circle = new Circle(p1, 10);
            printNameHelper.setShape(circle);
            printNameHelper.printName();
            printComponentsHelper.setShape(circle);
            printComponentsHelper.printComponents();
        } catch (IllegalStateException e) {
            System.out.println(EXCEPTION_MSG + e.getMessage());
        } finally {
            System.out.println();
        }


        try {
            Shape line = new Line(p1, p2);
            printNameHelper.setShape(line);
            printNameHelper.printName();
            printComponentsHelper.setShape(line);
            // throws exception
            printComponentsHelper.printComponents();
        } catch (IllegalStateException e) {
            System.out.println(EXCEPTION_MSG + e.getMessage());
        } finally {
            System.out.println();
        }


        try {
            Shape triangle = new Triangle(p1, p2, p3);
            printNameHelper.setShape(triangle);
            printNameHelper.printName();
            printComponentsHelper.setShape(triangle);
            printComponentsHelper.printComponents();
        } catch (IllegalStateException e) {
            System.out.println(EXCEPTION_MSG + e.getMessage());
        } finally {
            System.out.println();
        }


        try {
            Shape quad = new Quad(p1, p2, p3, p4);
            printNameHelper.setShape(quad);
            printNameHelper.printName();
            printComponentsHelper.setShape(quad);
            printComponentsHelper.printComponents();
        } catch (IllegalStateException e) {
            System.out.println(EXCEPTION_MSG + e.getMessage());
        } finally {
            System.out.println();
        }


        try {
            Shape polyline = new Polyline(p1, p2, p3, p4);
            printNameHelper.setShape(polyline);
            printNameHelper.printName();
            printComponentsHelper.setShape(polyline);
            // throws exception
            printComponentsHelper.printComponents();
        } catch (IllegalStateException e) {
            System.out.println(EXCEPTION_MSG + e.getMessage());
        } finally {
            System.out.println();
        }

    }

}
