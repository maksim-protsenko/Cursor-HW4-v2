package com.cursor.HW4.Geometry;

import java.util.List;

public class Circle extends PlaneShape {
    private double radiusOfCircle;

    public Circle(List<Double> vertices, double radiusOfCircle) {
        super(vertices);
        this.vertices = vertices;
        this.radiusOfCircle = radiusOfCircle;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radiusOfCircle, 2);
    }

    @Override
    public double getPerimeter() {
        return radiusOfCircle * 2 * Math.PI;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\nCircle {");
        sb.append("vertex = ").append(vertices);
        sb.append(", radius of circle =").append(radiusOfCircle);
        sb.append(", perimeter of circle = ").append(getPerimeter());
        sb.append(", area of circle = ").append(getArea());
        sb.append("}\n");
        return sb.toString();
    }
}
