package pl.test.excercise1.model;


import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import pl.test.excercise1.interfaces.ShapeController;

@AllArgsConstructor
@ToString
public class Circle extends Shape{
    @NonNull
    private double radius;


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
