package com.epam.geometry;

import com.epam.geometry.data.DataException;
import com.epam.geometry.data.DataReader;
import com.epam.geometry.model.Point;
import com.epam.geometry.model.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Director {

    //TODO: uncomment
    private final DataReader reader;
    private final TriangleValidator validator;
    private final TriangleCreator creator;


    public Director(DataReader reader, TriangleValidator validator, TriangleCreator creator) {
        //TODO: inject you dependencies here
        this.reader = reader;
        this.validator = validator;
        this.creator = creator;
    }

    // Input file contains multiple lines, each line a geometry object
    // i.e. each line contains all necessary data to create object in a simple format like: 1.0 2.0 3.0
    // some line
    public List<Triangle> process(String filename) throws DataException {
        // Read lines from file
        // for each valid line create a geometry object (according to your task)

        List<Triangle> triangles = new ArrayList<Triangle>();
        List<String> lines = reader.readLines(filename);

        for (String line : lines) {
            if (validator.validate(line)) {
                triangles.add(creator.create(line));
            }
        }

        return triangles;
    }
}
