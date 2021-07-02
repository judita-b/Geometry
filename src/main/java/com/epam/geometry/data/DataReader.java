package com.epam.geometry.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {

    //TODO: implement this method using BufferedReader, do not throw original IOException, wrap it with your own
    public List<String> readLines(String fileName) throws DataException {

        List<String> lines = new ArrayList<String>();
        String line;

        try (FileReader fileReader = new FileReader(fileName);
            BufferedReader buffer = new BufferedReader(fileReader);) {

            while ((line = buffer.readLine()) != null) {
                lines.add(line);
            }

        } catch (FileNotFoundException e) {
            throw new DataException(String.format("File not found %s", fileName), e);
        } catch (IOException e) {
            throw new DataException(String.format("Input / Output exception %s", fileName), e);
        }

        return lines;
    }
}
