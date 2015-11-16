package com.catalyst.superhero.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by dReuther on 11/7/2015.
 */
@Entity
public class Power extends BaseEntity {

    @NotNull
    @Size(min = 1, max = 255)
    String name;

    @NotNull
    @ManyToOne(cascade = CascadeType.MERGE)
    PowerType powerType;

    @NotNull
    @Size(min = 1, max = 255)
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
