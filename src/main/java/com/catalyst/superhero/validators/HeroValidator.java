package com.catalyst.superhero.validators;

import com.catalyst.superhero.com.catalyst.superhero.constants.entities.EntityConstants;
import com.catalyst.superhero.constants.regexes.RegExes;
import com.catalyst.superhero.entities.Hero;
import com.catalyst.superhero.entities.Power;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dan on 11/28/15.
 */
public class HeroValidator {

    private ValidateStrings validateStrings;
    private OriginTypeValidator originTypeValidator;
    private List<PowerValidator> powerValidators;
    private Hero hero;

    public HeroValidator(Hero hero) {
        this.hero = hero;
        validateStrings = new ValidateStrings();
        originTypeValidator = new OriginTypeValidator(hero.getOriginType());
        powerValidators = new ArrayList<PowerValidator>();
        for(Power power : hero.getPowers()) {
            powerValidators.add(new PowerValidator(power));
        }
    }

    public boolean validate() {
        return validatePowers() && validateHeroName(hero.getHeroName()) &&
                validateRealName(hero.getRealName()) &&
                validateCostumeImage(hero.getCostumeImage()) &&
                validateHeight(hero.getHeight()) && validateWeight(hero.getWeight()) &&
                originTypeValidator.validate();
    }

    private boolean validatePowers() {
        boolean isValid = true;
        for(PowerValidator powerValidator : powerValidators) {
            if(!powerValidator.validate()) {
                isValid = false;
            }
        }
        return isValid;
    }

    private boolean validateHeroName(String heroName) {
        return validateStrings.regexValidator(heroName, RegExes.HERO_NAME_REGEX) &&
                validateStrings.stringLengthLimit(heroName, EntityConstants.MIN_HERO_NAME_LENGTH,
                        EntityConstants.MAX_HERO_NAME_LENGTH);
    }

    private boolean validateRealName(String realName) {
        return validateStrings.regexValidator(realName, RegExes.HERO_NAME_REGEX) &&
                validateStrings.stringLengthLimit(realName, EntityConstants.MIN_HERO_NAME_LENGTH,
                        EntityConstants.MAX_HERO_NAME_LENGTH);
    }

    private boolean validateCostumeImage(String costumeImageURL) {
        if(costumeImageURL.length() == 0 ||
                validateStrings.regexValidator(costumeImageURL, RegExes.URL_REGEX)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validateHeight(int height) {
        return height > 0;
    }

    private boolean validateWeight(int weight) {
        return weight > 0;
    }

    public void setValidateStrings(ValidateStrings validateStrings) {
        this.validateStrings = validateStrings;
    }

    public void setOriginTypeValidator(OriginTypeValidator originTypeValidator) {
        this.originTypeValidator = originTypeValidator;
    }
}
