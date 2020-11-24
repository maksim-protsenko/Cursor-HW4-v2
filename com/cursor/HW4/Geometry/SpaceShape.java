package com.cursor.HW4.Geometry;

import com.cursor.HW4.Geometry.interfaces.AreaMeasurable;
import com.cursor.HW4.Geometry.interfaces.VolumeMeasurable;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(List<Double> vertices) {
        super(vertices);
    }

    @Override
    public List<Double> getVertices() {
        return super.getVertices();
    }
}
