package com.catalyst.superhero.daos;

import com.catalyst.superhero.BaseTest;
import com.catalyst.superhero.daos.hibernate.PowerDaoHibernate;
import com.catalyst.superhero.daos.hibernate.PowerTypeDaoHibernate;
import com.catalyst.superhero.entities.Power;
import com.catalyst.superhero.entities.PowerType;
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
 * Created by dan on 11/27/15.
 */
public class PowerTypeDaoHibernateTests extends BaseTest{

    private PowerTypeDaoHibernate target;

    private EntityManager mockEm;

    @Before
    public void setup() {
        target = new PowerTypeDaoHibernate();
        mockEm = mock(EntityManager.class);
        target.setEm(mockEm);
    }

    @Test
    public void testGetPowerTypes() {

        List<PowerType> expected = new ArrayList<PowerType>();

        TypedQuery<PowerType> mockTypedQuery = mock(TypedQuery.class);

        when(mockEm.createQuery(anyString(), eq(PowerType.class))).thenReturn(mockTypedQuery);
        when(mockTypedQuery.getResultList()).thenReturn(expected);

        target.getPowerTypes();

        verify(mockTypedQuery, times(1)).getResultList();

    }
}
