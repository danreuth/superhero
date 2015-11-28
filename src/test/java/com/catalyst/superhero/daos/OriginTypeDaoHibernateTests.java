package com.catalyst.superhero.daos;

import com.catalyst.superhero.BaseTest;
import com.catalyst.superhero.daos.hibernate.OriginTypeDaoHibernate;
import com.catalyst.superhero.entities.OriginType;
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
public class OriginTypeDaoHibernateTests extends BaseTest {

    private OriginTypeDaoHibernate target;

    private EntityManager mockEm;

    @Before
    public void setup() {
        target = new OriginTypeDaoHibernate();
        mockEm = mock(EntityManager.class);
        target.setEm(mockEm);
    }

    @Test
    public void testGetOriginTypes() {

        List<OriginType> expected = new ArrayList<OriginType>();

        TypedQuery<OriginType> mockTypedQuery = mock(TypedQuery.class);

        when(mockEm.createQuery(anyString(), eq(OriginType.class))).thenReturn(mockTypedQuery);
        when(mockTypedQuery.getResultList()).thenReturn(expected);

        target.getOriginTypes();

        verify(mockTypedQuery, times(1)).getResultList();

    }
}
