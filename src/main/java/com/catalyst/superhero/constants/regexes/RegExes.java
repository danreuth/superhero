package com.catalyst.superhero.constants.regexes;

/**
 * Created by dan on 11/21/15.
 */
public class RegExes {
    public static final String ONLY_ALPHA_AND_NUMERIC_REGEX = "[A-Za-z0-9]+";
    public static final String POWER_TYPE_REGEX = "^[A-Z][a-z]*$";
    public static final String ORIGIN_TYPE_REGEX = "^[A-Z][a-z]*$";
    public static final String POWER_NAME_REGEX = "^[A-Za-z0-9 ]+$";
    public static final String POWER_DESCRIPTION_REGEX = "^[A-Za-z0-9.!,? ]+$";
    public static final String HERO_NAME_REGEX = "^[A-Z][A-za-z ]*$";
}
