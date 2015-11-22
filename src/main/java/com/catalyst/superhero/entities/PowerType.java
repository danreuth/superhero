package com.catalyst.superhero.entities;

import com.catalyst.superhero.com.catalyst.superhero.constants.entities.EntityConstants;
import com.catalyst.superhero.constants.regexes.RegExes;
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
    @Length(min = EntityConstants.MIN_POWER_TYPE_LENGTH, max = EntityConstants.MAX_POWER_TYPE_LENGTH)
    @Pattern(regexp = RegExes.POWER_TYPE_REGEX)
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
