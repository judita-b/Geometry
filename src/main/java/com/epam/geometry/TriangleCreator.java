package com.epam.geometry;

import com.epam.geometry.model.Point;
import com.epam.geometry.model.Triangle;

import java.lang.reflect.Array;
import java.util.Arrays;

// TODO: make this name more specific (according to your task)
public class TriangleCreator {

    public Triangle create(String line){
            String[] stringArray = line.split(" ");
            double[] doubles = Arrays.stream(stringArray).mapToDouble(Double::parseDouble).toArray();

            Point a = new Point(doubles[0], doubles[1]);
            Point b = new Point(doubles[2], doubles[3]);
            Point c = new Point(doubles[4], doubles[5]);

            return new Triangle(a, b, c);
    }
}
