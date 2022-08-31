package net.archasmiel.homework.shapes;

import net.archasmiel.homework.shapes.basic.*;

/**
 *     Line <br><br>
 *
 *     Takes Point objects as parameters. <br>
 *     Is {@link SimpleBounded SimpleBounded}.
 */
public class Line extends Shape implements PrintComponents, PrintName {

    public static final String NAME = "line";
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        super(NAME);
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2) + Math.pow(p2.getY()-p1.getY(), 2));
    }

    @Override
    public void printComponents() {
        System.out.println("{" + p1 + ", " + p2 + "}");
    }

    @Override
    public void printName() {
        System.out.println(NAME);
    }

}
