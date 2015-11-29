package com.catalyst.superhero.services;

import com.catalyst.superhero.BaseTest;
import com.catalyst.superhero.daos.HeroDao;
import com.catalyst.superhero.services.impl.HeroServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by dan on 11/28/15.
 */
public class HeroServiceImplTests extends BaseTest {

    private HeroServiceImpl heroService;
    private HeroDao mockHeroDao;

    @Before
    public void setup() {
        heroService = new HeroServiceImpl();
        mockHeroDao = mock(HeroDao.class);
        heroService.setHeroDao(mockHeroDao);
    }

    @Test
    public void heroServiceGetHeroesHappyPath() {
        heroService.getHeroes();
        verify(mockHeroDao, times(1)).getHeroes();
    }
}
