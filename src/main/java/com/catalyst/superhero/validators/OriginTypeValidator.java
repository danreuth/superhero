package com.catalyst.superhero.validators;

import com.catalyst.superhero.com.catalyst.superhero.constants.entities.EntityConstants;
import com.catalyst.superhero.constants.regexes.RegExes;
import com.catalyst.superhero.entities.OriginType;

/**
 * Created by dan on 11/27/15.
 */

// Need unit tests
public class OriginTypeValidator {

    private OriginType originType;
    private ValidateStrings validateStrings;

    OriginTypeValidator(OriginType originType) {
        this.originType = originType;
        validateStrings = new ValidateStrings();
    }

    public boolean validate() {
        return validateStrings.regexValidator(originType.getOriginType(), RegExes.ORIGIN_TYPE_REGEX) &&
                validateStrings.stringLengthLimit(originType.getOriginType(),
                        EntityConstants.MIN_ORIGIN_TYPE_LENGTH,
                        EntityConstants.MAX_ORIGIN_TYPE_LENGTH);
    }

    public void setValidateStrings(ValidateStrings validateStrings) {
        this.validateStrings = validateStrings;
    }
}
