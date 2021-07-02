package com.epam.geometry.logic;

import com.epam.geometry.model.Point;
import com.epam.geometry.model.Triangle;

import static java.lang.Math.*;

// TODO: make this name more specific (according to your task)
public class TriangleLogic {

    public double calculateArea(Triangle triangle) {
        Point pointA = triangle.getPointA();
        Point pointB = triangle.getPointB();
        Point pointC = triangle.getPointC();

        double area = abs((pointA.getCoordinateX() * pointB.getCoordinateY() + pointB.getCoordinateX() *  pointC.getCoordinateY() + pointC.getCoordinateX() * pointA.getCoordinateY()
                - pointA.getCoordinateY() * pointB.getCoordinateX() - pointB.getCoordinateY() * pointC.getCoordinateX() - pointC.getCoordinateY() * pointA.getCoordinateX())/2);
        return area;
    }

    public double calculatePerimeter(Triangle triangle) {
        Point pointA = triangle.getPointA();
        Point pointB = triangle.getPointB();
        Point pointC = triangle.getPointC();

        double abTriangleSide = sqrt(Math.pow(pointB.getCoordinateX() - pointA.getCoordinateX(), 2) + Math.pow(pointB.getCoordinateY() - pointA.getCoordinateY(), 2));
        double bcTriangleSide = sqrt(Math.pow(pointC.getCoordinateX() - pointB.getCoordinateX(), 2) + Math.pow(pointC.getCoordinateY() - pointB.getCoordinateY(), 2));;
        double caTriangleSide = sqrt(Math.pow(pointA.getCoordinateX() - pointC.getCoordinateX(), 2) + Math.pow(pointA.getCoordinateY() - pointC.getCoordinateY(), 2));;

        double perimeter = abTriangleSide + bcTriangleSide + caTriangleSide;
        return perimeter;
    }

    public boolean isTriangle(Triangle triangle) {
        Point pointA = triangle.getPointA();
        Point pointB = triangle.getPointB();
        Point pointC = triangle.getPointC();

        double area = abs((pointA.getCoordinateX() * pointB.getCoordinateY() + pointB.getCoordinateX() * pointC.getCoordinateY() + pointC.getCoordinateX() * pointA.getCoordinateY()
                - pointA.getCoordinateY() * pointB.getCoordinateX() - pointB.getCoordinateY() * pointC.getCoordinateX() - pointC.getCoordinateY() * pointA.getCoordinateX())/2);

        if (area == 0) {
            return false;
        } else {
            return true;
        }
    }
}
