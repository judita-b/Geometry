package com.epam.geometry;

import com.epam.geometry.model.Point;
import com.epam.geometry.model.Triangle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO: make this name more specific (according to your task)
public class TriangleCreator {

    public Triangle create(String line){
        String[] stringArray = line.split(" ");
        List<Double> doubles = new ArrayList<Double>();

        for (String string : stringArray) {
            doubles.add(new Double(string));
        }

        //double[] doubles = Arrays.stream(stringArray).mapToDouble(Double::parseDouble).toArray();

        Point a = new Point(doubles.get(0), doubles.get(1));
        Point b = new Point(doubles.get(2), doubles.get(3));
        Point c = new Point(doubles.get(4), doubles.get(5));

        return new Triangle(a, b, c);
    }
}
