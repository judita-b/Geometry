package com.epam.geometry;

import com.epam.geometry.data.DataException;
import com.epam.geometry.data.DataReader;
import com.epam.geometry.model.Point;
import com.epam.geometry.model.Triangle;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// Write tests using Mockito to mock dependencies
public class DirectorTest {

    @Test
    public void testProcessShouldRunNormallyWhenValidInput() throws DataException {

        Point a = new Point(1.0, 2.0);
        Point b = new Point(3.0, 4.0);
        Point c = new Point(5.0, 6.0);

        List<Triangle> expected = Arrays.asList(new Triangle(a, b, c));

        DataReader reader = mock(DataReader.class);
        when(reader.readLines(anyString())).thenReturn(Arrays.asList("1.0 2.0 3.0 4.0 5.0 6.0", "1.0 2.0 3.0 4.0 5.0"));

        TriangleValidator validator = new TriangleValidator();
        TriangleCreator creator = new TriangleCreator();

        Director director = new Director(reader, validator, creator);

        List<Triangle> result = director.process("file");

        assertEquals(expected, result);
    }

}
