package com.catalyst.superhero.validators;

import com.catalyst.superhero.com.catalyst.superhero.constants.entities.EntityConstants;
import com.catalyst.superhero.constants.regexes.RegExes;
import com.catalyst.superhero.entities.Power;
import com.catalyst.superhero.entities.PowerType;

/**
 * Created by dan on 11/21/15.
 */
public class PowerValidator {

   private ValidateStrings validateStrings;
   private PowerTypeValidator powerTypeValidator;
   private Power power;

   public PowerValidator(Power power) {

       this.power = power;
       validateStrings = new ValidateStrings();
       powerTypeValidator = new PowerTypeValidator(power.getPowerType());
   }

   public boolean validate() {
       return validatePowerName(power.getName()) &&
               validatePowerDescription(power.getDescription()) &&
               powerTypeValidator.validate();
   }

   private boolean validatePowerName(String powerName) {
       return validateStrings.regexValidator(powerName, RegExes.POWER_NAME_REGEX) &&
               validateStrings.stringLengthLimit(powerName, EntityConstants.MIN_POWER_NAME_LENGTH,
                       EntityConstants.MAX_POWER_NAME_LENGTH);
   }

   private boolean validatePowerDescription(String powerDescription) {
        return validateStrings.regexValidator(powerDescription, RegExes.POWER_DESCRIPTION_REGEX) &&
                validateStrings.stringLengthLimit(powerDescription,EntityConstants.MIN_POWER_DESCRIPTION_LENGTH,
                EntityConstants.MAX_POWER_DESCRIPTION_LENGTH);
   }

   public void setValidateStrings(ValidateStrings validateStrings) {
       this.validateStrings = validateStrings;
   }

    public void setPowerTypeValidator(PowerTypeValidator powerTypeValidator) {
        this.powerTypeValidator = powerTypeValidator;
    }
}
