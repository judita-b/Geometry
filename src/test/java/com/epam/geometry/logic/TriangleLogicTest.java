package com.epam.geometry.logic;

import com.epam.geometry.data.DataException;
import com.epam.geometry.model.Point;
import com.epam.geometry.model.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleLogicTest {

    @Test
    public void testCalculateAreaShouldCalculateWhenTriangle() {
        Point a = new Point(-5.0, -2.0);
        Point b = new Point(-2.0, -2.0);
        Point c = new Point(-5.0, 2.0);

        Triangle triangle = new Triangle(a, b, c);

        TriangleLogic triangleLogic = new TriangleLogic();

        double result = triangleLogic.calculateArea(triangle);
        assertEquals(6, result, 0.01);
    }

    @Test
    public void testCalculatePerimeterShouldCalculateWhenTriangle() {
        Point a = new Point(-5.0, -2.0);
        Point b = new Point(-2.0, -2.0);
        Point c = new Point(-5.0, 2.0);

        Triangle triangle = new Triangle(a, b, c);

        TriangleLogic triangleLogic = new TriangleLogic();

        double result = triangleLogic.calculatePerimeter(triangle);
        assertEquals(12, result, 0.01);
    }

    @Test
    public void testCheckIfTriangleShouldReturnTrueWhenTriangle() {
        Point a = new Point(-5.0, -2.0);
        Point b = new Point(-2.0, -2.0);
        Point c = new Point(-5.0, 2.0);

        Triangle triangle = new Triangle(a, b, c);

        TriangleLogic triangleLogic = new TriangleLogic();

        Boolean result = triangleLogic.checkIfTriangle(triangle);
        assertTrue(result);
    }

    @Test
    public void testCheckIfTriangleShouldReturnFalseWhenLine() {
        Point a = new Point(-1.0, -1.0);
        Point b = new Point(0.0, 0.0);
        Point c = new Point(1.0, 1.0);

        Triangle triangle = new Triangle(a, b, c);

        TriangleLogic triangleLogic = new TriangleLogic();

        Boolean result = triangleLogic.checkIfTriangle(triangle);
        assertFalse(result);
    }
}