package com.catalyst.superhero.daos;

import com.catalyst.superhero.BaseTest;
import com.catalyst.superhero.daos.hibernate.PowerDaoHibernate;
import com.catalyst.superhero.entities.Power;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by dreuther on 11/11/2015.
 */
public class PowerDaoHibernateTests extends BaseTest {

    private PowerDaoHibernate target;

    private EntityManager mockEm;

    @Before
    public void setup() {
        target = new PowerDaoHibernate();
        mockEm = mock(EntityManager.class);
        target.setEm(mockEm);
    }

    @Test
    public void testCreatePower() throws Exception {
        target.createPower(null);
        verify(mockEm, times(1)).merge(null);
    }

    @Test
    public void testGetPowers() {

        List<Power> expected = new ArrayList<Power>();

        TypedQuery<Power> mockTypedQuery = mock(TypedQuery.class);

        when(mockEm.createQuery(anyString(), eq(Power.class))).thenReturn(mockTypedQuery);
        when(mockTypedQuery.getResultList()).thenReturn(expected);

        target.getPowers();

        verify(mockTypedQuery, times(1)).getResultList();

    }

    @Test
    public void testUpdatePower() {
        Power expected = new Power();
        expected.setId(1);

        target.updatePower(expected);

        verify(mockEm, times(1)).merge(expected);
    }
}
