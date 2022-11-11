package com.alexandrSinko.ModuleOne.Solution3;

public class Cube implements Figure {

    private int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double getFigureVolume() {
        return a * a * a;
    }
}
