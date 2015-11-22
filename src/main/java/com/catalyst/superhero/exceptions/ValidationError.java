package com.catalyst.superhero.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by dan on 11/22/15.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationError extends Exception{

    public ValidationError (String message) {
        super(message);
    }
}
