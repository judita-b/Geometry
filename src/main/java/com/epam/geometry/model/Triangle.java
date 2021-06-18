package com.epam.geometry.model;

import java.util.Objects;

public class Triangle {

    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
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
        return Objects.equals(getA(), triangle.getA()) && Objects.equals(getB(), triangle.getB()) && Objects.equals(getC(), triangle.getC());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }
}
