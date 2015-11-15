package com.catalyst.superhero.daos.hibernate;

import com.catalyst.superhero.daos.PowerDao;
import com.catalyst.superhero.entities.Power;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by dReuther on 11/7/2015.
 */
@Repository
@Transactional
public class PowerDaoHibernate implements PowerDao {

    @PersistenceContext
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<Power> getPowers() {
        return em.createQuery("SELECT p FROM Power p", Power.class).
                getResultList();
    }

    public Power createPower(Power power) {

        em.persist(power);
        return power;
    }

    public Power updatePower(Power power) {

        return em.merge(power);
    }
}
