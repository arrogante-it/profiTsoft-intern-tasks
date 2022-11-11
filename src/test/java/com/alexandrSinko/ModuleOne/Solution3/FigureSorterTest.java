package com.alexandrSinko.ModuleOne.Solution3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FigureSorterTest {

    @Test
    void sortingFigures() {
        Ball ball = new Ball(30);
        Cube cube = new Cube(15);
        Cylinder cylinder = new Cylinder(45,25);

        List<Figure> list = new ArrayList<>();
        Collections.addAll(list, ball, cube, cylinder);

        List<Double> expected = FigureSorter.sortingFigures(list);

        List<Double> actual = new ArrayList<>();
        actual.add(113097.33270179917);    // ball
        actual.add(3375.0);                // cube
        actual.add(2008.4954084936207);    // cylinder

        Assert.assertThat(expected, is(actual));
    }
}
























































