package pl.test.excercise1;


import pl.test.excercise1.model.Shape;
import pl.test.excercise1.model.Square;
import pl.test.excercise1.model.Circle;
import pl.test.excercise1.service.ShapeService;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws IOException {
        Square s1 = new Square(2);
        Circle t1 = new Circle(2);

        List<Shape> triangles = Optional.ofNullable(Shape.getShapes())
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(p -> p.getClass().equals(Circle.class))
                .toList();
        System.out.println(triangles);
        System.out.println(Shape.getShapes());
        System.out.println(t1.getType());
        System.out.println(s1.area());
        System.out.println(t1.area());
        System.out.println(ShapeService.biggestArea(Shape.getShapes()));
        System.out.println(ShapeService.biggestPerimeter(Shape.getShapes(), "square"));

        System.out.println();
        System.out.println(Shape.getShapes());
        System.out.println();

        ShapeService.generateJson(Shape.getShapes(), new File("file"));

        System.out.println(ShapeService.importJson(new File("file")));


    }
}
