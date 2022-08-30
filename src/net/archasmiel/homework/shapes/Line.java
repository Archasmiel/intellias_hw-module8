package net.archasmiel.homework.shapes;

import net.archasmiel.homework.shapes.basic.ISimpleBound;
import net.archasmiel.homework.shapes.basic.Point;
import net.archasmiel.homework.shapes.basic.Shape;

/**
 *     Line <br><br>
 *
 *     Takes Point objects as parameters. <br>
 *     Is {@link net.archasmiel.homework.shapes.basic.ISimpleBound ISimpleBound}.
 */
public class Line extends Shape implements ISimpleBound {

    private final Point p1;
    private final Point p2;



    public Line(Point p1, Point p2) {
        super("line");
        this.p1 = p1;
        this.p2 = p2;
    }



    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }



    public double getHeight() {
        return p2.getY() - p1.getY();
    }

    public double getWidth() {
        return p2.getX() - p1.getX();
    }

    public double getLength() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }



    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    @Override
    public void paint() {
        System.out.println(this.getType() + " paint -> {" + p1 + ", " + p2 + "}");
    }
}
