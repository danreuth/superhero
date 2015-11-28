package com.catalyst.superhero.services.impl;

import com.catalyst.superhero.daos.OriginTypeDao;
import com.catalyst.superhero.entities.OriginType;
import com.catalyst.superhero.services.OriginTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dan on 11/28/15.
 */
@Service
public class OriginTypeServiceImpl implements OriginTypeService{

    @Autowired
    private OriginTypeDao originTypeDao;

    public void setOriginTypeDao(OriginTypeDao originTypeDao) {
        this.originTypeDao = originTypeDao;
    }

    public List<OriginType> getOriginTypes() {
        return originTypeDao.getOriginTypes();
    }
}
