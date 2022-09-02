package net.archasmiel.homework.util;

import net.archasmiel.homework.shapes.basic.Shape;

/**
 *      Helper for printing {@link Shape Shape} object name.
 */
public class PrintNameHelper implements PrintName {

    public PrintNameHelper() {
        // Is user wants to set shape later
    }

    public PrintNameHelper(Shape shape) {
        this.shape = shape;
    }

    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void printName() {
        if (shape != null) {
            System.out.println(shape.getType());
            return;
        }
        throw new NullPointerException("Given shape is null");
    }
}
