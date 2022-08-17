import pl.test.excercise1.model.Rectangle;
import pl.test.excercise1.model.Square;
import pl.test.excercise1.model.Circle;
import pl.test.excercise1.service.ShapeJsonService;
import pl.test.excercise1.service.ShapeMathService;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Square s1 = new Square(2);
        Circle c1 = new Circle(2);
        Rectangle r1 = new Rectangle(6, 6);

        System.out.println(ShapeMathService.biggestArea(Arrays.asList(s1, c1, r1)));
        System.out.println(ShapeMathService.biggestPerimeter(Arrays.asList(s1, c1, r1), Square.class));

        ShapeJsonService.generateJson(Arrays.asList(s1, c1, r1), new File("file"));

        System.out.println(ShapeJsonService.importJson(new File("file")));
    }
}
