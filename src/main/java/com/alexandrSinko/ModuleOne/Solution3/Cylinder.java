package com.alexandrSinko.ModuleOne.Solution3;

public class Cylinder extends Figure{

    private int height;

    private int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    double getFigureVolume() {
        return Math.PI * (radius*radius) + height;
    }
}
