package com.catalyst.superhero.entities;

import javax.persistence.*;

/**
 * Created by dan on 11/15/15.
 */
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
