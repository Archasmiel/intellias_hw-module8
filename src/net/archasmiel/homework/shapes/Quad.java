package net.archasmiel.homework.shapes;

import net.archasmiel.homework.shapes.basic.*;
import net.archasmiel.homework.util.MathHelper;

/**
 *     Quad <br><br>
 *
 *     Takes Point objects as parameters <br>
 *     Is {@link SimpleBounded SimpleBounded}
 */
public class Quad extends Shape implements SimpleBounded, OnlyPoints {

    public static final String NAME = "quad";

    private final Point p1;
    private final Point p2;
    private final Point p3;
    private final Point p4;

    public Quad(Point p1, Point p2, Point p3, Point p4) {
        super(NAME);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    public Point[] getPoints() {
        return new Point[]{ p1, p2, p3, p4 };
    }

    @Override
    public double getHeight() {
        return MathHelper.findRange(p1.getY(), p2.getY(), p3.getY(), p4.getY());
    }

    @Override
    public double getWidth() {
        return MathHelper.findRange(p1.getX(), p2.getX(), p3.getX(), p4.getX());
    }

    @Override
    public String toString() {
        return "Quad{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                '}';
    }
}
