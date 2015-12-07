package com.catalyst.superhero.validators;

import com.catalyst.superhero.constants.entities.EntityConstants;
import com.catalyst.superhero.constants.regexes.RegExes;
import com.catalyst.superhero.entities.PowerType;

/**
 * Created by dan on 11/21/15.
 */
public class PowerTypeValidator {

    private PowerType powerType;
    private ValidateStrings validateStrings;

    PowerTypeValidator(PowerType powerType) {
        this.powerType = powerType;
        validateStrings = new ValidateStrings();
    }

    public boolean validate() {
        return validateStrings.regexValidator(powerType.getPowerType(), RegExes.POWER_TYPE_REGEX) &&
                validateStrings.stringLengthLimit(powerType.getPowerType(),
                        EntityConstants.MIN_POWER_TYPE_LENGTH,
                        EntityConstants.MAX_POWER_TYPE_LENGTH);
    }

    public void setValidateStrings(ValidateStrings validateStrings) {
        this.validateStrings = validateStrings;
    }
}
