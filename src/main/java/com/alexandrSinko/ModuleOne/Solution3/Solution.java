package com.alexandrSinko.ModuleOne.Solution3;

// ProfiTsoft, task 3.
// Implement a method that sorts geometric 3D shapes by volume.
// The method takes as a parameter a collection of arbitrary geometric shapes
// (cube, sphere, cylinder).
// Write unit tests for the method.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    static Cube cube = new Cube(15);
    static Ball ball = new Ball(30);
    static Cylinder cylinder = new Cylinder(45, 25);

//    public static void main(String[] args) {
//
//        List<Figure> figures = new ArrayList<>();
//        figures.add(ball);
//        figures.add(cube);
//        figures.add(cylinder);
//
//        sortingFigures(figures);
//    }

    public static List<Double> sortingFigures(List<Figure> figures){

        List<Double> volumes = new ArrayList<>();

        for (Figure f : figures){
            volumes.add(f.getFigureVolume());
        }

        Collections.sort(volumes);
        Collections.reverse(volumes);

        return volumes;
    }
}
