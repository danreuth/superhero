package com.catalyst.superhero.controllers;

import com.catalyst.superhero.entities.Power;
import com.catalyst.superhero.services.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dReuther on 11/7/2015.
 */
@RestController
public class PowerController {

    @Autowired
    private PowerService powerService;

    public void setPowerService(PowerService powerService) {
        this.powerService = powerService;
    }

    @RequestMapping(value = "/powers", method = RequestMethod.GET)
    public List<Power> getPowers() {
        return powerService.getPowers();
    }

    @RequestMapping(value = "/powers", method = RequestMethod.POST)
    public Power createPower(@RequestBody Power power) {
        System.out.println("Running Create Controller");
        return powerService.createPower(power);
    }

    @RequestMapping(value = "/powers", method = RequestMethod.PUT)
    public Power updatePower(@Validated @RequestBody Power power) {

        return powerService.updatePower(power);
    }
}
