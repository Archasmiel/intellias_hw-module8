package net.archasmiel.homework.shapes;

import net.archasmiel.homework.shapes.basic.ISimpleBound;
import net.archasmiel.homework.shapes.basic.Point;
import net.archasmiel.homework.shapes.basic.Shape;

/**
 *     Circle <br><br>
 *
 *     Takes Point object and radius size as parameters. <br>
 *     Is {@link net.archasmiel.homework.shapes.basic.ISimpleBound ISimpleBound}.
 */
public class Circle extends Shape implements ISimpleBound {

    private final Point center;
    private final double radius;



    public Circle(Point center, double radius) {
        super("circle");
        this.center = center;
        this.radius = radius;
    }



    @Override
    public void paint() {
        System.out.println(this.getType() + " paint -> {" + "center=" + center + ", " + "radius=" + radius + "}");
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
