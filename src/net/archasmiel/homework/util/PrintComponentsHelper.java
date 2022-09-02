package net.archasmiel.homework.util;

import net.archasmiel.homework.shapes.*;
import net.archasmiel.homework.shapes.basic.Point;
import net.archasmiel.homework.shapes.basic.Shape;
import net.archasmiel.homework.shapes.basic.SimpleBounded;


/**
 *      Helper for printing {@link Shape Shape} object components. <br><br>
 *
 *      Throws {@link IllegalStateException IllegalStateException} if object is not
 *      implementing {@link SimpleBounded SimpleBounded} interface.
 */
public class PrintComponentsHelper implements PrintComponents {

    public PrintComponentsHelper() {
        // Is user wants to set shape later
    }

    public PrintComponentsHelper(Shape shape) {
        if (shape instanceof SimpleBounded) {
            this.shape = shape;
            return;
        }
        throw new IllegalStateException("Shape instance is not SimpleBounded");
    }

    private Shape shape;

    public void setShape(Shape shape) {
        if (shape instanceof SimpleBounded) {
            this.shape = shape;
            return;
        }
        throw new IllegalStateException("Shape instance is not SimpleBounded");
    }

    @Override
    public void printComponents() {
        if (shape != null) {
            StringBuilder builder = new StringBuilder("[");
            if (shape instanceof Circle circle) {
                builder.append("center={").append(circle.getCenter()).append("}, ");
                builder.append("radius={").append(circle.getRadius()).append("}");
            }
            else if (shape instanceof Line line) {
                addPoints(builder, line.getPoints());
            }
            else if (shape instanceof Polyline polyline) {
                addPoints(builder, polyline.getPoints());
            }
            else if (shape instanceof Quad quad) {
                addPoints(builder, quad.getPoints());
            }
            else if (shape instanceof Triangle triangle) {
                addPoints(builder, triangle.getPoints());
            }
            System.out.println(builder.append("]"));
            return;
        }
        throw new NullPointerException("Given shape is null");
    }

    private void addPoints(StringBuilder builder, Point[] points) {
        for (Point p: points) {
            builder.append("{").append(p).append("}, ");
        }
        builder.delete(builder.length()-2, builder.length());
    }

}
