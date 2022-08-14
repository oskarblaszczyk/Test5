package pl.test.excercise1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public abstract class Shape{
    private String type;

    private static List<Shape> shapes  = new ArrayList<>();

    public Shape() {
        this.type = this.getClass().getSimpleName().toLowerCase(Locale.ROOT);
        shapes.add(this);
    }

    public String getType() {
        return type;
    }

    public static List<Shape> getShapes() {
        return shapes;
    }


    public abstract double area();

    public abstract double perimeter();
}
