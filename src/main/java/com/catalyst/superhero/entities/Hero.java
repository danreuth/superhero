package com.catalyst.superhero.entities;

import com.catalyst.superhero.constants.entities.EntityConstants;
import com.catalyst.superhero.constants.regexes.RegExes;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Created by dan on 11/15/15.
 */
@Entity
public class Hero extends BaseEntity {

    @NotNull
    @Length(min = EntityConstants.MIN_HERO_NAME_LENGTH, max = EntityConstants.MAX_HERO_NAME_LENGTH)
    @Pattern(regexp = RegExes.HERO_NAME_REGEX)
    private String heroName;

    @NotNull
    @Length(min = EntityConstants.MIN_HERO_NAME_LENGTH, max = EntityConstants.MAX_HERO_NAME_LENGTH)
    @Pattern(regexp = RegExes.HERO_NAME_REGEX)
    private String realName;

    @NotNull
    @ManyToOne(cascade = CascadeType.MERGE)
    private OriginType originType;

    private String costumeImage;

    @NotNull
    private int height;

    @NotNull
    private int weight;

    @ManyToMany
    private List<Power> powers;

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public OriginType getOriginType() {
        return originType;
    }

    public void setOriginType(OriginType originType) {
        this.originType = originType;
    }

    public String getCostumeImage() {
        return costumeImage;
    }

    public void setCostumeImage(String costumeImage) {
        this.costumeImage = costumeImage;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Power> getPowers() {
        return powers;
    }

    public void setPowers(List<Power> powers) {
        this.powers = powers;
    }
}
