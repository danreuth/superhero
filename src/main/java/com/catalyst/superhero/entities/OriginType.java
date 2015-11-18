package com.catalyst.superhero.entities;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Created by dan on 11/15/15.
 */
@Entity
public class OriginType extends BaseEntity {

    @NotNull
    private String originType;

    public String getOriginType() {
        return originType;
    }

    public void setOriginType(String originType) {
        this.originType = originType;
    }
}
