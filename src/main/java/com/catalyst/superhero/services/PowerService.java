package com.catalyst.superhero.services;

import com.catalyst.superhero.entities.Power;
import com.catalyst.superhero.exceptions.ValidationError;

import java.util.List;

/**
 * Created by dReuther on 11/7/2015.
 */
public interface PowerService {
    List<Power> getPowers();
    Power createPower(Power power) throws ValidationError;
    Power updatePower(Power power) throws ValidationError;
}
