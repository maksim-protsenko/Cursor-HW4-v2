package com.cursor.HW4.Geometry;

import java.util.List;

public abstract class Shape {
    public List<Double> vertices;

    public List<Double> getVertices() {
        return vertices;
    }

    public void setVertices(List<Double> vertices) {
        this.vertices = vertices;
    }

    public Shape(List<Double> vertices) {
        this.vertices = vertices;
    }
}