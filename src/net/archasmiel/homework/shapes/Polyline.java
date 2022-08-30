package net.archasmiel.homework.shapes;

import net.archasmiel.homework.shapes.basic.Point;
import net.archasmiel.homework.shapes.basic.Shape;

/**
 *     Polyline <br><br>
 *
 *     Takes Point objects as parameters. <br>
 *     Not {@link net.archasmiel.homework.shapes.basic.ISimpleBound ISimpleBound}.
 */
public class Polyline extends Shape {

    private final Point[] points;



    public Polyline(Point... points) {
        super("polyline");
        this.points = points;
    }



    @Override
    public void paint() {
        StringBuilder builder = new StringBuilder(this.getType() + " paint -> {");
        for (Point point: points) {
            builder.append(point).append(" ");
        }
        builder.deleteCharAt(builder.length()-1).append("}");
        System.out.println(builder);
    }
}
