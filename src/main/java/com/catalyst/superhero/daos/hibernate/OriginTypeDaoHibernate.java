package com.catalyst.superhero.daos.hibernate;

import com.catalyst.superhero.daos.OriginTypeDao;
import com.catalyst.superhero.entities.OriginType;
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
public class OriginTypeDaoHibernate implements OriginTypeDao {

    @PersistenceContext
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<OriginType> getOriginTypes() {
        return em.createQuery("SELECT ot FROM OriginType ot", OriginType.class).
                getResultList();
    }
}
