package com.catalyst.superhero.daos.hibernate;

import com.catalyst.superhero.daos.HeroDao;
import com.catalyst.superhero.entities.Hero;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by dan on 11/28/15.
 */
@Repository
@Transactional
public class HeroDaoHibernate implements HeroDao {

    @PersistenceContext
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<Hero> getHeroes() {
        return em.createQuery("SELECT h FROM Hero h", Hero.class).
                getResultList();
    }
}
