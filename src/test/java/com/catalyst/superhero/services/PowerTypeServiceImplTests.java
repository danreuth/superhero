package com.catalyst.superhero.services;

import com.catalyst.superhero.BaseTest;
import com.catalyst.superhero.daos.PowerTypeDao;
import com.catalyst.superhero.services.impl.PowerTypeServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by dan on 11/27/15.
 */
public class PowerTypeServiceImplTests extends BaseTest{

    private PowerTypeServiceImpl powerTypeService;
    private PowerTypeDao mockPowerTypeDao;

    @Before
    public void setup() {
       powerTypeService = new PowerTypeServiceImpl();
       mockPowerTypeDao = mock(PowerTypeDao.class);
       powerTypeService.setPowerTypeDao(mockPowerTypeDao);
    }

    @Test
    public void powerServiceGetPowerTypesHappyPath() {
        powerTypeService.getPowerTypes();
        verify(mockPowerTypeDao, times(1)).getPowerTypes();
    }
}
