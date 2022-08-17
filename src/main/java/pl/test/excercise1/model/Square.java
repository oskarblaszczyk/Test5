package pl.test.excercise1.model;

import lombok.*;
import pl.test.excercise1.controller.ShapeController;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Square implements ShapeController {
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
