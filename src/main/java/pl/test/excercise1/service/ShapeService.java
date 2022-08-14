package pl.test.excercise1.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.test.excercise1.model.Shape;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class ShapeService {

    public static Shape biggestArea(List<Shape> shapes){
        return Optional.ofNullable(shapes)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingDouble(Shape::area))
                .orElseThrow();
    }

    public static Shape biggestPerimeter(List<Shape> shapes, String type){
        return Optional.ofNullable(shapes)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(s -> s.getType().equals(type))
                .max(Comparator.comparingDouble(Shape::perimeter))
                .orElseThrow();
    }

    public static void generateJson(List<Shape> shapes, File file) throws IOException {
        ObjectMapper om = new ObjectMapper();
        om.writeValue(file, shapes);
    }

    public static List<Shape> importJson(File file) throws IOException {
        ObjectMapper om = new ObjectMapper();
        JsonNode node = om.readTree(file);

        for (JsonNode jsonNode : node) {
            System.out.println(jsonNode);
        }


        return null;
//                om.readValue(file, new TypeReference<List<Shape>>() {
//        });



    }

}
