package net.archasmiel.homework.util;

import net.archasmiel.homework.shapes.basic.Shape;

public class ShapeHelper {

    public static void printName(Shape shape) {
        System.out.println("Name of shape is " + shape.getType());
    }

    public static void paintShape(Shape shape) {
        shape.paint();
    }


}
