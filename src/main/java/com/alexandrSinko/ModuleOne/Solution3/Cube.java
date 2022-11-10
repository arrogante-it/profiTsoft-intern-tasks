package com.alexandrSinko.ModuleOne.Solution3;

public class Cube extends Figure {

    private int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    double getFigureVolume() {
        return a * a * a;
    }
}
