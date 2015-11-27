angular.module('heroApp').value('validationValues', {
    POWER_NAME_MAX_LENGTH: 255,
    POWER_DESC_MAX_LENGTH: 255,

    POWER_NAME_REGEX: /^[A-Za-z0-9 ]+$/,
    POWER_DESC_REGEX: /^[A-Za-z0-9.!,? ]+$/
});