package com.catalyst.superhero.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by dan on 11/15/15.
 */
@Entity
public class Team extends BaseEntity {

    private String name;
    private String headquarters;

    @ManyToOne
    private SupportLevel supportLevel;

    @OneToOne
    private Hero leader;

    @OneToMany
    private List<Hero> members;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public SupportLevel getSupportLevel() {
        return supportLevel;
    }

    public void setSupportLevel(SupportLevel supportLevel) {
        this.supportLevel = supportLevel;
    }

    public Hero getLeader() {
        return leader;
    }

    public void setLeader(Hero leader) {
        this.leader = leader;
    }

    public List<Hero> getMembers() {
        return members;
    }

    public void setMembers(List<Hero> members) {
        this.members = members;
    }
}
