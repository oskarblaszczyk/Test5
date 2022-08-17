package pl.test.excercise1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import pl.test.excercise1.controller.ShapeController;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Shapes {
    private List<ShapeController> shapes;
}
