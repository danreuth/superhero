package com.catalyst.superhero.services.impl;

import com.catalyst.superhero.daos.PowerDao;
import com.catalyst.superhero.entities.Power;
import com.catalyst.superhero.exceptions.ValidationError;
import com.catalyst.superhero.services.PowerService;
import com.catalyst.superhero.validators.PowerValidator;
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

    public void setPowerDao(PowerDao powerDao) {
        this.powerDao = powerDao;
    }

    public List<Power> getPowers() {
        return powerDao.getPowers();
    }

    public Power createPower(Power power) throws ValidationError {
        PowerValidator powerValidator = new PowerValidator(power);
        if(powerValidator.validate()) {
            return powerDao.createPower(power);
        } else {
            throw new ValidationError("Invalid Power Object");
        }

    }

    public Power updatePower(Power power) throws ValidationError {
        PowerValidator powerValidator = new PowerValidator(power);
        if(powerValidator.validate()) {
            return powerDao.updatePower(power);
        } else {
            throw new ValidationError("Invalid Power Object");
        }

    }
}
