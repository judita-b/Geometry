package com.epam.geometry;

import com.epam.geometry.model.Triangle;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TriangleValidatorTest {

    @Test
    public void testValidateShouldValidateWhenInputLineValid() {
        String line = "1.0 2.0 3.0 4.0 5.0 6.0";

        TriangleValidator triangleValidator = new TriangleValidator();
        Boolean result = triangleValidator.validate(line);

        assertTrue(result);
    }

    @Test
    public void testValidateShouldNotValidateWhenInputLineNotValid() {
        String line = "1.0 2.0 3.0 4.0 5.0";

        TriangleValidator triangleValidator = new TriangleValidator();
        Boolean result = triangleValidator.validate(line);

        assertFalse(result);
    }
}
