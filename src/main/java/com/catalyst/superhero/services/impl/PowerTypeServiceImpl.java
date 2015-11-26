package com.catalyst.superhero.services.impl;

import com.catalyst.superhero.daos.PowerTypeDao;
import com.catalyst.superhero.entities.PowerType;
import com.catalyst.superhero.services.PowerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dan on 11/26/15.
 */


@Service
public class PowerTypeServiceImpl implements PowerTypeService{

    @Autowired
    private PowerTypeDao powerTypeDao;

    public void setPowerTypeDao(PowerTypeDao powerTypeDao) {
        this.powerTypeDao = powerTypeDao;
    }

    public List<PowerType> getPowerTypes() {
        return powerTypeDao.getPowerTypes();
    }
}
