package net.archasmiel.homework.shapes;

import net.archasmiel.homework.shapes.basic.*;

/**
 *     Circle <br><br>
 *
 *     Takes Point object and radius size as parameters. <br>
 *     Is {@link SimpleBounded SimpleBounded}.
 */
public class Circle extends Shape implements SimpleBounded {

    public Circle(Point center, double radius) {
        super(NAME);
        this.center = center;
        this.radius = radius;
    }
    public static final String NAME = "circle";

    private final Point center;
    private final double radius;

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getHeight() {
        return radius*2;
    }

    @Override
    public double getWidth() {
        return radius*2;
    }

}
