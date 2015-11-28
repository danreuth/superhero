package com.catalyst.superhero.daos;

import com.catalyst.superhero.BaseTest;
import com.catalyst.superhero.daos.hibernate.HeroDaoHibernate;
import com.catalyst.superhero.entities.Hero;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

/**
 * Created by dan on 11/28/15.
 */
public class HeroDaoHibernateTests extends BaseTest {

    private HeroDaoHibernate target;
    private EntityManager mockEm;

    @Before
    public void setup() {
        target = new HeroDaoHibernate();
        mockEm = mock(EntityManager.class);
        target.setEm(mockEm);
    }

    @Test
    public void testGetPowers() {

        List<Hero> expected = new ArrayList<Hero>();

        TypedQuery<Hero> mockTypedQuery = mock(TypedQuery.class);

        when(mockEm.createQuery(anyString(), eq(Hero.class))).thenReturn(mockTypedQuery);
        when(mockTypedQuery.getResultList()).thenReturn(expected);

        target.getHeroes();

        verify(mockTypedQuery, times(1)).getResultList();

    }
}
