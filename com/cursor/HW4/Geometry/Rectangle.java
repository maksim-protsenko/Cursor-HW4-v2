package com.cursor.HW4.Geometry;

import java.util.List;

public class Rectangle extends PlaneShape {
    private double width;
    private double height;

    public Rectangle(List<Double> vertices, double width, double height) {
        super(vertices);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangle {");
        sb.append("vertices = ").append(vertices);
        sb.append(", perimeter of rectangle = ").append(getPerimeter());
        sb.append(", area of rectangle = ").append(getArea());
        sb.append("}\n");
        return sb.toString();
    }
}
