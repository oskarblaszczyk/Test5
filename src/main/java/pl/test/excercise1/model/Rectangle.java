package pl.test.excercise1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import pl.test.excercise1.interfaces.ShapeController;


@AllArgsConstructor
@Getter
@ToString
public class Rectangle extends Shape{
    @NonNull
    private double width;
    @NonNull
    private double height;


    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
