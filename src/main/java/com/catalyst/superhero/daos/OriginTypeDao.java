package com.catalyst.superhero.daos;

import com.catalyst.superhero.entities.OriginType;

import java.util.List;

/**
 * Created by dan on 11/28/15.
 */
public interface OriginTypeDao {

    List<OriginType> getOriginTypes();
}
