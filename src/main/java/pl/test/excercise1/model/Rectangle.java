package pl.test.excercise1.model;

import lombok.*;
import pl.test.excercise1.controller.ShapeController;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle implements ShapeController {
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
