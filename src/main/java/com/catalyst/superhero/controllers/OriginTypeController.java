package com.catalyst.superhero.controllers;

import com.catalyst.superhero.entities.OriginType;
import com.catalyst.superhero.services.OriginTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dan on 11/28/15.
 */

@RestController
public class OriginTypeController {

    @Autowired
    private OriginTypeService originTypeService;

    @RequestMapping(value = "/originTypes", method = RequestMethod.GET)
    public List<OriginType> getOriginTypes() {
        return originTypeService.getOriginTypes();
    }
}
