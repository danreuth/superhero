package com.catalyst.superhero.daos.hibernate;

import com.catalyst.superhero.daos.PowerTypeDao;
import com.catalyst.superhero.entities.PowerType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by dreuther on 11/11/2015.
 */
@Repository
@Transactional
public class PowerTypeDaoHibernate implements PowerTypeDao {

    @PersistenceContext
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public PowerType findPowerTypeById(int id) {
        try {
            return em
                    .createQuery("SELECT p FROM PowerType p WHERE p.id = :id", PowerType.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch(NoResultException e) {
            return null;
        }
    }

}
