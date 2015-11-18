package com.catalyst.superhero.services.impl;

import com.catalyst.superhero.daos.PowerDao;
import com.catalyst.superhero.daos.PowerTypeDao;
import com.catalyst.superhero.entities.Power;
import com.catalyst.superhero.entities.PowerType;
import com.catalyst.superhero.services.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dReuther on 11/7/2015.
 */
@Service
public class PowerServiceImpl implements PowerService {

    @Autowired
    private PowerDao powerDao;

    @Autowired
    private PowerTypeDao powerTypeDao;

    public void setPowerDao(PowerDao powerDao) {
        this.powerDao = powerDao;
    }

    public void setPowerTypeDao(PowerTypeDao powerTypeDao) {
        this.powerTypeDao = powerTypeDao;
    }

    public List<Power> getPowers() {
        return powerDao.getPowers();
    }

    public Power createPower(Power power) {

        return powerDao.createPower(power);
    }

    public Power updatePower(Power power) {
        System.out.println(power);

        PowerType pt = powerTypeDao.findPowerTypeById(power.getPowerType().getId());
        System.out.println(pt);
      //  if(powerTypeDao.findPowerTypeById(power.getPowerType().getId()) != null) {
            return powerDao.updatePower(power);
      //  } else {
      //      throw new DataIntegrityViolationException("Test Message");
      //  }

    }
}
