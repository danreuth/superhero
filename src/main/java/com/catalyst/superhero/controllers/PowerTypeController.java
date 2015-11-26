package com.catalyst.superhero.controllers;

import com.catalyst.superhero.entities.PowerType;
import com.catalyst.superhero.services.PowerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dan on 11/26/15.
 */
@RestController
public class PowerTypeController {

    @Autowired
    private PowerTypeService powerTypeService;

    @RequestMapping(value = "/powerTypes", method = RequestMethod.GET)
    public List<PowerType> getPowerTypes() {
        return powerTypeService.getPowerTypes();
    }
}
