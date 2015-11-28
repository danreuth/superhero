package com.catalyst.superhero.services;

import com.catalyst.superhero.BaseTest;
import com.catalyst.superhero.daos.OriginTypeDao;
import com.catalyst.superhero.services.impl.OriginTypeServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by dan on 11/28/15.
 */
public class OriginTypeServiceImplTests extends BaseTest {

    private OriginTypeServiceImpl originTypeService;
    private OriginTypeDao mockOriginTypeDao;

    @Before
    public void setup() {
        originTypeService = new OriginTypeServiceImpl();
        mockOriginTypeDao = mock(OriginTypeDao.class);
        originTypeService.setOriginTypeDao(mockOriginTypeDao);
    }

    @Test
    public void powerServiceGetOriginTypesHappyPath() {
        originTypeService.getOriginTypes();
        verify(mockOriginTypeDao, times(1)).getOriginTypes();
    }
}
