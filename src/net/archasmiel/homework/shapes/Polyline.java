package net.archasmiel.homework.shapes;

import net.archasmiel.homework.shapes.basic.*;

/**
 *     Polyline <br><br>
 *
 *     Takes Point objects as parameters. <br>
 *     Not {@link SimpleBounded SimpleBounded}.
 */
public class Polyline extends Shape implements PrintComponents, PrintName {

    public static final String NAME = "polyline";
    private final Point[] points;

    public Polyline(Point... points) {
        super(NAME);
        this.points = points;
    }

    @Override
    public void printComponents() {
        StringBuilder builder = new StringBuilder("{");
        for (Point point: points) {
            builder.append(point).append(" ");
        }
        builder.deleteCharAt(builder.length()-1).append("}");
        System.out.println(builder);
    }

    @Override
    public void printName() {
        System.out.println(NAME);
    }
}
