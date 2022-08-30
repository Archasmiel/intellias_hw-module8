package net.archasmiel.homework.shapes.basic;

/**
 *     Shape abstract <br><br>
 *
 *     Takes type parameter. <br>
 */
public abstract class Shape implements IPaint, IPrintName {

    private final String type;



    protected Shape(String type) {
        this.type = type;
    }



    public String getType() {
        return type;
    }



    @Override
    public void printName() {
        System.out.println(getType());
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }


}
