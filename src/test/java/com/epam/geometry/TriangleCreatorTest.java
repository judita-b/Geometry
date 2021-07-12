package com.epam.geometry;

import com.epam.geometry.model.Point;
import com.epam.geometry.model.Triangle;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TriangleCreatorTest {

    @Test
    public void testCreateShouldCreateTriangleWhenInputLineValid() {
        Triangle expected = new Triangle(
                new Point(1.0, 2.0),
                new Point(3.0, 4.0),
                new Point(5.0, 6.0));

        String line = "1.0 2.0 3.0 4.0 5.0 6.0";

        TriangleCreator creator = new TriangleCreator();
        Triangle result = creator.create(line);

        assertEquals(expected, result);
    }

    @Test (expected = NumberFormatException.class)
    public void testCreateShouldCreateTriangleWhenInputLineInvalid() {
        String line = "1.0z 2.0 3.0 4.0 5.0 6.0";

        TriangleCreator creator = new TriangleCreator();
        Triangle result = creator.create(line);
    }

}
