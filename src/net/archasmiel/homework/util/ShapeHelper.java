package net.archasmiel.homework.util;

import net.archasmiel.homework.shapes.basic.PrintComponents;
import net.archasmiel.homework.shapes.basic.PrintName;
import net.archasmiel.homework.shapes.basic.Shape;

public class ShapeHelper {

    public static void printName(Shape shape) {
        if (shape instanceof PrintName named) {
            named.printName();
            return;
        }
        throw new IllegalStateException("Shape '" + shape.getType() + "' can't display name!");
    }

    public static void printComponents(Shape shape) {
        if (shape instanceof PrintComponents componented) {
            componented.printComponents();
            return;
        }
        throw new IllegalStateException("Shape '" + shape.getType() + "' doesn't have any components!");
    }


}
