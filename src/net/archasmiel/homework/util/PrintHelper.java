package net.archasmiel.homework.util;

import net.archasmiel.homework.shapes.*;
import net.archasmiel.homework.shapes.basic.OnlyPoints;
import net.archasmiel.homework.shapes.basic.Point;
import net.archasmiel.homework.shapes.basic.Shape;

import java.util.Arrays;

/**
 *      Helper for printing {@link Shape Shape} object name.
 */
public class PrintHelper implements PrintName, PrintComponents {

    @Override
    public void printName(Shape shape) {
        if (shape != null) {
            System.out.println(shape.getType());
            return;
        }
        throw new NullPointerException("Given shape is null");
    }

    @Override
    public void printComponents(Shape shape) {
        if (shape != null) {
            StringBuilder builder = new StringBuilder("[");

            if (shape instanceof OnlyPoints pointed) {
                addPoints(builder, pointed.getPoints());
            }
            else if (shape instanceof Circle circle) {
                builder.append("center={").append(circle.getCenter()).append("}, ");
                builder.append("radius={").append(circle.getRadius()).append("}");
            }

            System.out.println(builder.append("]"));
            return;
        }

        throw new NullPointerException("Given shape is null");
    }

    private void addPoints(StringBuilder builder, Point[] points) {
        Arrays.stream(points).forEach(p -> builder.append("{").append(p).append("}, "));
        builder.delete(builder.length()-2, builder.length());
    }
}
