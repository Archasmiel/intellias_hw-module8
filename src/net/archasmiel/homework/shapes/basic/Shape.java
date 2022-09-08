package net.archasmiel.homework.shapes.basic;

/**
 *     Shape abstract <br><br>
 *
 *     Takes type parameter. <br>
 */
public abstract class Shape {

    private final String type;

    protected Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }

}
