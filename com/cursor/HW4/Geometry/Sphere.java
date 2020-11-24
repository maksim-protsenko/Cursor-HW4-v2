package com.cursor.HW4.Geometry;

import java.util.List;

public class Sphere extends SpaceShape {
    private double radiusOfSphere;

    public Sphere(List<Double> vertices, double radiusOfSphere) {
        super(vertices);
        this.radiusOfSphere = radiusOfSphere;
    }

    @Override
    public void setVertices(List<Double> vertices) {
        super.setVertices(vertices);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radiusOfSphere, 2);
    }

    @Override
    public double getVolume() {
        return 4 / 3 * (Math.PI * Math.pow(radiusOfSphere, 3));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sphere {");
        sb.append("vertex = ").append(vertices);
        sb.append(" radius of sphere = ").append(radiusOfSphere);
        sb.append(", area of sphere = ").append(getArea());
        sb.append(", volume of sphere = ").append(getVolume());
        sb.append("}\n");
        return sb.toString();
    }
}
