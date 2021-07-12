package com.epam.geometry.model;

import java.util.Objects;

public class Point {

    double coordinateX;
    double coordinateY;

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + coordinateX +
                ", y=" + coordinateY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return Double.compare(point.getCoordinateX(), getCoordinateX()) == 0 && Double.compare(point.getCoordinateY(), getCoordinateY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCoordinateX(), getCoordinateY());
    }
}
