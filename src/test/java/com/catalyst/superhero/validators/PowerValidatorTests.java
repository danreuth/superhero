package com.catalyst.superhero.validators;

import com.catalyst.superhero.com.catalyst.superhero.constants.entities.EntityConstants;
import com.catalyst.superhero.constants.regexes.RegExes;
import com.catalyst.superhero.entities.Power;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by dan on 11/21/15.
 */
public class PowerValidatorTests {

    private Power powerToTest;
    private PowerValidator powerValidator;
    private ValidateStrings mockValidateStrings;
    private PowerTypeValidator mockPowerTypeValidator;

    @Before
    public void setup() {
        powerToTest = new Power();
        powerValidator = new PowerValidator(powerToTest);
        mockValidateStrings = mock(ValidateStrings.class);
        mockPowerTypeValidator = mock(PowerTypeValidator.class);
        powerValidator.setValidateStrings(mockValidateStrings);
        powerValidator.setPowerTypeValidator((mockPowerTypeValidator));

    }

    @Test
    public void validatePowerHappyPath() {

        when(mockValidateStrings.regexValidator(null, RegExes.ONLY_ALPHA_AND_NUMERIC_REGEX))
                .thenReturn(true);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_POWER_NAME_LENGTH,
                EntityConstants.MAX_POWER_NAME_LENGTH)).thenReturn(true);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_POWER_DESCRIPTION_LENGTH,
                EntityConstants.MAX_POWER_DESCRIPTION_LENGTH)).thenReturn(true);
        when(mockPowerTypeValidator.validate()).thenReturn(true);
        assertTrue(powerValidator.validate());

    }

    @Test
    public void validatePowerInvalidPowerName() {

        when(mockValidateStrings.regexValidator(null,RegExes.ONLY_ALPHA_AND_NUMERIC_REGEX))
                .thenReturn(false);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_POWER_NAME_LENGTH,
                EntityConstants.MAX_POWER_NAME_LENGTH)).thenReturn(true);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_POWER_DESCRIPTION_LENGTH,
                EntityConstants.MAX_POWER_DESCRIPTION_LENGTH)).thenReturn(true);
        when(mockPowerTypeValidator.validate()).thenReturn(true);
        assertFalse(powerValidator.validate());

    }

    @Test
    public void validatePowerInvalidPowerDescription() {

        when(mockValidateStrings.regexValidator(null, RegExes.ONLY_ALPHA_AND_NUMERIC_REGEX))
                .thenReturn(true);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_POWER_NAME_LENGTH,
                EntityConstants.MAX_POWER_NAME_LENGTH)).thenReturn(true);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_POWER_DESCRIPTION_LENGTH,
                EntityConstants.MAX_POWER_DESCRIPTION_LENGTH)).thenReturn(false);
        when(mockPowerTypeValidator.validate()).thenReturn(true);
        assertFalse(powerValidator.validate());

    }

    @Test
    public void validatePowerInvalidPowerType() {

        when(mockValidateStrings.regexValidator(null, RegExes.ONLY_ALPHA_AND_NUMERIC_REGEX))
                .thenReturn(true);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_POWER_NAME_LENGTH,
                EntityConstants.MAX_POWER_NAME_LENGTH)).thenReturn(true);
        when(mockValidateStrings.stringLengthLimit(null, EntityConstants.MIN_POWER_DESCRIPTION_LENGTH,
                EntityConstants.MAX_POWER_DESCRIPTION_LENGTH)).thenReturn(true);
        when(mockPowerTypeValidator.validate()).thenReturn(false);
        assertFalse(powerValidator.validate());

    }
}
