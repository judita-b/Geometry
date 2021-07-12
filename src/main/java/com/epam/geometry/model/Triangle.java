package com.epam.geometry.model;

import java.util.Objects;

public class Triangle {

    Point pointA;
    Point pointB;
    Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + pointA +
                ", b=" + pointB +
                ", c=" + pointC +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Triangle)) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return Objects.equals(getPointA(), triangle.getPointA()) && Objects.equals(getPointB(), triangle.getPointB()) && Objects.equals(getPointC(), triangle.getPointC());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPointA(), getPointB(), getPointC());
    }
}
