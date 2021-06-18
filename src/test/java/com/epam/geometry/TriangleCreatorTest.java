package com.epam.geometry;

import com.epam.geometry.model.Point;
import com.epam.geometry.model.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleCreatorTest {

    @Test
    public void testCreateShouldCreateTriangleWhenInputLineValid() {
        Point a = new Point(1.0, 2.0);
        Point b = new Point(3.0, 4.0);
        Point c = new Point(5.0, 6.0);

        Triangle expected = new Triangle(a, b, c);

        String line = "1.0 2.0 3.0 4.0 5.0 6.0";

        TriangleCreator creator = new TriangleCreator();
        Triangle result = creator.create(line);

        assertEquals(expected, result);
    }

}
