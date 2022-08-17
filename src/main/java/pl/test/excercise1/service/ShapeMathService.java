package pl.test.excercise1.service;

import pl.test.excercise1.controller.ShapeController;

import java.util.*;

public class ShapeMathService {

    public static ShapeController biggestArea(List<ShapeController> shapes) {
        return Optional.ofNullable(shapes)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingDouble(ShapeController::area))
                .orElseThrow();
    }

    public static <T> ShapeController biggestPerimeter(List<ShapeController> shapes, Class<T> type) {
        return Optional.ofNullable(shapes)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(s -> s.getClass().equals(type))
                .max(Comparator.comparingDouble(ShapeController::perimeter))
                .orElseThrow();
    }

}
