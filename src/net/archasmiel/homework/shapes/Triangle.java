package net.archasmiel.homework.shapes;

import net.archasmiel.homework.shapes.basic.ISimpleBound;
import net.archasmiel.homework.shapes.basic.Point;
import net.archasmiel.homework.shapes.basic.Shape;
import net.archasmiel.homework.util.MathHelper;

/**
 *     Triangle <br><br>
 *
 *     Takes Point objects as parameters. <br>
 *     Is {@link net.archasmiel.homework.shapes.basic.ISimpleBound ISimpleBound}.
 */
public class Triangle extends Shape implements ISimpleBound {

    private final Point p1;
    private final Point p2;
    private final Point p3;



    public Triangle(Point p1, Point p2, Point p3) {
        super("triangle");
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }



    @Override
    public void paint() {
        System.out.println(this.getType() + " paint -> {" + p1 + ", " + p2 + ", " + p3 + "}");
    }



    @Override
    public double getHeight() {
        return MathHelper.findRange(p1.getY(), p2.getY(), p3.getY());
    }

    @Override
    public double getWidth() {
        return MathHelper.findRange(p1.getX(), p2.getX(), p3.getX());
    }
}
