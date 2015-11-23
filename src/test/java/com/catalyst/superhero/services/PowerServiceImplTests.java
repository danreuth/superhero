package com.catalyst.superhero.services;

import com.catalyst.superhero.BaseTest;
import com.catalyst.superhero.daos.PowerDao;
import com.catalyst.superhero.entities.Power;
import com.catalyst.superhero.entities.PowerType;
import com.catalyst.superhero.exceptions.ValidationError;
import com.catalyst.superhero.services.impl.PowerServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by dan on 11/22/15.
 */
public class PowerServiceImplTests extends BaseTest {

    private PowerServiceImpl powerService;
    private PowerDao mockPowerDao;
    @Before
    public void setup() {
        powerService = new PowerServiceImpl();
        mockPowerDao = mock(PowerDao.class);
        powerService.setPowerDao(mockPowerDao);
    }

    @Test
    public void powerServiceGetPowersHappyPath() {
        powerService.getPowers();
        verify(mockPowerDao, times(1)).getPowers();
    }

    // This test ends up using the real validation classes.
    // Should redesign validation so it can be inject and mocked
    // in these tests.
    @Test
    public void powerServiceCreatePowersHappyPath() {
        Power power = new Power();
        power.setName(VALID_POWER_NAME_STRING);
        power.setDescription(VALID_POWER_DESCRIPTION_STRING);
        PowerType powerType = new PowerType();
        powerType.setPowerType(VALID_POWER_TYPE_STRING);
        power.setPowerType(powerType);
        try {
            powerService.createPower(power);
        } catch (ValidationError e){

        }
        verify(mockPowerDao, times(1)).createPower(power);
    }

    // This test should probably be reworked to deal with the
    // exception better.
    @Test
    public void powerServiceCreatePowersFailurePath() {
        Power power = new Power();
        power.setName(INVALID_POWER_NAME_STRING);
        power.setDescription(VALID_POWER_DESCRIPTION_STRING);
        PowerType powerType = new PowerType();
        powerType.setPowerType(VALID_POWER_TYPE_STRING);
        power.setPowerType(powerType);
        try {
            powerService.createPower(power);
        } catch (ValidationError e) {

        }
        verify(mockPowerDao, times(0)).createPower(power);
    }

    @Test
    public void powerServiceUpdatePowersHappyPath() {
        Power power = new Power();
        power.setName(VALID_POWER_NAME_STRING);
        power.setDescription(VALID_POWER_DESCRIPTION_STRING);
        PowerType powerType = new PowerType();
        powerType.setPowerType(VALID_POWER_TYPE_STRING);
        power.setPowerType(powerType);
        try {
            powerService.updatePower(power);
        } catch (ValidationError e){

        }
        verify(mockPowerDao, times(1)).updatePower(power);
    }

    // This test should probably be reworked to deal with the
    // exception better.
    @Test
    public void powerServiceUpdatePowersFailurePath() {
        Power power = new Power();
        power.setName(INVALID_POWER_NAME_STRING);
        power.setDescription(VALID_POWER_DESCRIPTION_STRING);
        PowerType powerType = new PowerType();
        powerType.setPowerType(VALID_POWER_TYPE_STRING);
        power.setPowerType(powerType);
        try {
            powerService.updatePower(power);
        } catch (ValidationError e) {

        }
        verify(mockPowerDao, times(0)).updatePower(power);
    }
}
