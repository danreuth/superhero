package com.catalyst.superhero.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by dReuther on 11/7/2015.
 */
@Entity
public class PowerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String powerType;
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
