package com.cursor.HW4.Geometry;

import java.util.List;

public class SquarePyramid extends SpaceShape {
    private double baseWidth;
    private double baseHeight;

    public SquarePyramid(List<Double> vertices, double baseWidth, double baseHeight) {
        super(vertices);
        this.baseWidth = baseWidth;
        this.baseHeight = baseHeight;
    }

    @Override
    public double getArea() {
        double apothem = Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(baseHeight, 2));
        double areaOfSingleSide = baseWidth * apothem / 2;
        return Math.pow(baseWidth, 2) + 4 * areaOfSingleSide;
    }

    @Override
    public double getVolume() {
        return baseHeight * Math.pow(baseWidth, 2) / 3;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SquarePyramid {");
        sb.append("vertices = ").append(vertices);
        sb.append(", area of square pyramid = ").append(getArea());
        sb.append(", volume of square pyramid = ").append(getVolume());
        sb.append("}\n");
        return sb.toString();
    }
}