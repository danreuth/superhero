package com.catalyst.superhero.validators;

import com.catalyst.superhero.constants.regexes.RegExes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by dan on 11/21/15.
 */
public class ValidateStringsTests {

    public static final String STRING_WITH_ONLY_ALPHA_AND_NUMERIC = "This is only alpha AND 888888";
    public static final String STRING_WITH_SPECIAL_CHARACTERS = "*&#@";
    public static final String STRING_LENGTH_10 = "abcdefghij";
    public static final String VALID_POWER_TYPE_STRING = "Movement";
    public static final String INVALID_POWER_TYPE_STRING = "movement";
    public static final String VALID_POWER_DESCRIPTION_STRING = "This is a valid string.!?,";
    public static final String INVALID_POWER_DESCRIPTION_STRING = "This is a valid string.!?,&&&&";
    public static final String VALID_POWER_NAME_STRING = "Rocket Flight 10";
    public static final String INVALID_POWER_NAME_STRING = "Rocket Flight 10*****";

    public static final int ZERO = 0;
    public static final int FIVE = 5;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int TWELVE = 12;
    public static final int FIFTEEN = 15;

    public ValidateStrings validateStrings;

    @Before
    public void setup() {
        validateStrings = new ValidateStrings();
    }

    @Test
    public void regexValidatorPowerNameHappyPath() {
        assertTrue(validateStrings.regexValidator(VALID_POWER_NAME_STRING,
                RegExes.POWER_NAME_REGEX));

    }

    @Test
    public void regexValidatorPowerNameFailingTest() {
        assertFalse(validateStrings.regexValidator(INVALID_POWER_NAME_STRING,
                RegExes.POWER_NAME_REGEX));

    }

    @Test
    public void regexValidatorPowerDescriptionHappyPath() {
        assertTrue(validateStrings.regexValidator(VALID_POWER_DESCRIPTION_STRING,
                RegExes.POWER_DESCRIPTION_REGEX));

    }

    @Test
    public void regexValidatorPowerDescriptionFailingTest() {
        assertFalse(validateStrings.regexValidator(INVALID_POWER_DESCRIPTION_STRING,
                RegExes.POWER_DESCRIPTION_REGEX));

    }

    @Test
    public void regexValidatorOnlyAlphaAndNumericHappyPath() {
        assertTrue(validateStrings.regexValidator(STRING_WITH_ONLY_ALPHA_AND_NUMERIC,
                RegExes.ONLY_ALPHA_AND_NUMERIC_REGEX));

    }

    @Test
    public void regexValidatorHasSpecialCharactersFailingTest() {
        assertFalse(validateStrings.regexValidator(STRING_WITH_SPECIAL_CHARACTERS,
                RegExes.ONLY_ALPHA_AND_NUMERIC_REGEX));

    }

    @Test
    public void regexValidatorPowerTypeHappyPath() {
        assertTrue(validateStrings.regexValidator(VALID_POWER_TYPE_STRING,
                RegExes.POWER_TYPE_REGEX));

    }

    @Test
    public void regexValidatorInvalidPowerType() {
        assertFalse(validateStrings.regexValidator(INVALID_POWER_TYPE_STRING,
                RegExes.POWER_TYPE_REGEX));

    }

    @Test
    public void stringLengthLimitHappyPath() {
        assertTrue(validateStrings.stringLengthLimit(STRING_LENGTH_10, ZERO, FIFTEEN));

    }

    @Test
    public void stringLengthLimitTooLong() {
        assertFalse(validateStrings.stringLengthLimit(STRING_LENGTH_10, ZERO, NINE));

    }

    @Test
    public void stringLengthLimitTooShort() {
        assertFalse(validateStrings.stringLengthLimit(STRING_LENGTH_10, TWELVE, FIFTEEN));

    }

    @Test
    public void stringLengthMaxEdgeCase() {
        assertTrue(validateStrings.stringLengthLimit(STRING_LENGTH_10, ZERO, TEN));

    }

    @Test
    public void stringLengthMinEdgeCase() {
        assertTrue(validateStrings.stringLengthLimit(STRING_LENGTH_10, TEN, FIFTEEN));

    }
}
