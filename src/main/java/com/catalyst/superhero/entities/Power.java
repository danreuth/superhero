package com.catalyst.superhero.entities;

import com.catalyst.superhero.com.catalyst.superhero.constants.entities.EntityConstants;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by dReuther on 11/7/2015.
 */
@Entity
public class Power extends BaseEntity {

    @NotNull
    @Size(min = EntityConstants.MIN_POWER_NAME_LENGTH, max = EntityConstants.MAX_POWER_NAME_LENGTH)
    String name;

    @NotNull
    @ManyToOne(cascade = CascadeType.MERGE)
    PowerType powerType;

    @NotNull
    @Size(min = EntityConstants.MIN_POWER_DESCRIPTION_LENGTH, max = EntityConstants.MAX_POWER_DESCRIPTION_LENGTH)
    String description;

    public PowerType getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerType powerType) {
        this.powerType = powerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " name: " + this.name + " powertype: " + this.powerType
                + " description: " + this.description;
    }
}
