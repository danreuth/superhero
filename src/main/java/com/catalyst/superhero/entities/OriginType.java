package com.catalyst.superhero.entities;

import com.catalyst.superhero.constants.entities.EntityConstants;
import com.catalyst.superhero.constants.regexes.RegExes;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by dan on 11/15/15.
 */
@Entity
public class OriginType extends BaseEntity {

    @NotNull
    @Column(unique = true)
    @Length(min = EntityConstants.MIN_ORIGIN_TYPE_LENGTH, max = EntityConstants.MAX_ORIGIN_TYPE_LENGTH)
    @Pattern(regexp = RegExes.ORIGIN_TYPE_REGEX)
    private String originType;

    public String getOriginType() {
        return originType;
    }

    public void setOriginType(String originType) {
        this.originType = originType;
    }
}
