package pl.test.excercise1.model;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import pl.test.excercise1.interfaces.ShapeController;

@AllArgsConstructor
@ToString
public class Square extends Shape{
    @NonNull
    private double a;

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
