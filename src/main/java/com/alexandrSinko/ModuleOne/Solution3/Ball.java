package com.alexandrSinko.ModuleOne.Solution3;

public class Ball implements Figure{

    private int radius;

    private static final double VARIABLE = 1.3333333;

    public Ball(int radius) {
        this.radius = radius;
    }

    @Override
    public double getFigureVolume() {
        return VARIABLE * Math.PI * (radius * radius * radius);
    }
}
