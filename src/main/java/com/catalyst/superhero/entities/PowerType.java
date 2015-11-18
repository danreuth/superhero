package com.catalyst.superhero.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Created by dReuther on 11/7/2015.
 */
@Entity
public class PowerType extends BaseEntity {

    @NotNull
    @Column(unique = true)
    @Length(min = 1, max = 100)
    @Pattern(regexp = "^[A-Z][a-z]*")

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
