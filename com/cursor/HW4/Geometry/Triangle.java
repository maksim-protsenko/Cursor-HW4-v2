package com.cursor.HW4.Geometry;

import java.util.List;

public class Triangle extends PlaneShape {
    double x = vertices.get(0);
    double y = vertices.get(1);
    double x1 = vertices.get(2);
    double y1 = vertices.get(3);
    double z = vertices.get(4);
    double z1 = vertices.get(4);

    double edgeA = getDistanceBetweenVertices2D(x, y, x1, y1);
    double edgeB = getDistanceBetweenVertices2D(y, z, y1, z1);
    double edgeC = getDistanceBetweenVertices2D(z, x, z1, x1);

    public Triangle(List<Double> vertices) {
        super(vertices);
    }

    @Override
    public double getPerimeter() {
        return edgeA + edgeB + edgeC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - edgeA) * (p - edgeB) * (p - edgeC));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangle {");
        sb.append("vertices of triangle = ").append(vertices);
        sb.append(", perimeter of triangle = ").append(getPerimeter());
        sb.append(", area of triangle = ").append(getArea());
        sb.append("}\n");
        return sb.toString();
    }
}