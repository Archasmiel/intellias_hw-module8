package net.archasmiel.homework.shapes;

import net.archasmiel.homework.shapes.basic.*;

/**
 *     Polyline <br><br>
 *
 *     Takes Point objects as parameters. <br>
 *     Not {@link SimpleBounded SimpleBounded}.
 */
public class Polyline extends Shape implements OnlyPoints {

    public Polyline(Point... points) {
        super(NAME);
        this.points = points;
    }
    public static final String NAME = "polyline";

    private final Point[] points;

    @Override
    public Point[] getPoints() {
        return points;
    }

}
