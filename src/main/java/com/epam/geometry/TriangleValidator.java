package com.epam.geometry;

// TODO: make this name more specific (according to your task)
public class TriangleValidator {

    // Do validation using regexp
    // this method should not be long, just 1-2 lines
    // keep your line pattern as constant in this class

    private static final String PATTERN = "^(\\d+(\\.\\d+)?\\s*){6}$";

    public boolean validate(String line) {
        if (line.trim().matches(PATTERN)) { return true; }
        return false;
    }
}
