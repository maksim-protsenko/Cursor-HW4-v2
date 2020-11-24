package com.cursor.HW4;

import com.cursor.HW4.Geometry.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> vertices = new ArrayList<>(2);
        vertices.add(3.0);
        vertices.add(5.0);
        PlaneShape circle = new Circle(vertices, 50);

        vertices = new ArrayList<>(2);
        vertices.add(0.0);
        vertices.add(-5.0);
        PlaneShape rectangle = new Rectangle(vertices, 8, 6);

        vertices = new ArrayList<>(6);
        vertices.add(0.0);
        vertices.add(-6.0);
        vertices.add(5.0);
        vertices.add(7.0);
        vertices.add(5.0);
        vertices.add(10.0);
        PlaneShape triangle = new Triangle(vertices);

        vertices = new ArrayList<>(3);
        vertices.add(5.0);
        vertices.add(1.0);
        vertices.add(-2.0);
        SpaceShape sphere = new Sphere(vertices, 10);

        vertices = new ArrayList<>(3);
        vertices.add(6.0);
        vertices.add(-2.0);
        vertices.add(3.0);
        SpaceShape squarePyramid = new SquarePyramid(vertices, 5, 5);

        vertices = new ArrayList<>(3);
        vertices.add(5.0);
        vertices.add(3.0);
        vertices.add(1.0);
        SpaceShape cuboid = new Cuboid(vertices, 5, 5, 5);


        List<Shape> shapes2D3D = new ArrayList<>();
        shapes2D3D.add(circle);
        shapes2D3D.add(rectangle);
        shapes2D3D.add(triangle);
        shapes2D3D.add(sphere);
        shapes2D3D.add(squarePyramid);
        shapes2D3D.add(cuboid);

        for (Shape shapes : shapes2D3D) {
            System.out.println(shapes.toString());
        }

        //System.out.println("Distance between circle and rectangle is: " + circle.getDistanceBetween2Vertices(rectangle));
        //System.out.println("Distance between rectangle and triangle is: " + rectangle.getDistanceBetween2Vertices(triangle));
        //System.out.println("Distance between triangle and circle is: " + triangle.getDistanceBetween2Vertices(circle));
    }
}
