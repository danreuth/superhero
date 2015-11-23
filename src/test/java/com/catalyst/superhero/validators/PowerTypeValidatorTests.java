package com.catalyst.superhero.validators;

import com.catalyst.superhero.BaseTest;
import com.catalyst.superhero.com.catalyst.superhero.constants.entities.EntityConstants;
import com.catalyst.superhero.constants.regexes.RegExes;
import com.catalyst.superhero.entities.PowerType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by dan on 11/21/15.
 */
public class PowerTypeValidatorTests extends BaseTest {

    private PowerType powerTypeToTest;
    private PowerTypeValidator powerTypeValidator;
    private ValidateStrings mockValidateStrings;

    @Before
    public void setup() {
        powerTypeToTest = new PowerType();
        powerTypeValidator = new PowerTypeValidator(powerTypeToTest);
        mockValidateStrings = mock(ValidateStrings.class);
        powerTypeValidator.setValidateStrings(mockValidateStrings);

    }

    @Test
    public void validatePowerTypeHappyPath() {

        when(mockValidateStrings.regexValidator(null, RegExes.POWER_TYPE_REGEX)).thenReturn(true);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_POWER_TYPE_LENGTH,
                EntityConstants.MAX_POWER_TYPE_LENGTH)).thenReturn(true);
        assertTrue(powerTypeValidator.validate());

    }

    @Test
    public void validatePowerTypeInvalidPowerType() {

        when(mockValidateStrings.regexValidator(null, RegExes.POWER_TYPE_REGEX)).thenReturn(false);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_POWER_TYPE_LENGTH,
                EntityConstants.MAX_POWER_TYPE_LENGTH)).thenReturn(true);
        assertFalse(powerTypeValidator.validate());

    }
}
