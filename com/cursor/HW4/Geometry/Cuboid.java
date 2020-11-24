package com.cursor.HW4.Geometry;

import java.util.List;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(List<Double> vertices, double width, double height, double depth) {
        super(vertices);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return (width * height + height * depth + depth * width) * 2;
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cuboid {");
        sb.append("width = ").append(width);
        sb.append(", height = ").append(height);
        sb.append(", depth = ").append(depth);
        sb.append(", vertices = ").append(vertices);
        sb.append(", area of cuboid = ").append(getArea());
        sb.append(", volume of cuboid = ").append(getVolume());
        sb.append("}\n");
        return sb.toString();
    }
}
