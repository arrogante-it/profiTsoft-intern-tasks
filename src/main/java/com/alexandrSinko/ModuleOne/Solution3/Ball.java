package com.alexandrSinko.ModuleOne.Solution3;

public class Ball extends Figure{

    private int radius;

    public Ball(int radius) {
        this.radius = radius;
    }

    @Override
    double getFigureVolume() {
        return 1.3333333 * Math.PI * (radius * radius * radius);
    }
}
