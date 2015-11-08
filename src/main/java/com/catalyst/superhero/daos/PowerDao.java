package com.catalyst.superhero.daos;

import com.catalyst.superhero.entities.Power;

import java.util.List;

/**
 * Created by dReuther on 11/7/2015.
 */
public interface PowerDao {
    List<Power> getPowers();
    Power createPower(Power power);
    Power updatePower(Power power);
}
