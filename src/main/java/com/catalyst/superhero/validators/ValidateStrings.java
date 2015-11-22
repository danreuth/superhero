package com.catalyst.superhero.validators;

import com.catalyst.superhero.constants.regexes.RegExes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dan on 11/21/15.
 */
public class ValidateStrings extends BaseValidator {

    public boolean noSpecialCharacters(String input) {
        Pattern regex = Pattern.compile(RegExes.ONLY_ALPHA_AND_NUMERIC_REGEX);
        Matcher matcher = regex.matcher(input);

        if(matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean regexValidator(String input, String regexString) {
        Pattern regex = Pattern.compile(regexString);
        Matcher matcher = regex.matcher(input);

        if(matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean stringLengthLimit(String input, int minLengthLimit, int maxLengthLimit) {
        if(input == null || input.length() < minLengthLimit || input.length() > maxLengthLimit) {
            return false;
        } else {
            return true;
        }
    }
}
