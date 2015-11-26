package com.catalyst.superhero.daos.hibernate;

import com.catalyst.superhero.daos.PowerTypeDao;
import com.catalyst.superhero.entities.Power;
import com.catalyst.superhero.entities.PowerType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by dan on 11/26/15.
 */
@Repository
@Transactional
public class PowerTypeDaoHibernate implements PowerTypeDao {

    @PersistenceContext
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<PowerType> getPowerTypes() {
        return em.createQuery("SELECT pt FROM PowerType pt", PowerType.class).
                getResultList();
    }
}
