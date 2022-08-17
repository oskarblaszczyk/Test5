package pl.test.excercise1.model;

import lombok.*;
import pl.test.excercise1.controller.ShapeController;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Circle implements ShapeController {
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
