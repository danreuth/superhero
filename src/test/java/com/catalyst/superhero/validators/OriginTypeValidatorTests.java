package com.catalyst.superhero.validators;

import com.catalyst.superhero.BaseTest;
import com.catalyst.superhero.com.catalyst.superhero.constants.entities.EntityConstants;
import com.catalyst.superhero.constants.regexes.RegExes;
import com.catalyst.superhero.entities.OriginType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by dan on 11/28/15.
 */
public class OriginTypeValidatorTests extends BaseTest {

    private OriginType originTypeToTest;
    private OriginTypeValidator originTypeValidator;
    private ValidateStrings mockValidateStrings;

    @Before
    public void setup() {
        originTypeToTest = new OriginType();
        originTypeValidator = new OriginTypeValidator(originTypeToTest);
        mockValidateStrings = mock(ValidateStrings.class);
        originTypeValidator.setValidateStrings(mockValidateStrings);

    }

    @Test
    public void validateOriginTypeHappyPath() {

        when(mockValidateStrings.regexValidator(null, RegExes.ORIGIN_TYPE_REGEX)).thenReturn(true);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_ORIGIN_TYPE_LENGTH,
                EntityConstants.MAX_ORIGIN_TYPE_LENGTH)).thenReturn(true);
        assertTrue(originTypeValidator.validate());

    }

    @Test
    public void validateOriginTypeInvalidOriginType() {

        when(mockValidateStrings.regexValidator(null, RegExes.ORIGIN_TYPE_REGEX)).thenReturn(false);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_ORIGIN_TYPE_LENGTH,
                EntityConstants.MAX_ORIGIN_TYPE_LENGTH)).thenReturn(true);
        assertFalse(originTypeValidator.validate());

    }
}
