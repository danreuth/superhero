package com.catalyst.superhero.daos;

import com.catalyst.superhero.entities.PowerType;

/**
 * Created by dreuther on 11/11/2015.
 */
public interface PowerTypeDao {

    PowerType findPowerTypeById(int id);
}
