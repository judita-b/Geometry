package com.epam.geometry.logic;

import com.epam.geometry.model.Point;
import com.epam.geometry.model.Triangle;

import java.util.Arrays;

// TODO: make this name more specific (according to your task)
public class TriangleLogic {

    public double calculateArea(Triangle triangle) {
        Point a = triangle.getA();
        Point b = triangle.getB();
        Point c = triangle.getC();

        double area = Math.abs((a.getX() * b.getY() + b.getX() *  c.getY() + c.getX() * a.getY()
                - a.getY() * b.getX() - b.getY() * c.getX() - c.getY() * a.getX())/2);
        return area;
    }

    public double calculatePerimeter(Triangle triangle) {
        Point a = triangle.getA();
        Point b = triangle.getB();
        Point c = triangle.getC();

        double ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        double bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));;
        double ca = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));;

        double perimeter = ab + bc + ca;
        return perimeter;
    }

    public boolean checkIfTriangle(Triangle triangle) {
        Point a = triangle.getA();
        Point b = triangle.getB();
        Point c = triangle.getC();

        double area = Math.abs((a.getX() * b.getY() + b.getX() * c.getY() + c.getX() * a.getY()
                - a.getY() * b.getX() - b.getY() * c.getX() - c.getY() * a.getX())/2);

        if (area == 0) {
            return false;
        } else {
            return true;
        }
    }
}
