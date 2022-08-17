package pl.test.excercise1.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.test.excercise1.controller.ShapeController;
import pl.test.excercise1.model.Shapes;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ShapeJsonService {

    public static void generateJson(List<ShapeController> shapes, File file) throws IOException {
        Shapes shapesSerialization = new Shapes(shapes);
        ObjectMapper om = new ObjectMapper();
        om.writeValue(file, shapesSerialization);
    }

    public static List<ShapeController> importJson(File file) throws IOException {
        ObjectMapper om = new ObjectMapper();
        Shapes shapesDeserialization = om.readValue(file, Shapes.class);
        return shapesDeserialization.getShapes();
    }
}