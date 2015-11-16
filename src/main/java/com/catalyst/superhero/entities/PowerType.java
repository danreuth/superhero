package com.catalyst.superhero.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by dReuther on 11/7/2015.
 */
@Entity
public class PowerType extends BaseEntity {

    @NotNull
    @Column(unique=true)
    String powerType;

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " powertype: " + this.powerType;
    }
}
