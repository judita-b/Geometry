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

        List<Triangle> expected = Arrays.asList(new Triangle(
                new Point(1.0, 2.0),
                new Point(3.0, 4.0),
                new Point(5.0, 6.0)));

        DataReader reader = mock(DataReader.class);
        when(reader.readLines(anyString())).thenReturn(Arrays.asList("1.0z 2.0 3.0 4.0 5.0 6.0", "1.0 2.0 3.0 4.0 5.0"));

        TriangleValidator validator = new TriangleValidator();
        TriangleCreator creator = new TriangleCreator();

        Director director = new Director(reader, validator, creator);

        List<Triangle> result = director.process("file");

        assertEquals(expected, result);
    }

    @Test
    public void testProcessShouldRunNormallyWhenInvalidInput() throws DataException {

        List<Triangle> expected = Arrays.asList();

        DataReader reader = mock(DataReader.class);
        when(reader.readLines(anyString())).thenReturn(Arrays.asList("1.0 2.0 3.0 4.0 5.0 6.0", "1.0 2.0 4.0 5.0"));

        TriangleValidator validator = new TriangleValidator();
        TriangleCreator creator = new TriangleCreator();

        Director director = new Director(reader, validator, creator);

        List<Triangle> result = director.process("file");

        assertEquals(expected, result);
    }

}
