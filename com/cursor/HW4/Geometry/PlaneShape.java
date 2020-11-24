
package com.cursor.HW4.Geometry;

import com.cursor.HW4.Geometry.interfaces.AreaMeasurable;
import com.cursor.HW4.Geometry.interfaces.PerimeterMeasurable;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(List<Double> vertices) {
        super(vertices);
        this.vertices = vertices;
    }

    public List<Double> getVertices() {
        return vertices;
    }

    public static double getDistanceBetweenVertices2D(double x, double y, double x1, double y1) {
        return Math.sqrt(Math.pow((x - x1), 2) +
                Math.pow((y - y1), 2));
    }
}