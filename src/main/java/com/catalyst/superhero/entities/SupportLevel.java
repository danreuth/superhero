package com.catalyst.superhero.entities;

import javax.persistence.Entity;

/**
 * Created by dan on 11/15/15.
 */
@Entity
public class SupportLevel extends BaseEntity {

    private String supportLevel;

    public String getSupportLevel() {
        return supportLevel;
    }

    public void setSupportLevel(String supportLevel) {
        this.supportLevel = supportLevel;
    }
}
