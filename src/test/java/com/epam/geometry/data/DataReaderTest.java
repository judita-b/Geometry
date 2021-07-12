package com.epam.geometry.data;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class DataReaderTest {

    @Test
    public void testReadLinesShouldReadWhenFileNotEmpty() throws DataException {
        DataReader dataReader = new DataReader();

        List<String> lines = dataReader.readLines("files/input.txt");

        assertEquals(7, lines.size());
    }

    @Test
    public void testReadLinesShouldReturnEmptyWhenFileEmpty() throws DataException {
        DataReader dataReader = new DataReader();

        List<String> lines = dataReader.readLines("files/inputEmpty.txt");

        assertEquals(0, lines.size());
    }

    @Test (expected = DataException.class)
    public void testReadLinesShouldReturnEmptyWhenFileNotFound() throws DataException {
        DataReader dataReader = new DataReader();

        List<String> lines = dataReader.readLines("files/noInputFile.txt");

        assertEquals(0, lines.size());
    }
}
